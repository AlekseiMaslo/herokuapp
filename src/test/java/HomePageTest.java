import common.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;

public class HomePageTest extends BaseTest {

    private static final String WELCOME_TEXT = "Welcome to the-internet";


    @Test
    public void testHomePageWelcomeText() {
        String homePageWelcomeText = new HomePage(getDriver())
                .getWelcomeText();

        Assert.assertEquals(homePageWelcomeText, WELCOME_TEXT);
    }
}
