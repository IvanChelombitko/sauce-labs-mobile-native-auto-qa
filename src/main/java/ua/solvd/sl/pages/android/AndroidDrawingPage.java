package ua.solvd.sl.pages.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.pages.DrawingPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DrawingPageBase.class)
public class AndroidDrawingPage extends DrawingPageBase {
    public AndroidDrawingPage(WebDriver driver) {
        super(driver);
    }
}