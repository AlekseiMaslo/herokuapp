package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseUtils {

    public WebDriver driver;

    public void setupDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        String ci = System.getenv("CI");

        if ("true".equalsIgnoreCase(ci)) {
            options.addArguments(
                    "--headless=new",
                    "--disable-gpu",
                    "--no-sandbox",
                    "--disable-dev-shm-usage"
            );
        }

        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1920,1080));
    }

}
