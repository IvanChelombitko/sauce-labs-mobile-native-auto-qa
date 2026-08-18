package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.model.MenuItem;
import ua.solvd.sl.model.Product;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.HamburgerMenuPageBase;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductListItemComponent;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.service.UserService;

public class ResetAppStateTest extends BaseTest {

    @Test(description = "TC-010")
    @MethodOwner(owner = "ivanchelombitko")
    public void testResetAppState() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        ProductsPageBase productsPage = UserService.login(loginPage, User.STANDARD);
        Assert.assertTrue(productsPage.isProductGridPresent(), "Products page is not opened after login.");
        String productTitle = Product.BACKPACK.getTitle();
        ProductListItemComponent product = productsPage.getProductByName(productTitle);
        product.clickAddToCart();
        Assert.assertEquals(productsPage.getHeader().getCartBadgeCount(), Constants.CART_BADGE_ONE_ITEM, "Cart badge count is incorrect.");
        HamburgerMenuPageBase hamburgerMenuPage = productsPage.getHeader().clickHamburgerMenu();
        Assert.assertTrue(hamburgerMenuPage.isAllItemsButtonPresent(), "Hamburger menu is not opened.");
        hamburgerMenuPage.openMenuItem(MenuItem.RESET_APP_STATE);
        Assert.assertTrue(productsPage.getHeader().isCartBadgeCountPresent(), "Cart badge count is incorrect.");
    }
}