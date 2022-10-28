package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.LoginPagesPoonam;
import pages.PoonamAddProduct;
import pages.PoonamEditProduct;

import java.util.concurrent.TimeUnit;

public class ProductStepsPoonam extends CommonFunctionsPoonam{
    LoginPagesPoonam lp = new LoginPagesPoonam(driver);
    PoonamAddProduct AP = new PoonamAddProduct(driver);
    PoonamEditProduct EP = new PoonamEditProduct(driver);


        @Given("^I login to the application and on home page$")
    public void i_login_to_the_application_and_on_home_page() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/home");
        lp.setEmailfld("admin@gic.com");
        lp.setPasswordfld("Admin123");
        lp.clickLogin();
        driver.manage().timeouts().implicitlyWait(10,Timeunit.SECONDS);
        driver.navigate().to("http://3.13.126.58/AMS3.0/home");

    }

    @When("^I navigate to Add Product page$")
    public void i_navigate_to_Add_Product_page() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/products");
        lp.clickAddProduct();
    }

    @When("^enter all the valid data and click on Add product$")
    public void enter_all_the_valid_data_and_click_on_Add_product() throws Throwable {
        AP.setnamefld("Name-product3");
        AP.setdetailsfld("details-product3");
        AP.setPricefld("2.222");
        driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/form/div[4]/div/input")).click();
        //AP.clickAddProductbtn();
         }

    @Then("^a new product should be added successfully$")
    public void a_new_product_should_be_added_successfully() throws Throwable {
       }

    @When("^I am on Products page and search new added product$")
    public void i_am_on_Products_page_and_search_new_added_product() throws Throwable {
        driver.get("http://3.13.126.58/AMS3.0/products");
        EP.setSearchfld("Name-product03");
        EP.setEnterfld(Keys.RETURN);
        driver.findElement(By.xpath("//*[@id=\"fileData\"]/tbody/tr/td[6]/center/div/a[1]")).click();

    }
    @When("^click on Edit Product and I edited product and click on update product$")
    public void click_on_Edit_Product_and_I_edited_product_and_click_on_update_product() throws Throwable {
        EP.senamefield("Name-product03-updated");
        EP.sedetailsfld("details-product03-updated");
        EP.sePricefld("3.444");
        EP.clickUpdateProductbtnbtn();
        //driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/form/div[4]/div/input")).click();
    }

    @Then("^I should be able to update product$")
    public void i_should_be_able_to_update_product() throws Throwable {
    }
        }



