package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.pages.CartPageCommon;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartPageCommon.class)
public class IOSCartPage extends CartPageCommon {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@label='YOUR CART' or @name='YOUR CART']")
    private ExtendedWebElement cartTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='YOUR CART']/ancestor::XCUIElementTypeOther//XCUIElementTypeStaticText[@label='%1$s']/ancestor::XCUIElementTypeOther[@name='test-Item']//*[@name='test-REMOVE']")
    private ExtendedWebElement removeButtonBase;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@label='%s']")
    private ExtendedWebElement itemTitleBase;

    public IOSCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isCartTitleVisible() {
        return cartTitle.isElementPresent();
    }

    @Override
    public void clickRemoveButton(String productName) {
        removeButtonBase.format(productName).click();
    }

    @Override
    public boolean isItemPresentInCart(String productName) {
        return itemTitleBase.format(productName).isElementPresent(Constants.DEFAULT_TIMEOUT);
    }

    @Override
    public boolean isCartBadgeEmpty() {
        return !cartTitle.isElementPresent();
    }
}