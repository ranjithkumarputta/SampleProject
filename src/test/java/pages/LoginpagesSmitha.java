package src.test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpages {

    private WebDriver driver;



    public Loginpages(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }





}
