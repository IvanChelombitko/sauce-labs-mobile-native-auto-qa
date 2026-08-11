package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class HamburgerMenuComponent extends AbstractUIObject {

    @ExtendedFindBy(accessibilityId = "test-RESET APP STATE")
    protected ExtendedWebElement resetAppStateButton;

    public HamburgerMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickResetAppStateButton() {
        resetAppStateButton.click();
    }
}