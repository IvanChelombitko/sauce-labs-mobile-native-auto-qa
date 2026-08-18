package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.pages.ProductListItemComponent;
import ua.solvd.sl.pages.ProductsPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class AndroidProductsPage extends ProductsPageBase {

    @FindBy(xpath = "//android.view.ViewGroup[android.widget.TextView[@text='%s']]")
    private ExtendedWebElement sortingOptionAndroid;

    public AndroidProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void selectSortingOption(String option) {
        this.sortingOptionAndroid.format(option).click();
    }

    @Override
    public ProductListItemComponent getProductByName(String productName) {
        String locator = String.format(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".setMaxSearchSwipes(5)" +
                        ".scrollIntoView(new UiSelector().textContains(\"%s\"));",
                productName
        );
        try {
            getDriver().findElement(AppiumBy.androidUIAutomator(locator));
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Product '" + productName + "' not found after 5 swipes.", e);
        }
        return products.stream()
                .filter(product -> product.getProductTitleText().contains(productName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product '" + productName + "' exists in DOM, but component list couldn't map it."));
    }
}