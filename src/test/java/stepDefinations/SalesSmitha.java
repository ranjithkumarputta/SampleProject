package stepDefinations;

import pages.Salespage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sales  extends CommonFunction {
    private Salespage saleobj;
    public Sales()  {
        saleobj= new Salespage(driver);
    }
    @Given("^user on IM home page$")
    public void user_on_IM_home_page() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/auth/login/home");
    }
    @When("^user clicks on sales menu$")
    public void user_clicks_on_sales_menu() throws Throwable {
        saleobj.salesclick();
    }
    @Then("^user should able to see options under sales$")
    public void user_should_able_to_see_options_under_sales() throws Throwable {
        saleobj.saleopt();
    }
    @Given("^user  on  invoice page$")
    public void user_on_invoice_page() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/sales");
    }
    @When("^user clicks on  show entry selection box$")
    public void user_clicks_on_show_entry_selection_box() throws Throwable {
        saleobj.listentry();
        saleobj.showdropdown();
    }
    @Then("^user should be able to select no of entries per page by clicking on entries$")
    public void user_should_be_able_to_select_no_of_entries_per_page_by_clicking_on_entries() throws Throwable {
        saleobj.selectdrp();
    }
    @When("^user navigates to sales page and click on copy button$")
    public void user_navigates_to_sales_page_and_click_on_copy_button() throws Throwable {
        saleobj.copypage();
    }
    @Then("^able to copy the data$")
    public void able_to_copy_the_data() throws Throwable {
    }
    @When("^user navigates to sales page and click on csv button$")
    public void user_navigates_to_sales_page_and_click_on_csv_button() throws Throwable {
        saleobj.csvdownload();
    }
    @Then("^user should able to download in csv format$")
    public void user_should_able_to_download_in_csv_format() throws Throwable {
    }
    @When("^user navigates to sales page and click on Excel button$")
    public void user_navigates_to_sales_page_and_click_on_Excel_button() throws Throwable {
        saleobj.exceldownload();
    }
    @Then("^user should able to download in Excel format$")
    public void user_should_able_to_download_in_Excel_format() throws Throwable {
    }
    @When("^user navigates to sales page and click on PDF button$")
    public void user_navigates_to_sales_page_and_click_on_PDF_button() throws Throwable {
        saleobj.pdfdownload();
    }
    @Then("^user should able to download in PDF format$")
    public void user_should_able_to_download_in_PDF_format() throws Throwable {
    }
    @When("^user clicks on action button user should  able to see all options under action button$")
    public void user_clicks_on_action_button_user_should_able_to_see_all_options_under_action_button() throws Throwable {
        Thread.sleep(3000);
        saleobj.actiondropdown();
        Thread.sleep(3000);
    }
    @Then("^clicking on each options able to see popup page  related to that option$")
    public void clicking_on_each_options_able_to_see_popup_page_related_to_that_option() throws Throwable {
        saleobj.actionoption();
        Thread.sleep(2000);
    }
    @When("^user clicks on payment option$")
    public void user_clicks_on_payment_option() throws Throwable {
        Thread.sleep(1000);
        saleobj.payment();
        Thread.sleep(1000);
    }
    @Then("^user should able to see popup page payment$")
    public void user_should_able_to_see_popup_page_payment() throws Throwable {
       saleobj.paymentclose();
    }
    @When("^user clicks on add payment option$")
    public void user_clicks_on_add_payment_option() throws Throwable {
        Thread.sleep(1000);
        saleobj.addpay();
        Thread.sleep(1000);
    }
    @Then("^user should able to see popup page add payment$")
    public void user_should_able_to_see_popup_page_add_payment() throws Throwable {
        saleobj.addclose();
    }
    @When("^user clicks on edit invoice option$")
    public void user_clicks_on_edit_invoice_option() throws Throwable {
        Thread.sleep(1000);
        saleobj.editinvoice();
        Thread.sleep(1000);
    }
    @Then("^user should able to see popup page edit invoice$")
    public void user_should_able_to_see_popup_page_edit_invoice() throws Throwable {
        Thread.sleep(1000);
        saleobj.updateinvoice();
        Thread.sleep(1000);
    }
    @When("^user clicks on download as pdf option$")
    public void user_clicks_on_download_as_pdf_option() throws Throwable {
       Thread.sleep(1000);
        saleobj.downloadpdf();
       Thread.sleep(1000);
    }
    @Then("^user should able to  perform download action$")
    public void user_should_able_to_perform_download_action() throws Throwable {
    }
    @When("^user clicks on email invoice option$")
    public void user_clicks_on_email_invoice_option() throws Throwable {
       Thread.sleep(1000);
        saleobj.emailinvoice();
      Thread.sleep(1000);
    }
    @Then("^user should able to  send invoice$")
    public void user_should_able_to_send_invoice() throws Throwable {
        saleobj.closeemail();
    }
    @When("^user clicks on delete invoice option$")
    public void user_clicks_on_delete_invoice_option() throws Throwable {
        Thread.sleep(1000);
        saleobj.deleteinvoice();
       Thread.sleep(1000);
    }
    @Then("^user should able to  see popup message and able to close it$")
    public void user_should_able_to_see_popup_message_and_able_to_close_it() throws Throwable {
        saleobj.alertclose();
        System.out.println("alert accepted");
    }

}
