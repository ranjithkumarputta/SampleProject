package src.test.java.stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Commonfunction{

    @Before
    public void OpenB(){
        System.out.println("INSIDE BEFORE HOOKS");
        OpenBrowser();
    }

    @After
    public void CloseB(){
        System.out.println("INSIDE AFTER HOOKS ");
        CloseBrowser();
    }
}
