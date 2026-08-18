package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

public class CompletePageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "THANK YOU FOR YOU ORDER")
    protected ExtendedWebElement thankYouTextBox;

    public CompletePageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isThankYouTextBoxPresent() {
        return thankYouTextBox.isPresent();
    }
}