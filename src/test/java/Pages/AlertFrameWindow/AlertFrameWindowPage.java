package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindowPage extends BasePage {

    public AlertFrameWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alerts;

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement frames;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindows;


    public void  clickAlerts(){
        alerts.click();
        LoggerUtility.info("The user clickes on alerts button");
    }



        public void clickFrames(){
            frames.click();
            LoggerUtility.info("The user clickes on frames button");
        }



    public void clickwindows(){
        browserWindows.click();
        LoggerUtility.info("The user clickes on browserWindows button");

    }


}
