package common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest extends BaseUtils {

    protected WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = setupDriver();

        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
