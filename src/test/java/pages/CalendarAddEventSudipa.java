package src.test.java.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class CalendarAddEvent {

    public void  loginpage(WebDriver driver,String username, String password){

        driver.findElement(By.name("identity")).sendKeys(username);
        driver.findElement(By.id("inputPassword")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
    }

    public void Openhomeurl(WebDriver driver){
        driver.get("http://3.13.126.58/AMS3.0/home");
    }

    public void ClickOnCalendar(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href=\"http://3.13.126.58/AMS3.0/calendar\"]")));
        element.click();
    }

    public void pickadate(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[5]/div[2]/table/thead/tr/td[7]")));
        element.click();
    }

    public void AddeventInput(WebDriver driver,String Title, String Startdate, String Enddate, String EventColor, String Description){
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
        element1.sendKeys(Title);
        driver.findElement(By.xpath("//*[@id=\"start\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"start\"]")).sendKeys(Startdate);
        driver.findElement(By.id("end")).clear();
        driver.findElement(By.id("end")).sendKeys(Enddate);
        String colour = driver.findElement(By.xpath("//*[@id=\"color\"]")).getCssValue("background-color");
        System.out.println("COLOUR IS " + colour);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("description")));
        element.sendKeys(Description);
    }

     public void AddEvent(WebDriver driver){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-event")));
         element.click();
     }

     public void InputfieldblankAddevent(WebDriver driver){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-event")));
         element.click();
     }

     public void WarningMessage(WebDriver driver){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div")));
         String Show = element.getText();
         System.out.println(Show);
     }
}
