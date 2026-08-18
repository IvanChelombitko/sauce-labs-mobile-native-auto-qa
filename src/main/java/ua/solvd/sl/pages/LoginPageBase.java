package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public abstract class LoginPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-Username")
    protected ExtendedWebElement usernameInput;

    @ExtendedFindBy(accessibilityId = "test-Password")
    protected ExtendedWebElement passwordInput;

    @ExtendedFindBy(accessibilityId = "test-LOGIN")
    protected ExtendedWebElement loginButton;

    @ExtendedFindBy(accessibilityId = "test-Error message")
    protected ExtendedWebElement errorMessage;

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public void typeUsername(String username) {
        usernameInput.type(username);
    }

    public void typePassword(String password) {
        passwordInput.type(password);
    }

    public ProductsPageBase clickLoginButton() {
        loginButton.click();
        return initPage(getDriver(), ProductsPageBase.class);
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    public boolean isUsernameInputPresent() {
        return usernameInput.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }
}