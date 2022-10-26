package stepDefinations;

import pages.Loginpages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class Login  extends CommonFunction {
    private Loginpages loginobj;
    @Given("^user on IM login page$")
    public void user_on_IM_login_page() throws Throwable {

        loginobj=new Loginpages(driver);
        driver.get("http://3.13.126.58/AMS3.0/auth/login");

    }

    @When("^user enters username \"([^\"]*)\" and password\"([^\"]*)\"$")
    public void user_enters_username_and_password(String arg1, String arg2) throws Throwable {
        driver.findElement(By.id("inputEmail")).sendKeys(arg1);
        driver.findElement(By.id("inputPassword")).sendKeys(arg2);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }

    @Then("^user should able to login$")
    public void user_should_able_to_login() throws Throwable {


    }

}
