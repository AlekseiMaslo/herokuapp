import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AddRemoveElementsPage;
import page.HomePage;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void testAddNewElement() {
        AddRemoveElementsPage addRemoveElementsPage = new HomePage(getDriver())
                .clickOnAddRemoveLink();

        boolean isDeleteButtonPresent = addRemoveElementsPage
                .clickAddElementButton()
                .isDeleteButtonDisplayed();
        Assert.assertTrue(isDeleteButtonPresent);

        boolean isDeleteButtonStillPresent = addRemoveElementsPage
                .clickDeleteButton()
                .isDeleteButtonDisplayed();
        Assert.assertFalse(isDeleteButtonStillPresent);
    }

}
