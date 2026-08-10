package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.pages.CompletePageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CompletePageBase.class)
public class AndroidCompletePage extends CompletePageBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"THANK YOU FOR YOU ORDER\"]")
    private ExtendedWebElement thankYouTextBoxAndroid;

    public AndroidCompletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isThankYouTextBoxPresent() {
        return thankYouTextBoxAndroid.isPresent();
    }
}