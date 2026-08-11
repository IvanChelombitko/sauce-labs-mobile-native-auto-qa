package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.BasePageCommon;
import ua.solvd.sl.pages.HeaderComponent;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BasePageCommon.class)
public class AndroidBasePageCommon extends BasePageCommon {
    public AndroidBasePageCommon(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderComponent getHeader() {
        return header;
    }
}