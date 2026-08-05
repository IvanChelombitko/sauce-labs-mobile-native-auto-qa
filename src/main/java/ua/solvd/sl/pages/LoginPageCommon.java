package ua.solvd.sl.pages;

import org.openqa.selenium.WebDriver;

public abstract class LoginPageCommon extends BasePage {
    public LoginPageCommon(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUsername(String username);

    public abstract void typePassword(String password);

    public abstract ProductsPageCommon clickLoginButton();

    public abstract LoginPageCommon clickLoginButtonExpectingFailure();

    public abstract String getErrorMessageText();

    public abstract boolean isUsernameInputReady();
}