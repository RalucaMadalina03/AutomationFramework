package Tests;

import ObjectData.FormTableObject;
import Pages.Forms.FormsPage;
import Pages.Forms.PracticeForms;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

import java.util.List;

public class FormTableTest  extends Hooks {

    @Test

    public void test_method(){

        FormTableObject formTableObject = new FormTableObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickForms();

        FormsPage formsPage= new FormsPage(getDriver());
        formsPage.clickForm();


        PracticeForms practiceForms = new PracticeForms(getDriver());
        practiceForms.fillPracticeForm(formTableObject);

        List<String> FormValues = practiceForms.getValuesForm();
        practiceForms.fillSubmit();

        //practiceForms.validatePracticeForm();

        practiceForms.clickClose();



//        WebElement firstname = driver.findElement(By.id("firstName"));
//        String firstnamevalue="Raluca";
//        firstname.sendKeys(firstnamevalue);

//        WebElement lastname= driver.findElement(By.id("lastName"));
//        String lastnamevalue="Petreus";
//        lastname.sendKeys(lastnamevalue);
//
//        WebElement emailAddress= driver.findElement(By.id("userEmail"));
//        String emailAddressValue= "petreus.r@yahoo.com";
//        emailAddress.sendKeys(emailAddressValue);
//
//        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        gender.click();
//        String genderValue = gender.getText();
//
//        WebElement mobile = driver.findElement(By.id("userNumber"));
//        String mobilevalue="0755555000";
//        mobile.sendKeys(mobilevalue);
//
//        WebElement subjects = driver.findElement(By.id("subjectsInput"));
//        String subjectsvalue = "English";
//        subjects.sendKeys(subjectsvalue);
//        subjects.sendKeys(Keys.ENTER);
//
//        WebElement reading = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
//        reading.click();
//        String readingValue = reading.getText();
//
//
//        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
//        File file = new File("src/test/resources/a-cerinte.txt");
//        uploadPicture.sendKeys(file.getAbsolutePath());
//
//        WebElement address = driver.findElement(By.id("currentAddress"));
//        String addressvalue = " Eroilor 31";
//        address.sendKeys(addressvalue);



//        WebElement state = driver.findElement(By.id("state"));
//        state.click();
//        WebElement selectstate = driver.findElement(By.id("react-select-3-input"));
//        String statevalue = "NCR";
//        selectstate.sendKeys(statevalue);
//        selectstate.sendKeys(Keys.ENTER);
//
//        WebElement city = driver.findElement(By.id("city"));
//        city.click();
//        WebElement selectcity = driver.findElement(By.id("react-select-4-input"));
//        String cityvalue = "Delhi";
//        selectcity.sendKeys(cityvalue);
//        selectcity.sendKeys(Keys.ENTER);
//
//        WebElement submitButton = driver.findElement(By.id("submit"));
//        //jse.executeScript("arguments[0].click();",submit);


//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy ");
//        LocalDateTime now = LocalDateTime.now();
//        String dateOfBirthValue = dtf.format(now);
//
//        WebElement thanksMessage = driver.findElement(By.id("example-modal-sizes-title-lg"));
//        String actualMessage = thanksMessage.getText();
//        String expectedMessage = "Thanks for submitting the form";
//        Assert.assertEquals(actualMessage, expectedMessage);
//
//
//        List<WebElement> validationTable = driver.findElements(By.cssSelector(".table-dark>tbody>tr"));
//        Assert.assertTrue(validationTable.get(0).getText().contains("Student Name"));
//        Assert.assertTrue(validationTable.get(0).getText().contains(firstnamevalue + " " + lastnamevalue));
//
//        Assert.assertTrue(validationTable.get(1).getText().contains("Student Email"));
//        Assert.assertTrue(validationTable.get(1).getText().contains(emailAddressValue));
//
//        Assert.assertTrue(validationTable.get(2).getText().contains("Gender"));
//        Assert.assertTrue(validationTable.get(2).getText().contains(genderValue));
//
//        Assert.assertTrue(validationTable.get(3).getText().contains("Mobile"));
//        Assert.assertTrue(validationTable.get(3).getText().contains(mobilevalue));
//
//        Assert.assertTrue(validationTable.get(4).getText().contains("Date of Birth"));
//        Assert.assertTrue(validationTable.get(4).getText().contains(dateOfBirthValue));
//
//        Assert.assertTrue(validationTable.get(5).getText().contains("Subjects"));
//        Assert.assertTrue(validationTable.get(5).getText().contains(subjectsvalue));
//
//        Assert.assertTrue(validationTable.get(6).getText().contains("Hobbies"));
//        Assert.assertTrue(validationTable.get(6).getText().contains(readingValue));
//
//        Assert.assertTrue(validationTable.get(7).getText().contains("Picture"));
//        Assert.assertTrue(validationTable.get(7).getText().contains(file.getName()));
//
//        Assert.assertTrue(validationTable.get(8).getText().contains("Address"));
//        Assert.assertTrue(validationTable.get(8).getText().contains(addressvalue));
//
//        Assert.assertTrue(validationTable.get(9).getText().contains("State of City"));
//        Assert.assertTrue(validationTable.get(9).getText().contains(statevalue + " " + cityvalue));

//        WebElement closeButton = driver.findElement(By.id("closeLargeModal"));
//        closeButton.sendKeys(Keys.ENTER);


    }

}
