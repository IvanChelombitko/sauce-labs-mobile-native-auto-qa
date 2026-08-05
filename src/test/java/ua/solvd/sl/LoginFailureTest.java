package ua.solvd.sl;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageCommon;
import ua.solvd.sl.util.AuthUtils;

public class LoginFailureTest extends BaseTest {

    @Test
    public void testLoginFailureLockedOutUser() {
        LoginPageCommon loginPage = initPage(getDriver(), LoginPageCommon.class);
        Assert.assertTrue(loginPage.isUsernameInputReady(), "Login page is not opened.");
        loginPage = AuthUtils.loginWithFailure(loginPage, User.LOCKED_OUT);
        Assert.assertEquals(loginPage.getErrorMessageText(), Constants.LOCKED_OUT_ERROR_MSG, "Error message text is incorrect or missing");
    }
}