package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.WebviewSelectionPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WebviewSelectionPageBase.class)
public class IOSWebviewSelectionPage extends WebviewSelectionPageBase {
    public IOSWebviewSelectionPage(WebDriver driver) {
        super(driver);
    }
}