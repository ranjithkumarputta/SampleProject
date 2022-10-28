package stepDefinations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctionsPoonam {
   public static WebDriver driver;
        public void browserLaunch(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
        }
        public void closeBrowser(){

           driver.close();
        }
    }

