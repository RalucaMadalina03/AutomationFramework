package Pages.Forms;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FormsPage extends BasePage {

    public FormsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (xpath = "//span[text()='Practice Form']")
    private WebElement practiceElement;


    public void clickForm(){
        practiceElement.click();
        LoggerUtility.info("The user clicks on practiceForms button");

    }

}
