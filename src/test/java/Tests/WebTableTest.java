package Tests;

import ObjectData.FormTableObject;
import ObjectData.WebTableObject;
import Pages.Elements.ElementsPAge;


import Pages.HomePage;
import Pages.Elements.WebTablePage;
import ShareData.ShareData;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class WebTableTest extends Hooks {


    @Test

    public void test_method() {

        WebTableObject webTableObject = new WebTableObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickelements();

        ElementsPAge elementsPAge = new ElementsPAge(getDriver());
        elementsPAge.clickwebtables();

        String FirstNameValue = "Popescu";
        String LastNameValue = "Adrian";
        String emailValue = "popescu@gmail.com";
        String ageValue = "27";
        String salaryValue = "2500";
        String departamentValue = "2";

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(webTableObject);
    }
}
