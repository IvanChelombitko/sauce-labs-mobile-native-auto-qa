package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import ua.solvd.sl.constants.Constants;

public class DrawingPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-DRAWING-SCREEN")
    protected ExtendedWebElement drawingScreen;

    @ExtendedFindBy(image = "images/reference_line.png")
    protected ExtendedWebElement referenceDrawnImage;

    public DrawingPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isDrawingScreenPresent() {
        return drawingScreen.isPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }

    public void drawLine() {
        int startX = drawingScreen.getLocation().getX() + 100;
        int startY = drawingScreen.getLocation().getY() + 200;
        int endX = startX + 150;
        int endY = startY + 150;
        swipe(startX, startY, endX, endY, 1000);
    }

    public boolean isDrawingImagePresent() {
        return referenceDrawnImage.isElementPresent(Constants.DEFAULT_ELEMENT_TIMEOUT);
    }
}