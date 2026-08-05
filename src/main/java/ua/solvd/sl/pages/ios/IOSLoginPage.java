package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.pages.LoginPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageCommon.class)
public class IOSLoginPage extends LoginPageCommon {

    @ExtendedFindBy(accessibilityId = "test-Username")
    private ExtendedWebElement usernameInput;

    @ExtendedFindBy(accessibilityId = "test-Password")
    private ExtendedWebElement passwordInput;

    @ExtendedFindBy(accessibilityId = "test-LOGIN")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='test-Error message']//XCUIElementTypeStaticText")
    private ExtendedWebElement errorMessage;

    public IOSLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeUsername(String username) {
        usernameInput.type(username);
    }

    @Override
    public void typePassword(String password) {
        passwordInput.type(password);
    }

    @Override
    public ProductsPageCommon clickLoginButton() {
        loginButton.click();
        return initPage(getDriver(), ProductsPageCommon.class);
    }

    @Override
    public LoginPageCommon clickLoginButtonExpectingFailure() {
        loginButton.click();
        return this;
    }

    @Override
    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    @Override
    public boolean isUsernameInputReady() {
        return usernameInput.isElementPresent(Constants.DEFAULT_TIMEOUT);
    }
}