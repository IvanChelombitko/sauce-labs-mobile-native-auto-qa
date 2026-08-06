package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.ProductsPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class AndroidProductsPage extends ProductsPageBase {
    public AndroidProductsPage(WebDriver driver) {
        super(driver);
    }
}