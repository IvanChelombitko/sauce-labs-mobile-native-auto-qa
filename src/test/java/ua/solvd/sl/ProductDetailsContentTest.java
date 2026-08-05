package ua.solvd.sl;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.Product;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageCommon;
import ua.solvd.sl.pages.ProductDetailsPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;
import ua.solvd.sl.util.AuthUtils;

public class ProductDetailsContentTest extends BaseTest {

    @Test
    public void testProductDetailsContent() {
        LoginPageCommon loginPage = initPage(getDriver(), LoginPageCommon.class);
        Assert.assertTrue(loginPage.isUsernameInputReady(), "Login page is not opened.");
        ProductsPageCommon productsPage = AuthUtils.loginSuccessfully(loginPage, User.STANDARD);
        String productName = Product.JACKET.getTitle();
        productsPage.scrollToProduct(productName);
        ProductDetailsPageCommon detailsPage = productsPage.clickProductTitle(productName);
        Assert.assertTrue(detailsPage.isProductImageVisible(), "Product image is missing on details screen.");
        Assert.assertEquals(detailsPage.getProductTitleText(), productName, "Product title is incorrect.");
        Assert.assertEquals(detailsPage.getProductPriceText(), "$49.99", "Product price is incorrect.");
        Assert.assertTrue(detailsPage.isAddToCartButtonVisible(), "Add to cart button is missing on details screen.");
    }
}