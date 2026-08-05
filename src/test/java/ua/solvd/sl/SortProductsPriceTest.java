package ua.solvd.sl;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;
import ua.solvd.sl.util.AuthUtils;

public class SortProductsPriceTest extends  BaseTest {

    @Test
    public void testSortProductsPriceLowToHigh() {
        LoginPageCommon loginPage = initPage(getDriver(), LoginPageCommon.class);
        Assert.assertTrue(loginPage.isUsernameInputReady(), "Login page is not opened.");
        ProductsPageCommon productsPage = AuthUtils.loginSuccessfully(loginPage, User.STANDARD);
        productsPage.openSortingModal();
        productsPage.selectSortingOption("Price (low to high)");
        String firstProduct = productsPage.getFirstProductTitle();
        Assert.assertEquals(firstProduct, "Sauce Labs Onesie", "Products are not sorted correctly by price ascending.");
    }
}