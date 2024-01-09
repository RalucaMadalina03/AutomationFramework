package ShareData.Browser;

import ProprietyUtility.ProprietyUtility;

import java.util.HashMap;

public class BaseBrowserService {

    public HashMap<String,String> getBrowserOptions(){
        ProprietyUtility proprietyUtility = new ProprietyUtility("Browser");
        return proprietyUtility.getAllData();

    }


}
