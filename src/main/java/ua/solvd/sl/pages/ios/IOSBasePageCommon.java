package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.BasePageCommon;
import ua.solvd.sl.pages.HeaderComponent;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BasePageCommon.class)
public class IOSBasePageCommon extends BasePageCommon {
    public IOSBasePageCommon(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderComponent getHeader() {
        return header;
    }
}