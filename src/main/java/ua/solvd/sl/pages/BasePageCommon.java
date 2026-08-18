package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BasePageCommon extends AbstractPage {
    protected BasePageCommon(WebDriver driver) {
        super(driver);
    }

    public abstract HeaderComponent getHeader();
}