package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoonamAddProduct {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement namefld;

    @FindBy(xpath = "//*[@id=\"details\"]")
    private WebElement detailsfld;

    @FindBy(xpath = "//*[@id=\"price\"]")
    private WebElement pricefld;

    // @FindBy(xpath = "//*[@id=\"products_add\"]")
    //private WebElement AddProductbtn;

    public PoonamAddProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void setnamefld(String name) {
        namefld.sendKeys(name);
    }
    public void setdetailsfld(String details) {
        detailsfld.sendKeys(details);
    }
    public void setPricefld(String price) {
        pricefld.sendKeys(price);
    }
}
    //public void clickAddProductbtn(){AddProductbtn.click();}

    //}


