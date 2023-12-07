package Pages;

import HelpMethods.AlertMethod;
import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.WindowMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public WindowMethod windowMethod;
    public AlertMethod alertMethod;

    public FrameMethods frameMethods;
    public ElementMethods elementMethods;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        windowMethod = new WindowMethod(driver);
        alertMethod = new AlertMethod(driver);
        frameMethods = new FrameMethods(driver);
        elementMethods = new ElementMethods(driver);

    }
}
