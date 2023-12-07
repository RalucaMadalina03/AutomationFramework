package HelpMethods;

import org.openqa.selenium.WebDriver;

public class FrameMethods {
    private WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToFrame(String value){
        driver.switchTo().frame(value);
    }
    public void switchMainFrame(){
        driver.switchTo().defaultContent();
    }
}
