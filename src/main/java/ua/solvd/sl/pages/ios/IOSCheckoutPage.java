package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.CheckoutPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutPageBase.class)
public class IOSCheckoutPage extends CheckoutPageBase {
    public IOSCheckoutPage(WebDriver driver) {
        super(driver);
    }
}