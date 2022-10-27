package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMEditUserPageSwetha {
    private WebDriver driver;

    @FindBy(xpath ="//input[@id=\"first_name\"]")
    private WebElement firstNamefld;

    @FindBy(xpath ="//input[@id=\"last_name\"]" )
    private WebElement lastNameFld;

    @FindBy(xpath ="//input[@id=\"company\"]" )
    private WebElement companyFld;

    @FindBy(xpath ="//input[@id=\"phone\"]")
    private WebElement phonenoFld;

    @FindBy(xpath ="//input[@id=\"email\"]" )
    private WebElement emailID;

    @FindBy(xpath ="//input[@value=\"Update User\"]")
    private WebElement updateUserButton;

    @FindBy(xpath ="//strong[contains(.,\"admin\")]/preceding-sibling::input")
    private WebElement role;

    @FindBy(xpath ="//input[@id=\"password\"]" )
    private WebElement passwordFld;

    @FindBy(xpath ="//input[@id=\"password_confirm\"]")
    private WebElement confirmPasswordField;

    @FindBy(xpath ="//div[contains(@class,\"alert-success\")]")
    private WebElement scsMsg;


    public IMEditUserPageSwetha(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void setFirstNamefld(String firstName)
    {
        firstNamefld.clear();
        firstNamefld.sendKeys(firstName);
    }

    public void setLastNameFld(String lastName)
    {
        lastNameFld.clear();
        lastNameFld.sendKeys(lastName);
    }

    public void setCompanyFld(String company)
    {
        companyFld.clear();
        companyFld.sendKeys(company);
    }

    public void setPhoneno(String phoneNo){
        phonenoFld.clear();
        phonenoFld.sendKeys(phoneNo);
    }

    public void setEmailID(String email)
    {
        emailID.clear();
        emailID.sendKeys(email);
    }

    public void setRole()
    {
        Actions ae=new Actions(driver);
        WebElement btn= driver.findElement(By.xpath("//input[@value=\"Update User\"]"));
        ae.moveToElement(btn).perform();
        role.click();
    }

    public void setPasswordFld(String password)
    {
        passwordFld.clear();
        passwordFld.sendKeys(password);
    }

    public void setConfirmPasswordField(String confPass){
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confPass);
    }

    public void clickUpdateUser(){
        updateUserButton.click();
    }

    public String getSuccessMessage(){
        WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement successText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,\"alert-success\")]")));
        return scsMsg.getText();
    }
}
