package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.OverviewPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = OverviewPageBase.class)
public class IOSOverviewPageBase extends OverviewPageBase {
    public IOSOverviewPageBase(WebDriver driver) {
        super(driver);
    }
}