package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMLoginPageSwetha {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id=\"inputEmail\"]")
    private WebElement emailfld;

    @FindBy(xpath = "//input[@id=\"inputPassword\"]")
    private WebElement passwordfld;

    @FindBy(xpath = "//button[text()=\"Login\"]")
    private WebElement loginbtn;

    public IMLoginPageSwetha(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void  setEmailfld(String email){

        emailfld.sendKeys(email);
    }

    public void setPasswordfld(String password){

        passwordfld.sendKeys(password);
    }

    public void clickLogin(){

        loginbtn.click();
    }
    public String refreshPage(){
        WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,\"page isn’t working\")]")));
        return element1.getText();
    }


}
