package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public class HamburgerMenuPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-ALL ITEMS")
    protected ExtendedWebElement allItemsButton;

    @ExtendedFindBy(accessibilityId = "test-RESET APP STATE")
    protected ExtendedWebElement resetAppStateButton;

    @ExtendedFindBy(accessibilityId = "test-WEBVIEW")
    protected ExtendedWebElement webviewButton;

    @ExtendedFindBy(accessibilityId = "test-DRAWING")
    protected ExtendedWebElement drawingButton;

    public HamburgerMenuPageBase(WebDriver driver) {
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

    public DrawingPageBase clickDrawingButton() {
        drawingButton.click();
        return initPage(getDriver(), DrawingPageBase.class);
    }
}