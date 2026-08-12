package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.HamburgerMenuBasePage;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HamburgerMenuBasePage.class)
public class AndroidHamburgerMenuBasePage extends HamburgerMenuBasePage {
    public AndroidHamburgerMenuBasePage(WebDriver driver) {
        super(driver);
    }
}