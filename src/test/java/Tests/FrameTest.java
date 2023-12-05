package Tests;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.FramePage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class FrameTest extends ShareData {


    @Test

    public void test_method() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();


        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickFrames();


        FramePage framePage = new FramePage(getDriver());
        framePage.interractFirstFrame();
        framePage.interractsecondframe();



    }
}
