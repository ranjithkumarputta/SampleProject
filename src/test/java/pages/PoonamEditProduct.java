package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoonamEditProduct {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"search_table\"]")
    private WebElement searchfld;

    @FindBy(xpath="//*[@id=\"search_table\"]")
    private WebElement enterfld;

        @FindBy (xpath = "//*[@id=\"name\"]")
        private WebElement namefield;
        @FindBy(xpath = "//*[@id=\"details\"]")
        private WebElement detailsfld;

        @FindBy(xpath = "//*[@id=\"price\"]")
        private WebElement pricefld;


        @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/form/div[4]/div/input")
                private WebElement UpdateProductbtn;


    public PoonamEditProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSearchfld(String name) {searchfld.sendKeys(name);}
    public void setEnterfld(Keys name){enterfld.sendKeys(Keys.RETURN);}
            public void senamefield(String name) {namefield.sendKeys(name);}
            public void sedetailsfld(String details){detailsfld.sendKeys(details);}

         public void sePricefld (String price){pricefld.sendKeys(price);}
            

    public void clickUpdateProductbtnbtn() {UpdateProductbtn();}

    private void UpdateProductbtn() {
    }


}

