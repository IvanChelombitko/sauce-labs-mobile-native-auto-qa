package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.HamburgerMenuPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HamburgerMenuPageBase.class)
public class AndroidHamburgerMenuPage extends HamburgerMenuPageBase {
    public AndroidHamburgerMenuPage(WebDriver driver) {
        super(driver);
    }
}