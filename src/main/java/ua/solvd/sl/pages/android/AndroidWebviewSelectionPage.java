package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.WebviewSelectionPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebviewSelectionPageBase.class)
public class AndroidWebviewSelectionPage extends WebviewSelectionPageBase {
    public AndroidWebviewSelectionPage(WebDriver driver) {
        super(driver);
    }
}