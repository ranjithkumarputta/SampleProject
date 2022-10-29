package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksSmitha extends CommonFunctionSmitha {

    @Before
    public void openBrowser(){
        open();
    }

    @After
    public void closeBrowser(){
        close1();
    }
}
