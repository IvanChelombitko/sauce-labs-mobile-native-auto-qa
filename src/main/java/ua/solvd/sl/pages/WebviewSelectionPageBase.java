package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public class WebviewSelectionPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-enter a https url here...")
    protected ExtendedWebElement enterUrlTextField;

    public WebviewSelectionPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isEnterUrlTextFieldPresent() {
        return enterUrlTextField.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }
}