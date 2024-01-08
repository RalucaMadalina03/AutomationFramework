package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BasePage {


    public WindowsPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    public void interrecttab(){
        newTabButton.click();
        LoggerUtility.info("The user clicks on interractTab button");


        windowMethod.switchtospecificWindow(1);
        LoggerUtility.info("The user switches to a new tab");

        windowMethod.clouseCurrentWindow();
        LoggerUtility.info("The user closes the current tab");

        windowMethod.switchtospecificWindow(0);
        LoggerUtility.info("The user switches back to the main tab");

//        System.out.println("url: " + driver.getCurrentUrl());
//        List<String> tabs =new ArrayList<>(driver.getWindowHandles()); // lista de tab-uri
//        driver.switchTo().window(tabs.get(1));
//        System.out.println("url: " + driver.getCurrentUrl());
//        driver.close();
//        driver.switchTo().window(tabs.get(0));
    }

    public void interractewindow(){
        newWindowButton.click();
        LoggerUtility.info("The user clicks on interractWindow button");

        windowMethod.switchtospecificWindow(1);
        LoggerUtility.info("The user switches to a new window");

        windowMethod.clouseCurrentWindow();
        LoggerUtility.info("The user closes the current window");

        windowMethod.switchtospecificWindow(0);
        LoggerUtility.info("The user switches back tot the main window");



//        System.out.println("url: " + driver.getCurrentUrl());
//        List<String> windows =new ArrayList<>(driver.getWindowHandles()); // lista de tab-uri
//        driver.switchTo().window(windows.get(1));
//        System.out.println("url: " + driver.getCurrentUrl());
//        driver.close();
//        driver.switchTo().window(windows.get(0));
    }


}
