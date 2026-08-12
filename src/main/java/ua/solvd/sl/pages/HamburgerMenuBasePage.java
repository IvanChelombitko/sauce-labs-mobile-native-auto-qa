package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public class HamburgerMenuBasePage extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-ALL ITEMS")
    protected ExtendedWebElement allItemsButton;

    @ExtendedFindBy(accessibilityId = "test-RESET APP STATE")
    protected ExtendedWebElement resetAppStateButton;

    @ExtendedFindBy(accessibilityId = "test-WEBVIEW")
    protected ExtendedWebElement webviewButton;

    public HamburgerMenuBasePage(WebDriver driver) {
        super(driver);
    }

    public boolean isAllItemsButtonPresent() {
        return allItemsButton.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }

    public void clickResetAppStateButton() {
        resetAppStateButton.click();
    }

    public WebviewSelectionPageBase clickWebviewButton() {
        webviewButton.click();
        return initPage(getDriver(), WebviewSelectionPageBase.class);
    }
}