package ua.solvd.sl.pages;

import org.openqa.selenium.WebDriver;

public abstract class CartPageCommon extends BasePage {
    public CartPageCommon(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isCartTitleVisible();

    public abstract void clickRemoveButton(String productName);

    public abstract boolean isItemPresentInCart(String productName);

    public abstract boolean isCartBadgeEmpty();
}