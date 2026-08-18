package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.pages.CheckoutPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CheckoutPageBase.class)
public class AndroidCheckoutPage extends CheckoutPageBase {

    @FindBy(xpath = "//*[@content-desc='test-Error message']/android.widget.TextView")
    private ExtendedWebElement errorMessageAndroid;

    public AndroidCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getErrorMessageText() {
        return errorMessageAndroid.getText();
    }
}