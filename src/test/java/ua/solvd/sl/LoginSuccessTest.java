package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.util.UserUtil;

public class LoginSuccessTest extends BaseTest {

    @Test
    @MethodOwner(owner = "ivanchelombitko")
    public void testLoginSuccessStandardUser() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        UserUtil.login(loginPage, User.STANDARD);
        ProductsPageBase productsPage = initPage(getDriver(), ProductsPageBase.class);
        Assert.assertTrue(productsPage.getHeader().isCartIconPresent(), "Cart icon is not visible on Products screen.");
        Assert.assertTrue(productsPage.isProductGridPresent(), "Product grid is not visible on Products screen.");
    }
}