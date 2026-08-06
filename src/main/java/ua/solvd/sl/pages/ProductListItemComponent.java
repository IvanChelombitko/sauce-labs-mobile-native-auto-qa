package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public class ProductListItemComponent extends AbstractUIObject {

    @ExtendedFindBy(accessibilityId = "test-Item title")
    private ExtendedWebElement productTitle;

    @ExtendedFindBy(accessibilityId = "test-ADD TO CART")
    private ExtendedWebElement addToCartButton;

    @ExtendedFindBy(accessibilityId = "test-REMOVE")
    private ExtendedWebElement removeButton;

    public ProductListItemComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getProductTitleText() {
        return productTitle.getText();
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickTitle() {
        productTitle.click();
    }

    public boolean isRemoveButtonPresent() {
        return removeButton.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }
}