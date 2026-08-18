package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.service.UserService;

public class LoginFailureTest extends BaseTest {

    @Test(description = "TC-002")
    @MethodOwner(owner = "ivanchelombitko")
    public void testLoginFailureLockedOutUser() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        UserService.login(loginPage, User.LOCKED_OUT);
        Assert.assertEquals(loginPage.getErrorMessageText(), Constants.LOCKED_OUT_ERROR_MSG, "Error message text is incorrect or missing.");
    }
}