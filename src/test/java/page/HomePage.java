package page;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "heading")
    private WebElement welcomeText;

    @FindBy(xpath = "//a[text()='Add/Remove Elements']")
    private WebElement addRemoveLink;

    public String getWelcomeText() {
        return welcomeText.getText();
    }

    public AddRemoveElementsPage clickOnAddRemoveLink() {
        addRemoveLink.click();

        return new AddRemoveElementsPage(getDriver());
    }
}
