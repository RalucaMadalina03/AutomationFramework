package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethod {
    private WebDriver driver;

    public AlertMethod(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public void acceptAlert(){
        waitForAlert();
        Alert alertOkButton = driver.switchTo().alert();
        alertOkButton.accept();
    }
    public void cancelAlert(){
        waitForAlert();
        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();
    }
    public void feelAlert(String value){
        waitForAlert();
        Alert alertValue = driver.switchTo().alert();
        alertValue.sendKeys(value);
        alertValue.accept();

    }
}
