package Tests;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.AlertPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class AlertTest extends ShareData {


    @Test

    public void test_method() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickAlerts();

        AlertPage alertPage = new AlertPage(getDriver());

         alertPage.interractAlertOK();

         alertPage.interractAlertDelay();

         alertPage.interractAlertDismiss();

         alertPage.interractAlertValue(" Acesta este un test ");



//        WebElement alertDelayButton = driver.findElement(By.id("timerAlertButton"));
//        alertDelayButton.click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alertDelay = driver.switchTo().alert();
//        alertDelay.accept();
//
//        WebElement alertOkCancelButton = driver.findElement(By.id("confirmButton"));
//        alertOkCancelButton.click();
//
//        Alert alertOkCancel = driver.switchTo().alert();
//        alertOkCancel.dismiss();
//
//        WebElement alertValueButton = driver.findElement(By.id("promtButton"));
//        alertValueButton.click();
//
//        Alert alertValue = driver.switchTo().alert();
//        alertValue.sendKeys("Text");
//        alertValue.accept();




    }
}