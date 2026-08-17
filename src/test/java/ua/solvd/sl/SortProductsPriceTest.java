package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.constants.Constants;
import ua.solvd.sl.model.Product;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.service.UserService;

public class SortProductsPriceTest extends BaseTest {

    @Test(description = "TC-005")
    @MethodOwner(owner = "ivanchelombitko")
    public void testSortProductsPriceLowToHigh() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        ProductsPageBase productsPage = UserService.login(loginPage, User.STANDARD);
        Assert.assertTrue(productsPage.isProductGridPresent(), "Products page is not opened after login.");
        productsPage.openSortingModal();
        String priceSortOrder = Constants.PRICE_SORT_ORDER;
        productsPage.selectSortingOption(priceSortOrder);
        String firstProduct = productsPage.getFirstProductTitle();
        Assert.assertEquals(firstProduct, Product.ONESIE.getTitle(), "Products are not sorted correctly by price ascending.");
    }
}