package ProprietyUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ProprietyUtility {
    public Properties properties;

    public ProprietyUtility(String fileName){
        loadDataFile(fileName);

    }
    // Metoda care incarca un fisier de tip ""Properties""

    private void loadDataFile(String fileName){
        properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/test/resources/TestData/FormTableTestData.properties");
            properties.load(fileInputStream);
        } catch (IOException ignored) {
        }
    }

    //metoda care returneaza toate datele din fisierul de proprietati

    public HashMap<String, String> getAllData(){
        HashMap<String, String> testData = new HashMap<>();
        for(String Key:properties.stringPropertyNames()){ //parcurge toate cheile din Properties
            testData.put(Key,properties.getProperty(Key));//adaugam chei-valoare
        }
        return testData;
    }
}
