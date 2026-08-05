package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.pages.CartPageCommon;
import ua.solvd.sl.pages.ProductDetailsPageCommon;
import ua.solvd.sl.pages.ProductsPageCommon;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductsPageCommon.class)
public class IOSProductsPage extends ProductsPageCommon {

    @ExtendedFindBy(accessibilityId = "test-Cart")
    private ExtendedWebElement cartIcon;

    @ExtendedFindBy(accessibilityId = "test-PRODUCTS")
    private ExtendedWebElement productGrid;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@label='%1$s' or @name='%1$s']")
    private ExtendedWebElement productTitleBase;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@label='%s']/ancestor::XCUIElementTypeOther[@name='test-Item']//XCUIElementTypeOther[@name='test-ADD TO CART']")
    private ExtendedWebElement addToCartBtnBase;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@label='%s']/ancestor::XCUIElementTypeOther[@name='test-Item']//XCUIElementTypeOther[@name='test-REMOVE']")
    private ExtendedWebElement actionBtnTextBase;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='test-Cart']//XCUIElementTypeOther")
    private ExtendedWebElement cartBadge;

    @ExtendedFindBy(accessibilityId = "test-Modal Selector Button")
    private ExtendedWebElement sortingModalButton;

    @FindBy(xpath = "//*[@name='%1$s' or @label='%1$s']")
    private ExtendedWebElement sortingOptionBase;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name='test-Item title'])[1]")
    private ExtendedWebElement firstProductTitle;

    public IOSProductsPage(WebDriver driver) {
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
        productTitleBase.format(productName).scrollTo();
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