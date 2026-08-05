package ua.solvd.sl;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.model.Product;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;
import ua.solvd.sl.util.AuthUtils;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        LoginPageCommon loginPage = initPage(getDriver(), LoginPageCommon.class);
        Assert.assertTrue(loginPage.isUsernameInputReady(), "Login page is not opened.");
        ProductsPageCommon productsPage = AuthUtils.loginSuccessfully(loginPage, User.STANDARD);
        String productTitle = Product.BACKPACK.getTitle();
        productsPage.scrollToProduct(productTitle);
        productsPage.clickAddToCartButton(productTitle);
        Assert.assertEquals(productsPage.getProductActionBtnText(productTitle), Constants.REMOVE_BUTTON_TEXT, "Button text did not change to 'REMOVE'.");
        Assert.assertEquals(productsPage.getCartBadgeCount(), Constants.CART_BADGE_ONE_ITEM, "Cart badge count is incorrect.");
    }
}