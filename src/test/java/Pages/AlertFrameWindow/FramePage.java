package Pages.AlertFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "sampleHeading")
    private WebElement frametext;



    public void interractFirstFrame(){
       frameMethods.switchToFrame("frame1");
        System.out.println(frametext.getText());
        frameMethods.switchMainFrame();
    }

    public void interractsecondframe(){
        frameMethods.switchToFrame("frame2");
        System.out.println(frametext.getText());

    }
}
