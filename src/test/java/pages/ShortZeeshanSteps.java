package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShortZeeshanSteps {
    private WebDriver driver;


    public void username(WebDriver driver)
    {driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("admin@gic.com");}
    public void password(WebDriver driver)
    {driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("Admin123");}
    public void login(WebDriver driver)
    {driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();}
    public void navigate(WebDriver driver)
    {driver.navigate().to("http://3.13.126.58/AMS3.0/home");}
    public void submit(WebDriver driver)
    {driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).click();}
    public void customer(WebDriver driver){WebElement ddown =driver.findElement(By.xpath("//div[@id='customer_chosen']"));
        ddown.click();}
    public void choosecustomer(WebDriver driver)
    {driver.findElement(By.xpath("//li[contains(text(),'test (Test Customer)')]")).click();}
    public void status(WebDriver driver)
    {driver.findElement(By.xpath("//div[@id='status_chosen']")).click();}
    public void selectstatus(WebDriver driver)
    {driver.findElement(By.xpath("//li[contains(text(),'Overdue')]")).click();}
    public void date(WebDriver driver)
    {driver.findElement(By.xpath("//input[@id='start_date']")).click();}
    public void selectdate(WebDriver driver)
    {driver.findElement(By.xpath("//body[1]/div[7]/div[3]/table[1]/tbody[1]/tr[3]/td[3]")).click();}
    public void user(WebDriver driver)
    {driver.findElement(By.xpath("//div[@id='user_chosen']")).click();}
    public void selectuser(WebDriver driver)
    {driver.findElement(By.xpath("//li[contains(text(),'Test1 Test2')]")).click();}
    public void loginpage(WebDriver driver)
    {driver.get("http://3.13.126.58/AMS3.0/home");}
    public void clickreports(WebDriver driver)
    {driver.findElement(By.xpath("//body/div[2]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();}
    public void salesreport(WebDriver driver)
    {driver.findElement(By.xpath("//a[@id='reports_sales']")).click();}
    public void paymentreport(WebDriver driver)
    {driver.findElement(By.xpath("//a[@id='reports_payments']")).click();}
    public void paymentcustomer(WebDriver driver)
    {driver.findElement(By.xpath("//div[@id='customer_chosen']")).click();}
    public void selectpaymentcustomer(WebDriver driver)
    {driver.findElement(By.xpath("//li[contains(text(),'Santhos (Shan)')]")).click();}
    public void submitp(WebDriver driver)
    {driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).click();}



}
