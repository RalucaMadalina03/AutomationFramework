package ShareData;

import Logger.LoggerUtility;
import ProprietyUtility.ProprietyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends ShareData {
    public HashMap<String, String> testData;
    public String testName;


    @BeforeMethod
    public void prepareEnviroment(){
        setup();
        testName = this.getClass().getSimpleName();
        ProprietyUtility proprietyUtility = new ProprietyUtility(testName);
        testData = proprietyUtility.getAllData();
        LoggerUtility.startTestCase(testName);
    }

    @AfterMethod
    public void clearEnviroment(){
        clear();
        LoggerUtility.endTestCase(testName);
    }
    @AfterSuite
    public void finnishArtifacts(){
        LoggerUtility.mergeLogsIntoOne();
    }
}
