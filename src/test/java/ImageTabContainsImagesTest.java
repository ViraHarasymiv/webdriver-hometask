import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class ImageTabContainsImagesTest extends BaseTest{

    @Test
    public void checkThatImageTabContainsImages(){
    getHomePage().printTextOnSearchField();
    getHomePage().clickEnter();
    getHomePage().waitForImageTubIsClickable(30);
    getHomePage().clickOnImageButton();
    getSearchImagePage().waitForPageLoadComplete(30);
    assertTrue(getSearchImagePage().imageTabContainsImages());
    }
}
