package ua.solvd.sl.pages;

import org.openqa.selenium.WebDriver;

public abstract class ProductDetailsPageCommon extends BasePage {
    public ProductDetailsPageCommon(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductImageVisible();

    public abstract String getProductTitleText();

    public abstract String getProductDescriptionText();

    public abstract String getProductPriceText();

    public abstract boolean isAddToCartButtonVisible();
}