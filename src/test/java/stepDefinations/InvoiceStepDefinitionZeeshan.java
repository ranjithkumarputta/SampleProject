package stepDefinations;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ShortZeeshanSteps;

import java.util.concurrent.TimeUnit;

public class InvoiceStepDefinitionZeeshan {
    private WebDriver driver;
    private ShortZeeshanSteps steps = new ShortZeeshanSteps();



    @Before
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Given("^i am on the application login page$")
    public void i_am_on_the_application_login_page() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/home");


    }

    @When("^i enter the username and password\\.$")
    public void i_enter_the_username_and_password() throws Throwable {

        //Short = new ShortSteps();
        steps.username(driver);
        steps.password(driver);

    }

    @When("^click on login button$")
    public void click_on_login_button() throws Throwable {
        steps.login(driver);
    }

    @Then("^i should be able to login successfully$")
    public void i_should_be_able_to_login_successfully() throws Throwable {

    }

    @Given("^i am on the application dashboard$")
    public void i_am_on_the_application_dashboard() throws Throwable {
        steps.loginpage(driver);
        steps.username(driver);
        steps.password(driver);
        steps.password(driver);
        steps.login(driver);

    }

    @When("^i go to  sales report page from Reports$")
    public void i_go_to_sales_report_page_from_Reports() throws Throwable {
        steps.navigate(driver);
        steps.clickreports(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        steps.salesreport(driver);
    }

    @When("^select required field,submit$")
    public void select_required_field_submit() throws Throwable {
        steps.customer(driver);
        steps.choosecustomer(driver);
        steps.status(driver);
        steps.selectstatus(driver);
        steps.date(driver);
        steps.selectdate(driver);
        steps.user(driver);
        steps.selectuser(driver);
        steps.submit(driver);
    }

    @Then("^i should be able to generatre sales report\\.$")
    public void i_should_be_able_to_generatre_sales_report() throws Throwable {

    }

    @Given("^i am on application dashboard$")
    public void i_am_on_application_dashboard() throws Throwable {
        steps.loginpage(driver);
        steps.username(driver);
        steps.password(driver);
        steps.password(driver);
        steps.login(driver);
        steps.navigate(driver);
    }

    @When("^i go to payment report page from Reports$")
    public void i_go_to_payment_report_page_from_Reports() throws Throwable {
        steps.clickreports(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        steps.paymentreport(driver);
    }

    @When("^select required field$")
    public void select_required_field() throws Throwable {
        steps.paymentcustomer(driver);
        steps.selectpaymentcustomer(driver);
        steps.submitp(driver);
    }

    @Then("^i should be able to generate Payment report\\.$")
    public void i_should_be_able_to_generate_Payment_report() throws Throwable {

    }

    @When("^i go to sales report page from Reports$")
    public void i_go_to_sales_report_page_from_the_Reports() throws Throwable {
        steps.navigate(driver);
        steps.clickreports(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        steps.salesreport(driver);
    }

    @When("^not selecting any required field$")
    public void not_selecting_any_required_field() throws Throwable {
        steps.submit(driver);
    }

    @Then("^i should not be able to generate sales report\\.$")
    public void i_should_not_be_able_to_generate_sales_report() throws Throwable {
    }


}
