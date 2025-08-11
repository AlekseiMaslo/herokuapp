package common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest extends BaseUtils {

    @BeforeMethod
    public void beforeMethod() {
        setupDriver();

        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


    protected WebDriver getDriver() {
        return driver;
    }
}
