package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMHomePageSwetha {
    private WebDriver driver;


    @FindBy(xpath = "//li[@class=\"has_submenu nblue\"]/a[contains(.,\"Users\")]")
    private WebElement usersDropdown;

    @FindBy(xpath = "//a[@data-toggle=\"dropdown\"]")
    private WebElement logoutDropDown;

    @FindBy(xpath = "//a[contains(@href,\"logout\")]")
    private WebElement logOutBtn;

    @FindBy(xpath = "//p[contains(.,\"Success\")]")
    private WebElement scsmsg;


    public IMHomePageSwetha(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickUser(){

        usersDropdown.click();
    }
    public void clickAddUser(){
        WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,\"Add New User\")]")));
        element.click();

    }

    public void clickListUser(){
        WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,\"List Users\")]")));
        element.click();
    }

    public void clickLogoutDropDown(){

        logoutDropDown.click();
    }

    public void clickLogOutBtn() {

        logOutBtn.click();
    }

    public String getSuccessMessage(){

        return scsmsg.getText();
    }
}
