package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.service.UserService;

public class LoginSuccessTest extends BaseTest {

    @Test(description = "TC-001")
    @MethodOwner(owner = "ivanchelombitko")
    public void testLoginSuccessStandardUser() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        ProductsPageBase productsPage = UserService.login(loginPage, User.STANDARD);
        Assert.assertTrue(productsPage.getHeader().isCartIconPresent(), "Cart icon is not visible on Products screen.");
        Assert.assertTrue(productsPage.isProductGridPresent(), "Product grid is not visible on Products screen.");
    }
}