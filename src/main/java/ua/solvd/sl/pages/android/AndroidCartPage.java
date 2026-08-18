package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.CartPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartPageBase.class)
public class AndroidCartPage extends CartPageBase {
    public AndroidCartPage(WebDriver driver) {
        super(driver);
    }
}