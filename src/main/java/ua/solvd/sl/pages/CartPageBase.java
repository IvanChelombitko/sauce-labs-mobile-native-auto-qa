package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.constants.Constants;

public abstract class CartPageBase extends BasePage {

    @FindBy(xpath = "//*[@text='YOUR CART' or @label='YOUR CART' or @name='YOUR CART']")
    protected ExtendedWebElement cartTitle;

    @ExtendedFindBy(accessibilityId = "test-REMOVE")
    protected ExtendedWebElement removeButton;

    @ExtendedFindBy(accessibilityId = "test-Item Title")
    protected ExtendedWebElement itemTitle;

    @ExtendedFindBy(accessibilityId = "test-CHECKOUT")
    protected ExtendedWebElement checkoutButton;

    public CartPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isCartTitlePresent() {
        return cartTitle.isElementPresent();
    }

    public void clickRemoveButton() {
        removeButton.click();
    }

    public boolean isItemPresentInCart() {
        return itemTitle.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }

    public CheckoutPageBase clickCheckoutButton() {
        checkoutButton.click();
        return initPage(getDriver(), CheckoutPageBase.class);
    }
}