package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.CartPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartPageBase.class)
public class IOSCartPage extends CartPageBase {
    public IOSCartPage(WebDriver driver) {
        super(driver);
    }
}