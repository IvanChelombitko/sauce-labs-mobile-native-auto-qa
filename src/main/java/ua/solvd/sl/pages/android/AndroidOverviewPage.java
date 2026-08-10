package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.OverviewPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = OverviewPageBase.class)
public class AndroidOverviewPage extends OverviewPageBase {
    public AndroidOverviewPage(WebDriver driver) {
        super(driver);
    }


}