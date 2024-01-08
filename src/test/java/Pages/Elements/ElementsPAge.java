package Pages.Elements;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPAge extends BasePage {
    public ElementsPAge(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webtables;



    public void clickwebtables(){
        webtables.click();
        LoggerUtility.info("The user clicks on alertDelayButton");
    }




}
