package pages;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksDiana extends CommonStepsDiana {
    @Before
    public void open(){
        openBrowser();
    }
    @After
    public void close(){
        closeBrowser();
    }
}
