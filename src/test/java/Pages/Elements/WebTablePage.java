package Pages.Elements;

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


    public void addnewentry(String FirstNameValue,String LastNameValue,String emailValue,String ageValue,
                            String salaryValue,String departamentValue ){

        Integer actualTableSize= actualentries.size();
        //add.click();
        elementMethods.clickElement(add);

        FirstName.sendKeys(FirstNameValue);
        LastName.sendKeys(LastNameValue);
        email.sendKeys(emailValue);
        age.sendKeys(ageValue);
        salary.sendKeys(salaryValue);
        departament.sendKeys(departamentValue);
        submit.click();

        validatenewentry(actualTableSize,FirstNameValue,LastNameValue,emailValue,ageValue,salaryValue,departamentValue);

    }

    private void validatenewentry(Integer actualTableSize,String FirstNameValue,String LastNameValue,String emailValue,String ageValue,
                                  String salaryValue,String departamentValue){

        Integer expectedTableSize =actualentries.size();
        Assert.assertTrue(actualTableSize +1==expectedTableSize);
        String lastentrytable = actualentries.get(actualTableSize).getText();

        Assert.assertTrue(lastentrytable.contains(FirstNameValue));
        Assert.assertTrue(lastentrytable.contains(LastNameValue));
        Assert.assertTrue(lastentrytable.contains(emailValue));
        Assert.assertTrue(lastentrytable.contains(ageValue));
        Assert.assertTrue(lastentrytable.contains(salaryValue));
        Assert.assertTrue(lastentrytable.contains(departamentValue));
    }
    }

