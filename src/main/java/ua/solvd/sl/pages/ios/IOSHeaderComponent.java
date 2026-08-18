package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import ua.solvd.sl.pages.CartPageBase;
import ua.solvd.sl.pages.HamburgerMenuPageBase;
import ua.solvd.sl.pages.HeaderComponent;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HeaderComponent.class)
public class IOSHeaderComponent extends HeaderComponent {
    public IOSHeaderComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public HamburgerMenuPageBase clickHamburgerMenu() {
        int centerX = hamburgerMenuButton.getElement().getSize().getWidth() / 2;
        int centerY = hamburgerMenuButton.getElement().getSize().getHeight() / 2;
        new Actions(getDriver())
                .moveToElement(hamburgerMenuButton.getElement(), centerX, centerY)
                .click()
                .perform();
        return initPage(getDriver(), HamburgerMenuPageBase.class);
    }

    @Override
    public CartPageBase clickCartIcon() {
        int centerX = cartIcon.getElement().getSize().getWidth() / 2;
        int centerY = cartIcon.getElement().getSize().getHeight() / 2;
        new Actions(getDriver())
                .moveToElement(cartIcon.getElement(), centerX, centerY)
                .click()
                .perform();
        return initPage(getDriver(), CartPageBase.class);
    }
}