package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowMethod {

  private WebDriver driver;

    public WindowMethod(WebDriver driver) {
        this.driver = driver;

    }
    public void  switchtospecificWindow(Integer size){
        List<String> tabs =new ArrayList<>(driver.getWindowHandles()); // lista de tab-uri
        driver.switchTo().window(tabs.get(size));
        System.out.println("url: " + driver.getCurrentUrl());
    }

    public void clouseCurrentWindow(){
        driver.close();
    }



}
