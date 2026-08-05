package ua.solvd.sl.util;

import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;

public class AuthUtils {
    private AuthUtils() {
    }

    public static ProductsPageCommon loginSuccessfully(LoginPageCommon loginPage, User user) {
        loginPage.typeUsername(user.getUsername());
        loginPage.typePassword(user.getPassword());
        return loginPage.clickLoginButton();
    }

    public static LoginPageCommon loginWithFailure(LoginPageCommon loginPage, User user) {
        loginPage.typeUsername(user.getUsername());
        loginPage.typePassword(user.getPassword());
        return loginPage.clickLoginButtonExpectingFailure();
    }
}