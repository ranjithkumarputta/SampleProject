package stepDefinations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctionSmitha {
    public static WebDriver driver;
    public void open(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }
    public  void close1(){
        driver.quit();
    }
}
