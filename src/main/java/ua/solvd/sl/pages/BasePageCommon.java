package ua.solvd.sl.pages;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class BasePageCommon extends AbstractPage {

    @FindBy(xpath = "//*[//*[normalize-space(@content-desc)='test-Menu' or normalize-space(@name)='test-Menu'] and //*[normalize-space(@content-desc)='test-Cart' or normalize-space(@name)='test-Cart']][1]")
    protected HeaderComponent header;

    public BasePageCommon(WebDriver driver) {
        super(driver);
    }

    public abstract HeaderComponent getHeader();
}