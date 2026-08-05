package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.pages.CartPageCommon;
import ua.solvd.sl.pages.ProductDetailsPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageCommon.class)
public class AndroidProductsPage extends ProductsPageCommon {

    @ExtendedFindBy(accessibilityId = "test-Cart")
    private ExtendedWebElement cartIcon;

    @ExtendedFindBy(accessibilityId = "test-PRODUCTS")
    private ExtendedWebElement productGrid;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement productTitleBase;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']/ancestor::android.view.ViewGroup[@content-desc='test-Item']//android.view.ViewGroup[@content-desc='test-ADD TO CART']")
    private ExtendedWebElement addToCartBtnBase;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']/ancestor::android.view.ViewGroup[@content-desc='test-Item']//android.view.ViewGroup[@content-desc='test-REMOVE']/android.widget.TextView")
    private ExtendedWebElement actionBtnTextBase;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']//android.widget.TextView")
    private ExtendedWebElement cartBadge;

    @ExtendedFindBy(accessibilityId = "test-Modal Selector Button")
    private ExtendedWebElement sortingModalButton;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement sortingOptionBase;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc='test-Item title'])[1]")
    private ExtendedWebElement firstProductTitle;

    public AndroidProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isCartIconVisible() {
        return cartIcon.isElementPresent();
    }

    @Override
    public boolean isProductGridVisible() {
        return productGrid.isElementPresent();
    }

    @Override
    public void scrollToProduct(String productName) {
        swipe(productTitleBase.format(productName));
    }

    @Override
    public void clickAddToCartButton(String productName) {
        addToCartBtnBase.format(productName).click();
    }

    @Override
    public String getProductActionBtnText(String productName) {
        return actionBtnTextBase.format(productName).getText();
    }

    @Override
    public String getCartBadgeCount() {
        return cartBadge.getText();
    }

    @Override
    public CartPageCommon clickCartIcon() {
        cartIcon.click();
        return initPage(getDriver(), CartPageCommon.class);
    }

    @Override
    public void openSortingModal() {
        sortingModalButton.click();
    }

    @Override
    public void selectSortingOption(String sortingOption) {
        sortingOptionBase.format(sortingOption).click();
    }

    @Override
    public String getFirstProductTitle() {
        return firstProductTitle.getText();
    }

    @Override
    public ProductDetailsPageCommon clickProductTitle(String productName) {
        productTitleBase.format(productName).click();
        return initPage(getDriver(), ProductDetailsPageCommon.class);
    }
}