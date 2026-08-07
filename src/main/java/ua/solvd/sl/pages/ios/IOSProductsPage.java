package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import ua.solvd.sl.pages.CartPageBase;
import ua.solvd.sl.pages.ProductsPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductsPageBase.class)
public class IOSProductsPage extends ProductsPageBase {
    public IOSProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CartPageBase clickCartIcon() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(cartIcon.getElement(), 25, 25).click().perform();
        return initPage(getDriver(), CartPageBase.class);
    }
}