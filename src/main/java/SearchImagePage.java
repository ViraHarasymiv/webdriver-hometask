import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchImagePage extends BasePage {
    public SearchImagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@jsname='Q4LuWd']")
    private List<WebElement> searchImages;

    public boolean imageTabContainsImages(){
        return !searchImages.isEmpty() && searchImages.size() != 1;
    }

}
