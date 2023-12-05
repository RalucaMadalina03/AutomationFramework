package Pages;

import HelpMethods.AlertMethod;
import HelpMethods.WindowMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public WindowMethod windowMethod;
    public AlertMethod alertMethod;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        windowMethod = new WindowMethod(driver);
        alertMethod = new AlertMethod(driver);
        frameMethods = new FrameMethods(driver);
        fillElement = new fillElement(driver);

    }
}
