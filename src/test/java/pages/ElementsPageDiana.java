package src.test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElementsPageDiana {
    @FindBy(id = "inputEmail")
    private WebElement emailTxt;
    @FindBy(xpath = "//*[@id=\"inputEmail\"]")
    private WebElement emailSend;
    //enter email credentials
    @FindBy(xpath = "//*[@id=\"inputPassword\"]")
    private WebElement passTxt;
    @FindBy(xpath = "//*[@id=\"inputPassword\"]")
    private WebElement passSend;
    //enter password credentials
    @FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")
    private WebElement clickBtn;
    //click on Login btn
    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//a[@data-toggle='dropdown']")
    private WebElement profileBtn;
    //click on profile btn
    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Logout')]")
    private WebElement logOutBtn;
    //click on logOut
    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[4]/a")
    private WebElement customersClick;
    //click on Customers menu, left panel
    @FindBy(xpath = "//*[@id=\"customers_add\"]")
    private WebElement addCustomer;
    //select Add Customer option of Customers menu, left panel
    @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div/input")
    private WebElement addCustomerBtn;
    //click on add Customer button
    @FindBy(xpath = "//*[@id=\"customers_index\"]")
    private WebElement customerList;
    //select List Customers option of Customers menu, left panel
    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[5]/span")
    private WebElement columnsOption;
    //access Columns option view
    @FindBy(xpath = "/html/body/ul/li[1]/a")
    private WebElement idView;
    //select ID view in customers table
    @FindBy(xpath = "//*[@id=\"fileData\"]/thead/tr/th[1]")
    private WebElement sort;
    //sorting table by ID column
    public WebDriver driver;
    public ElementsPageDiana(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void email(String UserName){
        emailTxt.sendKeys(UserName);
    }
    public void emailInput(){
        emailSend.sendKeys("admin@gic.com");
    }
    public void pass(String password){
        passTxt.sendKeys(password);
}
    public void passInput(){
        passSend.sendKeys("Admin123");
    }
    public void clickLogIn(){
        clickBtn.click();
    }
    public void profile(){
        profileBtn.click();
    }
    public void logOut(){
        logOutBtn.click();
    }
    public void customer(){
        customersClick.click();
    }
    public void customerAdd(){
        addCustomer.click();
    }
    public void addCusBtn(){
        addCustomerBtn.click();
    }
    public void customerList(){
        customerList.click();
    }
    public void input(List<String> Field){
        driver.findElement(By.name("company")).sendKeys(Field.get(0));
        driver.findElement(By.name("name")).sendKeys(Field.get(1));
        driver.findElement(By.name("email")).sendKeys(Field.get(2));
        driver.findElement(By.name("phone")).sendKeys(Field.get(3));
        driver.findElement(By.name("address")).sendKeys(Field.get(4));
        driver.findElement(By.name("city")).sendKeys(Field.get(5));
        driver.findElement(By.name("state")).sendKeys(Field.get(6));
        driver.findElement(By.name("postal_code")).sendKeys(Field.get(7));
        driver.findElement(By.name("country")).sendKeys(Field.get(8));
    }
    public void inputSubmit(List<String> Field) {
        driver.findElement(By.name("company")).sendKeys(Field.get(0));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("name")).sendKeys(Field.get(1));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("email")).sendKeys(Field.get(2));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("phone")).sendKeys(Field.get(3));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("address")).sendKeys(Field.get(4));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("city")).sendKeys(Field.get(5));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("state")).sendKeys(Field.get(6));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("postal_code")).sendKeys(Field.get(7));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("country")).sendKeys(Field.get(8));
        driver.findElement(By.name("submit")).click();
    }
    public void column(){
        columnsOption.click();
    }
    public void id(){
        idView.click();
    }
    public void sortID(){
        sort.click();
    }
}
