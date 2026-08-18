package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.ProductDetailsPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductDetailsPageBase.class)
public class AndroidProductDetailsPage extends ProductDetailsPageBase {
    public AndroidProductDetailsPage(WebDriver driver) {
        super(driver);
    }
}