package ua.solvd.sl.util;

import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.LoginPageBase;

public class LoginUtil {
    private LoginUtil() {
    }

    public static void login(LoginPageBase loginPage, User user) {
        loginPage.typeUsername(user.getUsername());
        loginPage.typePassword(user.getPassword());
        loginPage.clickLoginButton();
    }
}