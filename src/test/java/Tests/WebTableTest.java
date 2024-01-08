package Tests;

import ObjectData.WebTableObject;
import Pages.Elements.ElementsPAge;
import Pages.Elements.WebTablePage;
import Pages.HomePage;
import ShareData.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class WebTableTest extends Hooks {


    @Test

    public void test_method() {

        WebTableObject webTableObject = new WebTableObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickelements();


        JavascriptExecutor JS = (JavascriptExecutor) getDriver();
        JS.executeScript("window.scrollBy(0,450)", "");

        ElementsPAge elementsPAge = new ElementsPAge(getDriver());
        elementsPAge.clickwebtables();

//        String FirstNameValue = "Popescu";
//        String LastNameValue = "Adrian";
//        String emailValue = "popescu@gmail.com";
//        String ageValue = "27";
//        String salaryValue = "2500";
//        String departamentValue = "2";

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(webTableObject);
    }
}
