package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
import ObjectData.AlertObject;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (id = "alertButton")
    private WebElement alertOkButton;

    @FindBy(id = "timerAllertButton")
    private WebElement alertDelayButton;

    @FindBy (id = "confirmButton")
    private WebElement alertOkCancelButton;

    @FindBy(id="promtButton")
    private WebElement alertValueButton;



    public void interractAlertOK(){
//        alertOkButton.click();
     //  alertMethod.acceptAlert();
        elementMethods.clickElement(alertOkButton);
        LoggerUtility.info("The user clicks on alertaOkButton");
        alertMethod.acceptAlert();
        LoggerUtility.info("The user clicks on acceptAlert");

//        Alert alertOkButton = driver.switchTo().alert();
//        alertOkButton.accept();
    }
    public void interractAlertDelay(){
        //alertDelayButton.click();


        elementMethods.clickElement(alertDelayButton);
        LoggerUtility.info("The user clicks on alertDelayButton");


       alertMethod.acceptAlert();
        LoggerUtility.info("The user clicks on acceptAlert");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay = driver.switchTo().alert();
//        alertDelay.accept();
    }
    public void interractAlertDismiss(){

        elementMethods.clickElement(alertOkCancelButton);
        LoggerUtility.info("The user clicks on confirmButton");

        alertMethod.cancelAlert();
        LoggerUtility.info("The user clicks on cancelAlert");


//        Alert alertConfirmation = driver.switchTo().alert();
//        alertConfirmation.dismiss();
    }

    public void interractAlertValue(AlertObject alertObject) {
//        alertValueButton.click();
//        alertMethod.feelAlert(value);}

        elementMethods.clickElement(alertValueButton);
        LoggerUtility.info("The user clicks on promtButton");

        alertMethod.feelAlert(alertObject.getPromptAlertValue());
        LoggerUtility.info("The user fills the PromptAlertValue" + alertValueButton);


//            alertObject.getPromptAlertValue();

//        Alert alertValue = driver.switchTo().alert();
//        alertValue.sendKeys("value");
//        alertValue.accept();
        }

}
