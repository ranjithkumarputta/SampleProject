package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.CommonStepsDiana;
import pages.ElementsPageDiana;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class InvoiceManagerDiana extends CommonStepsDiana {
   ElementsPageDiana actions = new ElementsPageDiana(driver);
    @Given("^I am on application login page$")
    public void i_am_on_application_login_page() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/auth/login/");
    }
    @When("^I enter valid UserName as \"([^\"]*)\" and valid password as \"([^\"]*)\"$")
    public void i_enter_valid_UserName_as_and_valid_password_as(String UserName, String password) throws Throwable {
        actions.email(UserName);
        actions.pass(password);
    }
    @When("^I click on Login$")
    public void i_click_on_Login() throws Throwable {
        actions.clickLogIn();
    }
    @Then("^I will successfully log in$")
    public void i_will_successfully_log_in() throws Throwable {
    }
    @Then("^I will not be able to log in$")
    public void i_will_not_be_able_to_log_in() throws Throwable {
    }
    @Given("^I am logged in on the application$")
    public void i_am_logged_in_on_the_application() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/auth/login/");
        actions.emailInput();
        actions.passInput();
        actions.clickLogIn();
    }
    @When("^I click on my profile icon \\(top right\\)$")
    public void i_click_on_my_profile_icon_top_right() throws Throwable {
        actions.profile();
    }
    @When("^I click on Logout$")
    public void i_click_on_Logout() throws Throwable {
        actions.logOut();
    }
    @Then("^I will successfully log out$")
    public void i_will_successfully_log_out() throws Throwable {
    }
    @Given("^I am on application homepage$")
    public void i_am_on_application_homepage() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/auth/login/");
        actions.emailInput();
        actions.passInput();
        actions.clickLogIn();
        driver.get("http://3.13.126.58/AMS3.0/home");
    }
    @When("^I select Add Customer option in Customers$")
    public void i_select_Add_Customer_option_in_Customers() throws Throwable {
        actions.customer();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customers_add\"]")));
        actions.customerAdd();
    }
    @When("^I enter all required fields \"([^\"]*)\"$")
    public void i_enter_all_required_fields(List<String> Field) throws Throwable {
       actions.input(Field);
    }
    @Then("^I should be able to add new customer to Customers table$")
    public void i_should_be_able_to_add_new_customer_to_Customers_table() throws Throwable {
        driver.findElement(By.name("submit")).click();
    }
    @When("^I enter a value only in one field \"([^\"]*)\"$")
    public void i_enter_a_value_only_in_one_field(List<String> Field) throws Throwable {
        actions.inputSubmit(Field);
    }
    @Then("^I should not be able to add new customer to Customers table$")
    public void i_should_not_be_able_to_add_new_customer_to_Customers_table() throws Throwable {

    }
    @Given("^I successfully tested Add Customer functionality$")
    public void i_successfully_tested_Add_Customer_functionality() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/auth/login/");
        actions.emailInput();
        actions.passInput();
        actions.clickLogIn();
        driver.get("http://3.13.126.58/AMS3.0/home");
    }
    @When("^I go to Customers List$")
    public void i_go_to_Customers_List() throws Throwable {
        actions.customer();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customers_index\"]")));
        actions.customerList();
    }
    @When("^check last entry to Customers Table$")
    public void check_last_entry_to_Customers_Table() throws Throwable {
        actions.column();
        actions.id();
        Actions ac = new Actions(driver);
        ac.moveByOffset(50,0).click().build().perform();
        actions.sortID();
        actions.sortID();
//        WebElement sort = driver.findElement(By.xpath("//*[@id=\"fileData\"]/thead/tr/th[1]"));
//        actions.doubleClick(sort).perform();
    }
    @Then("^I should be able to see my last entry as per @AddCustomer scenario$")
    public void i_should_be_able_to_see_my_last_entry_as_per_AddCustomer_scenario() throws Throwable {
    }
    @When("^I enter valid UserName as \"([^\"]*)\" and valid password as \"([^\"]*)\"$")
    public void i_enter_valid_UserName_as1and_valid_password_as1(String UserName, String password) throws Throwable {
        actions.email(UserName);
        actions.pass(password);
    }
    @When("^I enter valid UserName as \"([^\"]*)\" and valid password as \"([^\"]*)\"$")
    public void i_enter_valid_UserName_as2_and_valid_password2_as(String UserName, String password) throws Throwable {
        actions.email(UserName);
        actions.pass(password);
    }
    @When("^I enter valid UserName as \"([^\"]*)\" and valid password as \"([^\"]*)\"$")
    public void i_enter_valid_UserName3_as_and_valid_password_as(String UserName, String password) throws Throwable {
        actions.email(UserName);
        actions.pass(password);
    }
}
