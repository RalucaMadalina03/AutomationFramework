package ShareData;

import Logger.LoggerUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {
    private WebDriver driver;

//    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoggerUtility.info("The browser was opened with succes");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
    }

//    @AfterMethod
    public void clear(){
        driver.quit();
        LoggerUtility.info("The browser was closed with succes");
    }

    public WebDriver getDriver() {
        return driver;
    }
}
