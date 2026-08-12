package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.HamburgerMenuBasePage;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HamburgerMenuBasePage.class)
public class IOSHamburgerMenuBasePage extends HamburgerMenuBasePage {
    public IOSHamburgerMenuBasePage(WebDriver driver) {
        super(driver);
    }
}