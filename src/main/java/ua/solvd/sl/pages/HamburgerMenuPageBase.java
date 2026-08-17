package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.model.MenuItem;

public class HamburgerMenuPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "%s")
    protected ExtendedWebElement menuContent;

    public HamburgerMenuPageBase(WebDriver driver) {
        super(driver);
    }

    public BasePage getPage(MenuItem item) {
        return switch (item) {
            case DRAWING -> initPage(getDriver(), DrawingPageBase.class);
            case WEBVIEW -> initPage(getDriver(), WebviewSelectionPageBase.class);
            case RESET_APP_STATE -> this;
            default -> initPage(getDriver(), ProductsPageBase.class);
        };
    }

    public BasePage openMenuItem(MenuItem item) {
        menuContent.format(item.getAccessibilityId()).click();
        return getPage(item);
    }

    public boolean isAllItemsButtonPresent() {
        return menuContent.format(MenuItem.ALL_ITEMS.getAccessibilityId())
                .isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }
}