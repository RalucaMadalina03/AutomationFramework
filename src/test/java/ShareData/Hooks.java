package ShareData;

import ProprietyUtility.ProprietyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends ShareData {
    public HashMap<String, String> testData;
    @BeforeMethod
    public void prepareEnviroment(){
        setup();
        String testName = this.getClass().getSimpleName();
        ProprietyUtility proprietyUtility = new ProprietyUtility(testName);
        testData = proprietyUtility.getAllData();
    }
    @AfterMethod
    public void clearEnviroment(){
        clear();
    }
}
