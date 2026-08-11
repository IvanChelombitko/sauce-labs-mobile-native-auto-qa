package ua.solvd.sl.pages;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public class HeaderComponent extends AbstractUIObject {

    @ExtendedFindBy(accessibilityId = "test-Menu")
    protected ExtendedWebElement hamburgerMenuButton;

    @ExtendedFindBy(accessibilityId = "test-Cart")
    protected ExtendedWebElement cartIcon;

    public HeaderComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickMenu() {
        hamburgerMenuButton.click();
    }

    public boolean isCartIconPresent() {
        return cartIcon.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }

    public String getCartBadgeCount() {
        return cartIcon.getText();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }
}