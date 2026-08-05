package ua.solvd.sl;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;
import ua.solvd.sl.util.AuthUtils;

public class LoginSuccessTest extends BaseTest {

    @Test
    public void testLoginSuccessStandardUser() {
        LoginPageCommon loginPage = initPage(getDriver(), LoginPageCommon.class);
        Assert.assertTrue(loginPage.isUsernameInputReady(), "Login page is not opened.");
        ProductsPageCommon productsPage = AuthUtils.loginSuccessfully(loginPage, User.STANDARD);
        Assert.assertTrue(productsPage.isCartIconVisible(), "Cart icon is not visible on Products screen.");
        Assert.assertTrue(productsPage.isProductGridVisible(), "Product grid is not visible on Products screen.");
    }
}