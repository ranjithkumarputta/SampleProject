package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagesPoonam {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id=\"inputEmail\"]")
    private WebElement emailfld;

    @FindBy(xpath = "//input[@id=\"inputPassword\"]")
    private WebElement passwordfld;

    @FindBy(xpath = "//button[text()=\"Login\"]")
    private WebElement loginbtn;

    @FindBy(xpath = "//*[@id=\"products_add\"]")
    private WebElement AddProduct;

    public LoginPagesPoonam(WebDriver driver) {
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

    public void clickAddProduct() {AddProduct.click();}
}
