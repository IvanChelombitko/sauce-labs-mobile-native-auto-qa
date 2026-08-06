package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.LoginPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class AndroidLoginPage extends LoginPageBase {
    public AndroidLoginPage(WebDriver driver) {
        super(driver);
    }
}