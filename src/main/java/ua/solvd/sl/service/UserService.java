package ua.solvd.sl.service;

import ua.solvd.sl.model.User;
import ua.solvd.sl.pages.CheckoutPageBase;
import ua.solvd.sl.pages.LoginPageBase;
import ua.solvd.sl.pages.OverviewPageBase;
import ua.solvd.sl.pages.ProductsPageBase;

public class UserService {
    private UserService() {
    }

    public static ProductsPageBase login(LoginPageBase loginPage, User user) {
        loginPage.typeUsername(user.getUsername());
        loginPage.typePassword(user.getPassword());
        return loginPage.clickLoginButton();
    }

    public static OverviewPageBase fillUserData(CheckoutPageBase checkoutPage, User user) {
        checkoutPage.typeFirstName(user.getFirstName());
        checkoutPage.typeLastName(user.getLastName());
        checkoutPage.typeZipCode(user.getZipCode());
        return checkoutPage.clickContinueButton();
    }
}