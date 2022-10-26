package src.test.java.stepDefinations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonfunction {
    public static WebDriver driver;

    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://3.13.126.58/AMS3.0/auth/login/");
        driver.manage().window().maximize();
    }

    public void CloseBrowser(){
        driver.close();

    }
}
