package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.pages.CartPageCommon;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartPageCommon.class)
public class AndroidCartPage extends CartPageCommon {

    @ExtendedFindBy(accessibilityId = "test-Cart")
    private ExtendedWebElement cartTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']/ancestor::android.view.ViewGroup[@content-desc='test-Item']//android.view.ViewGroup[@content-desc='test-REMOVE']")
    private ExtendedWebElement removeButtonBase;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement itemTitleBase;

    public AndroidCartPage(WebDriver driver) {
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