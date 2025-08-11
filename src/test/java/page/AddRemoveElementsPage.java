package page;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddRemoveElementsPage extends BasePage {


    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    private WebElement addElementButton;

    private final By deleteButtonLocator = By.xpath("//button[@onclick='deleteElement()']");

    public AddRemoveElementsPage clickAddElementButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addElementButton)).click();

        return this;
    }

    public boolean isDeleteButtonDisplayed() {
        try {
            WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    deleteButtonLocator));
            return button.isDisplayed();
        } catch  (TimeoutException e) {
            return false;
        }
    }

    public boolean isDeleteButtonGone() {
        try {
            return wait.until(ExpectedConditions.invisibilityOfElementLocated(deleteButtonLocator));
        } catch (TimeoutException e) {
            return false;
        }
    }

    public AddRemoveElementsPage clickDeleteButton() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(deleteButtonLocator));
        button.click();
        return this;
    }
}
