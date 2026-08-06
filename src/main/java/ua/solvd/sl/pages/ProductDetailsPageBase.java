package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.constants.Constants;

public abstract class ProductDetailsPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-Image Container")
    protected ExtendedWebElement productImage;

    @FindBy(xpath = "//*[@content-desc='test-Description' or @name='test-Description']/*[1]")
    protected ExtendedWebElement productTitle;

    @ExtendedFindBy(accessibilityId = "test-Price")
    protected ExtendedWebElement productPrice;

    @ExtendedFindBy(accessibilityId = "test-ADD TO CART")
    protected ExtendedWebElement addToCartButton;

    public ProductDetailsPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isProductImagePresent() {
        return productImage.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }

    public String getProductTitleText() {
        return productTitle.getText();
    }

    public String getProductPriceText() {
        return productPrice.getText();
    }

    public boolean isAddToCartButtonPresent() {
        addToCartButton.scrollTo();
        return addToCartButton.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }
}