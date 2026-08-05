package ua.solvd.sl;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.Product;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.CartPageCommon;
import ua.solvd.sl.pages.LoginPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;
import ua.solvd.sl.util.AuthUtils;

public class RemovingProductFromCartTest extends BaseTest {

    @Test
    public void testRemoveProductFromCart() {
        LoginPageCommon loginPage = initPage(getDriver(), LoginPageCommon.class);
        Assert.assertTrue(loginPage.isUsernameInputReady(), "Login page is not opened.");
        ProductsPageCommon productsPage = AuthUtils.loginSuccessfully(loginPage, User.STANDARD);
        String productName = Product.BIKE.getTitle();
        productsPage.scrollToProduct(productName);
        productsPage.clickAddToCartButton(productName);
        CartPageCommon cartPage = productsPage.clickCartIcon();
        Assert.assertTrue(cartPage.isCartTitleVisible(), "Cart screen is not opened.");
        cartPage.clickRemoveButton(productName);
        Assert.assertFalse(cartPage.isItemPresentInCart(productName), "Item was not removed from cart.");
    }
}