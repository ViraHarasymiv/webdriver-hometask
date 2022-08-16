import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchField;

    public void printTextOnSearchField() {
        searchField.sendKeys("image");
    }

    public void clickEnter() {
        searchField.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = "//a[contains(@href, 'EQAw')]")
    private WebElement imageButton;

    public void clickOnImageButton() {
        imageButton.click();
    }
}
