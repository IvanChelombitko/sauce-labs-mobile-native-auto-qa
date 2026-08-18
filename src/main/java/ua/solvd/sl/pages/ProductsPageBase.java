package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

import java.util.List;
import java.util.Optional;

public abstract class ProductsPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-PRODUCTS")
    protected ExtendedWebElement productGrid;

    @ExtendedFindBy(accessibilityId = "test-Modal Selector Button")
    protected ExtendedWebElement sortingModalButton;

    @ExtendedFindBy(accessibilityId = "%s")
    protected ExtendedWebElement sortingOption;

    @ExtendedFindBy(accessibilityId = "test-Item")
    protected List<ProductListItemComponent> products;

    public ProductsPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isProductGridPresent() {
        return productGrid.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }

    public void openSortingModal() {
        sortingModalButton.click();
    }

    public void selectSortingOption(String option) {
        this.sortingOption.format(option).click();
    }

    public String getFirstProductTitle() {
        if (products.isEmpty()) {
            throw new RuntimeException("Product list is empty.");
        }
        return products.getFirst().getProductTitleText();
    }

    public ProductListItemComponent getProductByName(String productName) {
        int maxSwipes = 5;
        for (int i = 0; i < maxSwipes; i++) {
            Optional<ProductListItemComponent> targetProduct = products.stream()
                    .filter(product -> product.getProductTitleText().equals(productName))
                    .findFirst();
            if (targetProduct.isPresent()) {
                return targetProduct.get();
            }
            swipeUp(1000, 1);
        }
        throw new RuntimeException("Product with name '" + productName + "' not found after " + maxSwipes + " swipes.");
    }
}