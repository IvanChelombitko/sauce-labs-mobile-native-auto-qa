package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.pages.LoginPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class AndroidLoginPage extends LoginPageBase {

    @FindBy(xpath = "//*[@content-desc='test-Error message']/android.widget.TextView")
    private ExtendedWebElement errorMessageAndroid;

    public AndroidLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getErrorMessageText() {
        return errorMessageAndroid.getText();
    }
}