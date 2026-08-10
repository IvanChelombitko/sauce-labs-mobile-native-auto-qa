package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

public class OverviewPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-FINISH")
    protected ExtendedWebElement finishButton;

    public OverviewPageBase(WebDriver driver) {
        super(driver);
    }

    private void swipeToFinishButton() {
        swipe(finishButton);
    }

    public boolean isFinishButtonPresent() {
        swipeToFinishButton();
        return finishButton.isPresent();
    }

    public CompletePageBase clickFinishButton() {
        swipeToFinishButton();
        finishButton.click();
        return initPage(getDriver(), CompletePageBase.class);
    }
}