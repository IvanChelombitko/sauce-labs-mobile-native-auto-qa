package ua.solvd.sl.util;

import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.CheckoutPageBase;
import ua.solvd.sl.pages.LoginPageBase;

public class UserUtil {
    private UserUtil() {
    }

    public static void login(LoginPageBase loginPage, User user) {
        loginPage.typeUsername(user.getUsername());
        loginPage.typePassword(user.getPassword());
        loginPage.clickLoginButton();
    }

    public static void fillUserData(CheckoutPageBase checkoutPage, User user) {
        checkoutPage.typeFirstName(user.getFirstName());
        checkoutPage.typeLastName(user.getLastName());
        checkoutPage.typeZipCode(user.getZipCode());
        checkoutPage.clickContinueButton();
    }
}