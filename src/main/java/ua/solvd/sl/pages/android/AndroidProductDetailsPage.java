package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.ProductDetailsPageCommon;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductDetailsPageCommon.class)
public class AndroidProductDetailsPage extends ProductDetailsPageCommon {

    @ExtendedFindBy(accessibilityId = "test-Image Container")
    private ExtendedWebElement productImage;

    @ExtendedFindBy(accessibilityId = "test-Description")
    private ExtendedWebElement productDescription;

    @ExtendedFindBy(accessibilityId = "test-Price")
    private ExtendedWebElement productPrice;

    @ExtendedFindBy(accessibilityId = "test-ADD TO CART")
    private ExtendedWebElement addToCartButton;

    @ExtendedFindBy(accessibilityId = "test-Description")
    private ExtendedWebElement productTitle;

    public AndroidProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductImageVisible() {
        return productImage.isElementPresent();
    }

    @Override
    public String getProductTitleText() {
        return productTitle.getText();
    }

    @Override
    public String getProductDescriptionText() {
        return productDescription.getText();
    }

    @Override
    public String getProductPriceText() {
        return productPrice.getText();
    }

    @Override
    public boolean isAddToCartButtonVisible() {
        return addToCartButton.isElementPresent();
    }
}