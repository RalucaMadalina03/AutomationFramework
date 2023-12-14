package Pages.Elements;

import ObjectData.WebTableObject;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.List;



public class WebTablePage extends BasePage {
    public WebTablePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> actualentries;


    @FindBy(id = "addNewRecordButton")
    private  WebElement add;

    @FindBy(id = "firstName")
    private WebElement FirstName;

    @FindBy(id = "lastName")
    private WebElement LastName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "age")
    private WebElement age;

    @FindBy(id = "salary")
    private WebElement salary;

    @FindBy(id = "department")
    private WebElement departament;

    @FindBy(id = "submit")
    private WebElement submit;



//    @FindBy(xpath = "span[text()='Web Tables']" )
//    private WebElement webtables;
//
//    public void clickwebtables(){
//        webtables.click();


   // public void addnewentry(String FirstNameValue,String LastNameValue,String emailValue,String ageValue,
                         //   String salaryValue,String departamentValue ){
   public void addNewEntry(WebTableObject webTableObject){


       Integer actualTableSize= actualentries.size();
        //add.click();
        elementMethods.clickElement(add);
        //FirstName.sendKeys(FirstNameValue);
        elementMethods.fillElement(FirstName, webTableObject.getFirstnamevalue());
        //LastName.sendKeys(LastNameValue);
        elementMethods.fillElement(LastName, webTableObject.getLastnamevalue());
        elementMethods.fillElement(email, webTableObject.getEmailvalue());
        // email.sendKeys(emailValue);
        //age.sendKeys(ageValue);
       elementMethods.fillElement(age, webTableObject.getAgevalue());
       //  salary.sendKeys(salaryValue);
       elementMethods.fillElement(salary, webTableObject.getSalaryvalue());
       //departament.sendKeys(departamentValue);
       elementMethods.fillElement(departament, webTableObject.getDepartmentvalue());
        //submit.click();
       elementMethods.clickElement(submit);

        //validatenewentry(actualTableSize,webTableObject);

    }

    private void validatenewentry (Integer actualTableSize,WebTableObject webTableObject){

        Integer expectedTableSize =actualentries.size();
       // Assert.assertTrue(actualTableSize +1==expectedTableSize);
        String lastentrytable = actualentries.get(actualTableSize).getText();

        Assert.assertTrue(lastentrytable.contains(webTableObject.getFirstnamevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getLastnamevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getEmailvalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getAgevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getSalaryvalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getDepartmentvalue()));
    }
    }

