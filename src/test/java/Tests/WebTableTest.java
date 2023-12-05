package Tests;

import Pages.Elements.ElementsPAge;
import Pages.HomePage;
import Pages.Elements.WebTablePage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTableTest extends ShareData {


    @Test

    public void test_method() {


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
        webTablePage.addnewentry(FirstNameValue, LastNameValue, emailValue, ageValue, salaryValue, departamentValue);
    }
}
