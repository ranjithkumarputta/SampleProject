package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMListUserPageSwetha {
    private WebDriver driver;

    @FindBy(xpath = "//a[@data-original-title=\"Edit User\"]")
    private WebElement editUserBtn;

    @FindBy(xpath ="//input[@type=\"search\"]")
    private WebElement searchBox;

    @FindBy(xpath ="//table[@id=\"fileData\"]/tbody/tr[1]/td[3]")
    private WebElement emailID;




    public IMListUserPageSwetha(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickEditUserBtn(){

        editUserBtn.click();
    }

    public void setSearchBox(String name){

        searchBox.sendKeys(name);
    }

    public String getSearchedEmail(){
        return emailID.getText();

    }

}
