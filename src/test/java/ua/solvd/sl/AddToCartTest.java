package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.model.Product;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductListItemComponent;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.service.UserService;

public class AddToCartTest extends BaseTest {

    @Test(description = "TC-003")
    @MethodOwner(owner = "ivanchelombitko")
    public void testAddProductToCart() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        ProductsPageBase productsPage = UserService.login(loginPage, User.STANDARD);
        Assert.assertTrue(productsPage.isProductGridPresent(), "Products page is not opened after login.");
        String productTitle = Product.BACKPACK.getTitle();
        ProductListItemComponent product = productsPage.getProductByName(productTitle);
        product.clickAddToCart();
        Assert.assertTrue(product.isRemoveButtonPresent(), "Add to Cart button did not change to Remove button.");
        Assert.assertEquals(productsPage.getHeader().getCartBadgeCount(), Constants.CART_BADGE_ONE_ITEM, "Cart badge count is incorrect.");
    }
}