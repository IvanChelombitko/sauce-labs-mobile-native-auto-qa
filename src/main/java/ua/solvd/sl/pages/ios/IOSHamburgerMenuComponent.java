package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.HamburgerMenuComponent;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HamburgerMenuComponent.class)
public class IOSHamburgerMenuComponent extends HamburgerMenuComponent {
    public IOSHamburgerMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}