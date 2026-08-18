package ua.solvd.sl.pages;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public abstract class HeaderComponent extends AbstractUIObject implements ICustomTypePageFactory, IMobileUtils {

    @ExtendedFindBy(accessibilityId = "test-Menu")
    protected ExtendedWebElement hamburgerMenuButton;

    @ExtendedFindBy(accessibilityId = "test-Cart")
    protected ExtendedWebElement cartIcon;

    public HeaderComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HamburgerMenuPageBase clickHamburgerMenu() {
        hamburgerMenuButton.click();
        return initPage(getDriver(), HamburgerMenuPageBase.class);
    }

    public boolean isCartIconPresent() {
        return cartIcon.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }

    public String getCartBadgeCount() {
        return cartIcon.getText();
    }

    public boolean isCartBadgeCountPresent() {
        return cartIcon.getText().isEmpty();
    }

    public CartPageBase clickCartIcon() {
        cartIcon.click();
        return initPage(getDriver(), CartPageBase.class);
    }
}