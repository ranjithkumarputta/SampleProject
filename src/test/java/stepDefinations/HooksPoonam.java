package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksPoonam extends CommonFunctions{

    @Before
    public void open(){
       browserLaunch();
    }
    @After
    public void close(){
        closeBrowser();
    }
}

