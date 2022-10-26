package src.test.java.stepDefinations;
import ImPageObject.CalendarAddEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ImCalendar1 extends Commonfunction{

  private CalendarAddEvent obj =new CalendarAddEvent();

    @Given("^user is on the IM Application login page, enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_is_on_the_IM_Application_login_page_enter_username_as_and_password_as(String username, String password) throws Throwable {
        obj.loginpage(driver,username,password);

    }

    @When("^user change clients url to home url$")
    public void user_change_clients_url_to_home_url() throws Throwable {
       obj.Openhomeurl(driver);

    }

    @When("^click on Calendar button on the right top panel$")
    public void click_on_Calendar_button_on_the_right_top_panel() throws Throwable {
      obj.ClickOnCalendar(driver);
    }

    @When("^user click on a date to open add event pop up$")
    public void user_click_on_a_date_to_open_add_event_pop_up() throws Throwable {
      obj.pickadate(driver);
    }

    @When("^user Input Title as  \"([^\"]*)\" , Startdate as \"([^\"]*)\" , Enddate as \"([^\"]*)\" ,  EventColor as \"([^\"]*)\" , Description as \"([^\"]*)\"$")
    public void user_Input_Title_as_Startdate_as_Enddate_as_EventColor_as_Description_as(String Title, String Startdate, String Enddate, String EventColor, String Description) throws Throwable {
     obj.AddeventInput(driver,Title,Startdate,Enddate,EventColor,Description);
    }

    @When("^user click on Add Event$")
    public void user_click_on_Add_Event() throws Throwable {
      obj.AddEvent(driver);

    }

    @Then("^User should be able to create an event$")
    public void user_should_be_able_to_create_an_event() throws Throwable {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"fc-content\"]")));
      boolean x=element.isDisplayed();
      System.out.println("value is " + x);
    }


    @When("^user leave all the input field as blank and click on Add Event$")
    public void user_leave_all_the_input_field_as_blank_and_click_on_Add_Event() throws Throwable {
      obj.InputfieldblankAddevent(driver);
    }

    @Then("^user should get warning message as “Title & Start is required“$")
    public void user_should_get_warning_message_as_Title_Start_is_required() throws Throwable {
     obj.WarningMessage(driver);
    }

}
