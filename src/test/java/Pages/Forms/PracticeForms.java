package Pages.Forms;

import ObjectData.FormTableObject;
import Pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PracticeForms extends BasePage {

    public PracticeForms(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="firstName")
    private WebElement firstname;

    @FindBy(id="lastName")
    private WebElement lastname;

    @FindBy(id = "userEmail")
    private WebElement emailAddress;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement gender;

    @FindBy(id = "userNumber")
    private WebElement mobile;

    @FindBy(id = "subjectsInput")
    private WebElement subjects;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private  WebElement reading;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    private WebElement address;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "react-select-3-input")
    private WebElement selectstate;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "react-select-4-input")
    private  WebElement selectcity;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "example-modal-sizes-title-lg")
    private  WebElement thanksMessage;

    @FindBy(css = ".table-dark>tbody>tr")
    private List<WebElement> validationTable;

    @FindBy(id = "closeLargeModal")
    private WebElement closeButton;



    public void fillPracticeForm(FormTableObject formTableObject){
        fillFirstName(formTableObject.getFirstNameValue());
        fillLastName(formTableObject.getLastNameValue());
        fillEmailAddress(formTableObject.getEmailAddressValue());
        fillgender();
        fillUserNumber(formTableObject.getPrivatemobileValue());
        fillSubjects(formTableObject.getSubjectsValue());
        fillReading();
        elementMethods.scrollByPixels(0,450);
        fillUploadPictures();
        fillAddress(formTableObject.getAddressValue());
        fillState(formTableObject.getStateValue());
        fillCity(formTableObject.getCityValue());
    }
    public List<String>getValuesForm(){
        List<String>formValues = new ArrayList<>();
        formValues.add(gender.getText());
        formValues.add(reading.getText());
        return formValues;
    }
    public void fillFirstName(String firstNameValue){
        elementMethods.fillElement(firstname,firstNameValue);

        //firstname.sendKeys(firstNameValue);
    }

    public void fillLastName(String lastNameValue){
        lastname.sendKeys(lastNameValue);
    }
    public void fillEmailAddress(String emailAddressValue){
        emailAddress.sendKeys(emailAddressValue);
    }
    public void fillgender(){
        elementMethods.clickElement(gender);
        //gender.click();
    }

    public void fillUserNumber(String mobileValue){
        mobile.sendKeys(mobileValue);
    }
    public void fillSubjects( String subjectsValue){
        elementMethods.fillElement(subjects,subjectsValue,Keys.ENTER);
        //subjects.sendKeys(subjectsValue);
        //subjects.sendKeys(Keys.ENTER);
    }
    public void fillReading(){
        //reading.click();
        elementMethods.clickElement(reading);
    }


    public void fillUploadPictures(){
        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/a-cerinte.txt");
        uploadPicture.sendKeys(file.getAbsolutePath());
    }
    public void fillAddress(String addressValue){

        address.sendKeys(addressValue);
    }


    public void fillState(String stateValue){
        elementMethods.scrollByPixels(0,450);
        elementMethods.clickJsElement(state);
        elementMethods.fillElement(selectstate,stateValue,Keys.ENTER);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,450)", "");
//        state.click();
//        selectstate.sendKeys(stateValue);
//        selectstate.sendKeys(Keys.ENTER);
    }
    public void fillCity(String cityValue){
       // city.click();
        elementMethods.clickElement(city);
        //selectcity.sendKeys(cityValue);
        elementMethods.fillElement(selectcity,cityValue, Keys.ENTER);
        //selectcity.sendKeys(Keys.ENTER);
    }
    public void fillSubmit(){
        elementMethods.clickJsElement(submitButton);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();",submitButton);
    }
    public void clickClose(){

        closeButton.sendKeys(Keys.ENTER);
    }

    public void validatePracticeForm(String expectedMessage,String firstNameValue,String lastNameValue,
                                     String emailAddressValue,String genderValue,String mobileValue,
                                     String subjectsValue,String readingValue,String addressValue,
                                     String stateValue,String cityValue){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy", Locale.ENGLISH);
        LocalDateTime now = LocalDateTime.now();
        String dateOfBirthValue = dtf.format(now);

        elementMethods.validateElementMessage(thanksMessage, expectedMessage);

//        String actualMessage = thanksMessage.getText();
//        Assert.assertEquals(actualMessage, expectedMessage);

        Assert.assertTrue(validationTable.get(0).getText().contains("Student Name"));
        Assert.assertTrue(validationTable.get(0).getText().contains(firstNameValue + " " + lastNameValue));

        Assert.assertTrue(validationTable.get(1).getText().contains("Student Email"));
        Assert.assertTrue(validationTable.get(1).getText().contains(emailAddressValue));

        Assert.assertTrue(validationTable.get(2).getText().contains("Gender"));
        Assert.assertTrue(validationTable.get(2).getText().contains(genderValue));

        Assert.assertTrue(validationTable.get(3).getText().contains("Mobile"));
        Assert.assertTrue(validationTable.get(3).getText().contains(mobileValue));

        Assert.assertTrue(validationTable.get(4).getText().contains("Date of Birth"));
        Assert.assertTrue(validationTable.get(4).getText().contains(dateOfBirthValue));

        Assert.assertTrue(validationTable.get(5).getText().contains("Subjects"));
        Assert.assertTrue(validationTable.get(5).getText().contains(subjectsValue));

        Assert.assertTrue(validationTable.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(validationTable.get(6).getText().contains(readingValue));


        Assert.assertTrue(validationTable.get(8).getText().contains("Address"));
        Assert.assertTrue(validationTable.get(8).getText().contains(addressValue));

        Assert.assertTrue(validationTable.get(9).getText().contains("State and City"));
        Assert.assertTrue(validationTable.get(9).getText().contains(stateValue + " " + cityValue));
    }



}
