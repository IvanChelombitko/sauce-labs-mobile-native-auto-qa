package ua.solvd.sl;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.sl.model.MenuItem;
import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.DrawingPageBase;
import ua.solvd.sl.pages.HamburgerMenuPageBase;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.ProductsPageBase;
import ua.solvd.sl.service.UserService;

public class ComparingImagesTest extends BaseTest {

    @Test(description = "TC-011")
    @MethodOwner(owner = "ivanchelombitko")
    public void testComparingImages() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        ProductsPageBase productsPage = UserService.login(loginPage, User.STANDARD);
        HamburgerMenuPageBase hamburgerMenuPage = productsPage.getHeader().clickHamburgerMenu();
        DrawingPageBase drawingPage = (DrawingPageBase) hamburgerMenuPage.openMenuItem(MenuItem.DRAWING);
        drawingPage.drawLine();
        Assert.assertTrue(drawingPage.isDrawingImagePresent(), "Drawn image does not match the reference image.");
    }
}