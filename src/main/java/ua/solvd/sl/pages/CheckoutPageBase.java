package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public class CheckoutPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-First Name")
    protected ExtendedWebElement firstNameField;

    @ExtendedFindBy(accessibilityId = "test-Last Name")
    protected ExtendedWebElement lastNameField;

    @ExtendedFindBy(accessibilityId = "test-Zip/Postal Code")
    protected ExtendedWebElement zipCodeField;

    @ExtendedFindBy(accessibilityId = "test-Error message")
    protected ExtendedWebElement errorMessage;

    @ExtendedFindBy(accessibilityId = "test-CONTINUE")
    protected ExtendedWebElement continueButton;

    public CheckoutPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isFirstNameFieldPresent() {
        return firstNameField.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }

    public OverviewPageBase clickContinueButton() {
        continueButton.click();
        return initPage(getDriver(), OverviewPageBase.class);
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    public void typeFirstName(String firstName) {
        firstNameField.type(firstName);
    }

    public void typeLastName(String lastName) {
        lastNameField.type(lastName);
    }

    public void typeZipCode(String zipCode) {
        zipCodeField.type(zipCode);
    }
}