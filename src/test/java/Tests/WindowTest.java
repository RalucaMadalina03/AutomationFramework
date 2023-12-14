package Tests;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.HomePage;
import Pages.AlertFrameWindow.WindowsPage;
import ShareData.ShareData;

import org.testng.annotations.Test;

public class WindowTest extends ShareData {


    @Test

    public void test_method() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickwindows();

        WindowsPage windowsPage = new WindowsPage(getDriver());
        windowsPage.interrecttab();
        windowsPage.interractewindow();

    }
}
