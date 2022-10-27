package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IMNewUserPageSwetha {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id=\"first_name\"]")
    private WebElement firstNamefld;

    @FindBy(xpath = "//input[@id=\"last_name\"]")
    private WebElement lastNamefld;

    @FindBy(xpath = "//input[@id=\"company\"]")
    private WebElement companyfld;

    @FindBy(xpath = "//input[@id=\"phone\"]")
    private WebElement phonefld;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement emailfld;

    @FindBy(xpath = "//strong[text()=\"admin\"]//preceding-sibling::input")
    private WebElement rolebtn;

    @FindBy(xpath = "//input[@id=\"password\"]")
    private WebElement passwordfld;

    @FindBy(xpath = "//input[@id=\"password_confirm\"]")
    private WebElement confirmPasswordfld;

    @FindBy(xpath = "//input[@value=\"Add User\"]")
    private WebElement addUserbtn;

    @FindBy(xpath = "//div[contains(@class,\"alert-danger\")]/p")
    private List<WebElement> errMessages;



    public IMNewUserPageSwetha(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setFirstName(String firstName){
        firstNamefld.clear();
        firstNamefld.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        lastNamefld.clear();
        lastNamefld.sendKeys(lastName);
    }

    public void setCompany(String company){
        companyfld.clear();
        companyfld.sendKeys(company);
    }

    public void setPhoneno(String Phoneno){
        phonefld.clear();
        phonefld.sendKeys(Phoneno);
    }

    public void setEmail(String email){
        emailfld.clear();
        emailfld.sendKeys(email);
    }

    public void setRole(){
        Actions ae=new Actions(driver);
        ae.moveToElement(addUserbtn).perform();
        rolebtn.click();
    }

    public void setPassword(String pass){
        passwordfld.clear();
        passwordfld.sendKeys(pass);
    }

    public void setConfirmPassword(String confPass){
        confirmPasswordfld.clear();
        confirmPasswordfld.sendKeys(confPass);
    }

    public void clickAddUserbtn(){
        addUserbtn.click();
    }

    public String getErrorMessage(){
        return errMessages.get(0).getText();
    }

}
