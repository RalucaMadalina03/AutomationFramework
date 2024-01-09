package ShareData.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class ChromeBrowserService extends BaseBrowserService implements BrowserService{

    private WebDriver driver;

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public Object prepareBrowserOptions() {
       // ProprietyUtility proprietyUtility = new ProprietyUtility("Browser");
        HashMap<String,String> testData = getBrowserOptions();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments(testData.get("headless"));
        chromeOptions.addArguments(testData.get("gpu"));
        chromeOptions.addArguments(testData.get("infobars"));
        chromeOptions.addArguments(testData.get("sandbox"));
        chromeOptions.addArguments(testData.get("resolution"));
        return chromeOptions;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
