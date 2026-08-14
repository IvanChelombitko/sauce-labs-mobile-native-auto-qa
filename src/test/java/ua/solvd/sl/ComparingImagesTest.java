package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.DrawingPageBase;
import ua.solvd.sl.pages.HamburgerMenuPageBase;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.util.UserService;

public class ComparingImagesTest extends BaseTest {

    @Test(description = "TC-011")
    @MethodOwner(owner = "ivanchelombitko")
    public void testComparingImages() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isUsernameInputPresent(), "Login page is not opened.");
        UserService.login(loginPage, User.STANDARD);
        ProductsPageBase productsPage = initPage(getDriver(), ProductsPageBase.class);
        Assert.assertTrue(productsPage.isProductGridPresent(), "Products page is not opened after login.");
        productsPage.getHeader().clickHamburgerMenu();
        HamburgerMenuPageBase hamburgerMenuPage = initPage(getDriver(), HamburgerMenuPageBase.class);
        Assert.assertTrue(hamburgerMenuPage.isAllItemsButtonPresent(), "Hamburger menu is not opened.");
        DrawingPageBase drawingPage = hamburgerMenuPage.clickDrawingButton();
        Assert.assertTrue(drawingPage.isDrawingScreenPresent(), "Drawing page is not opened.");
        drawingPage.drawLine();
        Assert.assertTrue(drawingPage.verifyDrawingByImage(), "Drawn image does not match the reference image.");
    }
}