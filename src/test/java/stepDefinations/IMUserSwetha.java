package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

public class IMUserSwetha extends CommonFunctionsSwetha{
    IMLoginPageSwetha lp=new IMLoginPageSwetha(driver);
    IMHomePageSwetha hp=new IMHomePageSwetha(driver);
    IMNewUserPageSwetha np=new IMNewUserPageSwetha(driver);
    IMListUserPageSwetha lu=new IMListUserPageSwetha(driver);
    IMEditUserPageSwetha ep=new IMEditUserPageSwetha(driver);

    @Given("^I login to the application and on home page$")
    public void i_login_to_the_application_and_on_home_page() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/home");
        lp.setEmailfld("admin@gic.com");
        lp.setPasswordfld("Admin123");
        lp.clickLogin();
        driver.navigate().to("http://3.13.126.58/AMS3.0/home");
    }

    @When("^I navigate to Add Users page$")
    public void i_navigate_to_Add_Users_page() throws Throwable {
        hp.clickUser();
        hp.clickAddUser();
    }

    @When("^enter all the valid data and click on Add user$")
    public void enter_all_the_valid_data_and_click_on_Add_user() throws Throwable {
        np.setFirstName("Text2");
        np.setLastName("Last1");
        np.setCompany("Comp1");
        np.setPhoneno("0123123122");
        np.setEmail("jimki19@gmail.com");
        np.setRole();
        np.setPassword("SamplePass");
        np.setConfirmPassword("SamplePass");
        np.clickAddUserbtn();
    }

    @Then("^a new user should be created successfully$")
    public void a_new_user_should_be_created_successfully() throws Throwable {
        String msg=lp.refreshPage();
        System.out.println("Usercreationmessage is--->"+msg);
        driver.navigate().refresh();
        hp.clickLogoutDropDown();
        hp.clickLogOutBtn();
    }

    @Then("^that user should be able to login successfully\\.$")
    public void that_user_should_be_able_to_login_successfully() throws Throwable {
        lp.setEmailfld("jimki13@gmail.com");
        lp.setPasswordfld("SamplePass");
        lp.clickLogin();
        String msg1=hp.getSuccessMessage();
        System.out.println("User Login message is--->"+msg1);
        Assert.assertTrue(msg1,msg1.contains("Logged In Successfully"));
    }

    @When("^enter all the invalid data and click on Add user$")
    public void enter_all_the_invalid_data_and_click_on_Add_user() throws Throwable {
        np.setFirstName("12345");
        np.setLastName("46353");
        np.setCompany("96328");
        np.setPhoneno("01231");
        np.setEmail("jimki13");
        np.setRole();
        np.setPassword("Sample");
        np.setConfirmPassword("Sample");
        np.clickAddUserbtn();

    }

    @Then("^error messages should popUp to enter valid data\\.$")
    public void error_messages_should_popUp_to_enter_valid_data() throws Throwable {
        String errMessage=np.getErrorMessage();
        Assert.assertTrue(errMessage.contains("Email Address field must contain a valid"));
        System.out.println("Error messages for invalid data is-->"+errMessage);
    }

    @When("^I navigate to List Users page and navigate to Edit User page$")
    public void i_navigate_to_List_Users_page_and_navigate_to_Edit_User_page() throws Throwable {
        hp.clickUser();
        hp.clickListUser();
        lu.clickEditUserBtn();
    }

    @When("^enter  the updated data and click on Edit user$")
    public void enter_the_updated_data_and_click_on_Edit_user() throws Throwable {
        ep.setFirstNamefld("Text2");
        ep.setLastNameFld("Last1");
        ep.setCompanyFld("comp1");
        ep.setPhoneno("0123123122");
        ep.setEmailID("jimki20@gmail.com");
        ep.setRole();
        ep.setPasswordFld("SamplePass");
        ep.setConfirmPasswordField("SamplePass");
        ep.clickUpdateUser();
    }

    @Then("^user updated successfully message should be dispalyed\\.$")
    public void user_updated_successfully_message_should_be_dispalyed() throws Throwable {
        String msg=ep.getSuccessMessage();
        System.out.println("Userupdated message is-->"+msg);
        Assert.assertTrue(msg.contains("User Successfully Updated"));
    }

    @When("^I navigate to List Users page$")
    public void i_navigate_to_List_Users_page() throws Throwable {
        hp.clickUser();
        hp.clickListUser();
    }

    @When("^search for a user$")
    public void search_for_a_user() throws Throwable {
        lu.setSearchBox("jimki6");
    }

    @Then("^searched user data should appear in the search results data table\\.$")
    public void searched_user_data_should_appear_in_the_search_results_data_table() throws Throwable {
        String email=lu.getSearchedEmail();
        System.out.println("Searched email is--->"+email);
        Assert.assertTrue(email.contains("jimki6@gmail.com"));
    }

}
