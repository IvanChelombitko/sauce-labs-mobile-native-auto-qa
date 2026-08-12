package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.sl.pages.BasePageCommon;
import ua.solvd.sl.pages.HeaderComponent;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BasePageCommon.class)
public class IOSPage extends BasePageCommon {

    @FindBy(xpath = "//*[//*[@name='test-Menu'] and //*[@name='test-Cart']][1]")
    private IOSHeaderComponent header;

    public IOSPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderComponent getHeader() {
        return header;
    }
}