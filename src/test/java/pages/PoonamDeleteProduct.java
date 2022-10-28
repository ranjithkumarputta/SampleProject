package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoonamDeleteProduct {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"search_table\"]")
    private WebElement searchfld;

    @FindBy(xpath = "//*[@id=\"search_table\"]")
    private WebElement enterfld;

    @FindBy(xpath = "\"//*[@id=\\\"fileData\\\"]/tbody/tr[2]/td[6]/center/div/a[2]/i\"")
    private WebElement Deletebtn;

        public PoonamDeleteProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSearchfld(String name) {searchfld.sendKeys(name);}
    public void setEnterfld(Keys name){enterfld.sendKeys(Keys.RETURN);}

    public void clickDeleteProductbtn() {clickDeleteProductbtn();}
}
