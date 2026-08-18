package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.MenuItem;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.HamburgerMenuPageBase;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.pages.WebviewSelectionPageBase;
import ua.solvd.sl.service.UserService;

public class WebviewTest extends BaseTest {

    @Test(description = "TC-009")
    @MethodOwner(owner = "ivanchelombitko")
    public void testWebviewEnterUrlTextFieldPresence() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        ProductsPageBase productsPage = UserService.login(loginPage, User.STANDARD);
        Assert.assertTrue(productsPage.isProductGridPresent(), "Products page is not opened after login.");
        HamburgerMenuPageBase hamburgerMenuPage = productsPage.getHeader().clickHamburgerMenu();
        Assert.assertTrue(hamburgerMenuPage.isAllItemsButtonPresent(), "Hamburger menu is not opened.");
        WebviewSelectionPageBase webviewSelectionPage = (WebviewSelectionPageBase) hamburgerMenuPage.openMenuItem(MenuItem.WEBVIEW);
        Assert.assertTrue(webviewSelectionPage.isEnterUrlTextFieldPresent(), "Webview page is not opened.");
    }
}