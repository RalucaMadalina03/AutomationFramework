package Pages.AlertFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

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
        alertOkButton.click();
        alertMethod.acceptAlert();

//        Alert alertOkButton = driver.switchTo().alert();
//        alertOkButton.accept();
    }
    public void interractAlertDelay(){
        alertDelayButton.click();
        alertMethod.acceptAlert();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay = driver.switchTo().alert();
//        alertDelay.accept();
    }
    public void interractAlertDismiss(){
        alertOkCancelButton.click();
        alertMethod.cancelAlert();

//        Alert alertConfirmation = driver.switchTo().alert();
//        alertConfirmation.dismiss();
    }

    public void interractAlertValue(String value){
        alertValueButton.click();
        alertMethod.feelAlert(value);

//        Alert alertValue = driver.switchTo().alert();
//        alertValue.sendKeys("value");
//        alertValue.accept();
    }

}
