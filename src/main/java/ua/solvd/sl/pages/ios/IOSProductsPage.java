package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.ProductsPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductsPageBase.class)
public class IOSProductsPage extends ProductsPageBase {
    public IOSProductsPage(WebDriver driver) {
        super(driver);
    }
}