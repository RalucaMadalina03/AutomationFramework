package Pages.Elements;

import Logger.LoggerUtility;
import ObjectData.WebTableObject;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;



public class WebTablePage extends BasePage {
    public WebTablePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> actualEntries;


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


       Integer actualTableSize= actualEntries.size();

        elementMethods.clickElement(add);
       LoggerUtility.info("The user clicks on the add button");


        elementMethods.fillElement(FirstName, webTableObject.getFirstnamevalue());
       LoggerUtility.info("The user fills firstname field" + FirstName);


        elementMethods.fillElement(LastName, webTableObject.getLastnamevalue());
       LoggerUtility.info("The user fills lastname field" + LastName);

        elementMethods.fillElement(email, webTableObject.getEmailvalue());
       LoggerUtility.info("The user fills email field" + email);

       elementMethods.fillElement(age, webTableObject.getAgevalue());
       LoggerUtility.info("The user fills age field" + age);

       elementMethods.fillElement(salary, webTableObject.getSalaryvalue());
       LoggerUtility.info("The user fills salary field" + salary);

       elementMethods.fillElement(departament, webTableObject.getDepartmentvalue());
       LoggerUtility.info("The user fills department field" + departament);

       elementMethods.clickElement(submit);
       LoggerUtility.info("The user clicks on submit button");

        //validatenewentry(actualTableSize,webTableObject);
       validatenewentry(actualTableSize, webTableObject);

    }

    private void validatenewentry (Integer actualTableSize,WebTableObject webTableObject){

        Integer expectedTableSize =actualEntries.size();
        Assert.assertTrue(actualTableSize +1==expectedTableSize);
        String lastentrytable = actualEntries.get(actualTableSize).getText();

        Assert.assertTrue(lastentrytable.contains(webTableObject.getFirstnamevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getLastnamevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getEmailvalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getAgevalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getSalaryvalue()));
        Assert.assertTrue(lastentrytable.contains(webTableObject.getDepartmentvalue()));
    }
    }

