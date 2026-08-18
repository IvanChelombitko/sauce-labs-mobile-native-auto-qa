package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.ProductDetailsPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductDetailsPageBase.class)
public class IOSProductDetailsPage extends ProductDetailsPageBase {
    public IOSProductDetailsPage(WebDriver driver) {
        super(driver);
    }
}