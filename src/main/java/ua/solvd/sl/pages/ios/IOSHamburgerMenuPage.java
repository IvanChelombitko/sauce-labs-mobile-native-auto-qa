package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.HamburgerMenuPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HamburgerMenuPageBase.class)
public class IOSHamburgerMenuPage extends HamburgerMenuPageBase {
    public IOSHamburgerMenuPage(WebDriver driver) {
        super(driver);
    }
}