package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.ProductDetailsPageCommon;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductDetailsPageCommon.class)
public class IOSProductDetailsPage extends ProductDetailsPageCommon {

    @ExtendedFindBy(accessibilityId = "test-Image Container")
    private ExtendedWebElement productImage;

    @ExtendedFindBy(accessibilityId = "test-Description")
    private ExtendedWebElement productDescription;

    @ExtendedFindBy(accessibilityId = "test-Price")
    private ExtendedWebElement productPrice;

    @ExtendedFindBy(accessibilityId = "test-ADD TO CART")
    private ExtendedWebElement addToCartButton;

    public IOSProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductImageVisible() {
        return productImage.isElementPresent();
    }

    @Override
    public String getProductTitleText() {
        return productDescription.getText();
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