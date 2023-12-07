package ObjectData;

import java.security.Key;
import java.util.HashMap;

public class FormTableObject {

    private String firstNameValue;
    private String lastNameValue;
    private String emailAddressValue;
    private String privatemobileValue;
    private String subjectsValue;
    private String addressValue;
    private String stateValue;
    private String cityValue;
    private String expectedMessage;
    private String examen;


   public FormTableObject(HashMap<String, String>testData) {
       populateObject(testData);
   }


   private void populateObject (HashMap<String, String>testData) {
       for (String Key: testData.keySet()){
           switch (Key) {
               case "firstNameValue":
                   setFirstNameValue(testData.get(Key));
                   break;
               case "lastNameValue":
                   setLastNameValue(testData.get(Key));
                   break;
               case "emailAddressValue":
                   setEmailAddressValue(testData.get(Key));
                   break;
               case "privatemobileValue":
                   setPrivatemobileValue(testData.get(Key));
                   break;
               case "subjectsValue":
                   setSubjectsValue(testData.get(Key));
                   break;
               case "addressValue":
                   setAddressValue(testData.get(Key));
                   break;
               case "stateValue":
                   setStateValue(testData.get(Key));
                   break;
               case "cityValue":
                   setCityValue(testData.get(Key));
                   break;
               case "expectedMessage":
                   setExpectedMessage(testData.get(Key));
                   break;
               case"examen":
                   setExamen(testData.get(Key));
                   break;

           }
           }
   }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getEmailAddressValue() {
        return emailAddressValue;
    }

    public void setEmailAddressValue(String emailAddressValue) {
        this.emailAddressValue = emailAddressValue;
    }

    public String getPrivatemobileValue() {
        return privatemobileValue;
    }

    public void setPrivatemobileValue(String privatemobileValue) {
        this.privatemobileValue = privatemobileValue;
    }

    public String getSubjectsValue() {
        return subjectsValue;
    }

    public void setSubjectsValue(String subjectsValue) {
        this.subjectsValue = subjectsValue;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }

    public String getExpectedMessage() {
        return expectedMessage;
    }

    public void setExpectedMessage(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }
}
}
