package ua.solvd.sl.pages;

import org.openqa.selenium.WebDriver;

public abstract class ProductsPageCommon extends BasePage {
    public ProductsPageCommon(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isCartIconVisible();

    public abstract boolean isProductGridVisible();

    public abstract void scrollToProduct(String productName);

    public abstract void clickAddToCartButton(String productName);

    public abstract String getProductActionBtnText(String productName);

    public abstract String getCartBadgeCount();

    public abstract CartPageCommon clickCartIcon();

    public abstract void openSortingModal();

    public abstract void selectSortingOption(String sortingOption);

    public abstract String getFirstProductTitle();

    public abstract ProductDetailsPageCommon clickProductTitle(String productName);
}