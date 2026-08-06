package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.LoginPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class IOSLoginPage extends LoginPageBase {
    public IOSLoginPage(WebDriver driver) {
        super(driver);
    }
}