package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.pages.BasePageCommon;
import ua.solvd.sl.pages.HeaderComponent;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BasePageCommon.class)
public class AndroidPage extends BasePageCommon {

    @FindBy(xpath = "//android.view.ViewGroup[.//android.view.ViewGroup[@content-desc='test-Menu'] and .//android.view.ViewGroup[@content-desc='test-Cart']][1]")
    private AndroidHeaderComponent header;

    public AndroidPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderComponent getHeader() {
        return header;
    }
}