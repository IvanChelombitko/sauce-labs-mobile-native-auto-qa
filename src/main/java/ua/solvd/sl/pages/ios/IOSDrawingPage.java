package ua.solvd.sl.pages.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.DrawingPageBase;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DrawingPageBase.class)
public class IOSDrawingPage extends DrawingPageBase {
    public IOSDrawingPage(WebDriver driver) {
        super(driver);
    }
}