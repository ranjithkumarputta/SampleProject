package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagesSmitha {
    private WebDriver driver;
    public LoginpagesSmitha(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "inputEmail")
    private WebElement username;
    @FindBy(id="inputPassword")
    private WebElement password;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement submitBtn;

    public void login(String arg1,String arg2){
        username.sendKeys(arg1);
    password.sendKeys(arg2);
    submitBtn.click();
}
    public void login1(String arg1,String arg2){
        username.sendKeys(arg1);
        password.sendKeys(arg2);
        submitBtn.click();
    }
    public void login2(String arg1,String arg2){
        username.sendKeys(arg1);
        password.sendKeys(arg2);
        submitBtn.click();
    }

    public void login3(String arg1,String arg2){
        username.sendKeys(arg1);
        password.sendKeys(arg2);
        submitBtn.click();
    }
}
