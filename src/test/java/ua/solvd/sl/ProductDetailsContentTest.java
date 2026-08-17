package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.Product;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductDetailsPageBase;
import ua.solvd.sl.pages.ProductListItemComponent;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.service.UserService;

public class ProductDetailsContentTest extends BaseTest {

    @Test(description = "TC-006")
    @MethodOwner(owner = "ivanchelombitko")
    public void testProductDetailsAreDisplayedCorrectly() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        ProductsPageBase productsPage = UserService.login(loginPage, User.STANDARD);
        Assert.assertTrue(productsPage.isProductGridPresent(), "Products page is not opened after login.");
        String productName = Product.JACKET.getTitle();
        String productPrice = Product.JACKET.getPrice();
        ProductListItemComponent product = productsPage.getProductByName(productName);
        product.clickTitle();
        ProductDetailsPageBase detailsPage = initPage(getDriver(), ProductDetailsPageBase.class);
        Assert.assertTrue(detailsPage.isProductImagePresent(), "Product image is missing on details screen.");
        Assert.assertEquals(detailsPage.getProductTitleText(), productName, "Product title is incorrect.");
        Assert.assertEquals(detailsPage.getProductPriceText(), productPrice, "Product price is incorrect.");
        Assert.assertTrue(detailsPage.isAddToCartButtonPresent(), "Add to cart button is missing on details screen.");
    }
}