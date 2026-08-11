package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.HamburgerMenuComponent;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HamburgerMenuComponent.class)
public class AndroidHamburgerMenuComponent extends HamburgerMenuComponent {
    public AndroidHamburgerMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}