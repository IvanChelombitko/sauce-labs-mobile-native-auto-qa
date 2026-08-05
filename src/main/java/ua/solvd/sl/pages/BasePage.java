package ua.solvd.sl.pages;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends AbstractPage implements IMobileUtils {
    public BasePage(WebDriver driver) {
        super(driver);
    }
}