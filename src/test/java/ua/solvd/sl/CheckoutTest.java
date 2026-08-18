package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.Product;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.CartPageBase;
import ua.solvd.sl.pages.CheckoutPageBase;
import ua.solvd.sl.pages.CompletePageBase;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.OverviewPageBase;
import ua.solvd.sl.pages.ProductListItemComponent;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.service.UserService;

public class CheckoutTest extends BaseTest {

    @Test(description = "TC-008")
    @MethodOwner(owner = "ivanchelombitko")
    public void testCheckoutFlow() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        ProductsPageBase productsPage = UserService.login(loginPage, User.STANDARD);
        Assert.assertTrue(productsPage.isProductGridPresent(), "Products page is not opened after login.");
        String productName = Product.JACKET.getTitle();
        ProductListItemComponent product = productsPage.getProductByName(productName);
        product.clickAddToCart();
        CartPageBase cartPage = productsPage.getHeader().clickCartIcon();
        Assert.assertTrue(cartPage.isCartTitlePresent(), "Cart screen is not opened.");
        CheckoutPageBase checkoutPage = cartPage.clickCheckoutButton();
        Assert.assertTrue(checkoutPage.isFirstNameFieldPresent(), "Checkout page is not opened.");
        OverviewPageBase overviewPage = UserService.fillUserData(checkoutPage, User.STANDARD);
        Assert.assertTrue(overviewPage.isFinishButtonPresent(), "Overview page is not opened.");
        CompletePageBase completePage = overviewPage.clickFinishButton();
        Assert.assertTrue(completePage.isThankYouTextBoxPresent(), "Complete page is not opened.");
    }
}