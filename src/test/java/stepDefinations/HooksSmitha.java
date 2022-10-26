package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonFunction {

    @Before
    public void openBrowser(){
        open();
    }

    @After
    public void closeBrowser(){
        close1();
    }
}
