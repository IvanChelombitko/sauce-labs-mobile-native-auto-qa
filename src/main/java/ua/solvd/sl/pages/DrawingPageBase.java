package ua.solvd.sl.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.solvd.sl.constants.Constants;

import java.io.File;
import java.nio.file.Files;
import java.util.Base64;

public class DrawingPageBase extends BasePage {

    @ExtendedFindBy(accessibilityId = "test-DRAWING-SCREEN")
    protected ExtendedWebElement drawingScreen;

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

    public boolean verifyDrawingByImage() {
        try {
            File imageFile = new File("src/test/resources/images/reference_line.png");
            byte[] fileContent = Files.readAllBytes(imageFile.toPath());
            String base64Image = Base64.getEncoder().encodeToString(fileContent);
            WebElement element = getDriver().findElement(AppiumBy.image(base64Image));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}