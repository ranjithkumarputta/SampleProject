package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SalespageSmitha {
    private WebDriver driver;
    public SalespageSmitha(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class=\"mm_sales\"]")
    private WebElement saleclick;
    @FindBy(xpath = "//a[@id='sales_index']")
    private WebElement saleoption2;
    @FindBy(xpath = "//a[@id='sales_add']")
    private WebElement saleoption3;
    @FindBy(xpath = "//a[@id='sales_quotes']")
    private WebElement saleoption4;
    @FindBy(xpath = "//a[@id='sales_add_quote']")
    private WebElement saleoption5;
    @FindBy(xpath = "//a[@id='sales_index']")
    private WebElement listent;
    @FindBy(name = "fileData_length")
    private WebElement showdrp;
    @FindBy(xpath = "//span[contains(text(),'Copy')]")
    private WebElement copybtn;
    @FindBy(xpath="//span[contains(text(),'CSV')]")
    private  WebElement csvdwn;
    @FindBy(xpath = "//span[contains(text(),'Excel')]")
    private  WebElement exceldwn;
    @FindBy(xpath = "//span[contains(text(),'PDF')]")
    private WebElement pdfdwn;
    @FindBy(xpath="//tbody/tr[@id='282']/td[10]/div[1]/div[1]/button[1]")
    private  WebElement actiondrp;
    @FindBy(xpath = "//tbody/tr[@id='282']/td[10]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement invoiceopt;
    @FindBy(xpath="//tbody/tr[@id='282']/td[10]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    private WebElement payopt;
    @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[3]/button[1]")
    private WebElement pclosebtn;
    @FindBy(xpath="//tbody/tr[@id='282']/td[10]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    private WebElement addpaytxt;
    @FindBy(xpath="//body/div[@id='payModal']/div[1]/div[1]/div[3]/button[1]")
    private WebElement addclosebtn;
    @FindBy(xpath ="//tbody/tr[@id='282']/td[10]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement editintxt;
    @FindBy(xpath = "//body/div[3]/div[4]/div[1]/form[1]/div[12]/input[1]")
    private WebElement updateinbtn;
    @FindBy(xpath = "//tbody/tr[@id='282']/td[10]/div[1]/div[1]/ul[1]/li[5]/a[1]")
    private WebElement downloadpdftxt;
    @FindBy(xpath = "//tbody/tr[@id='282']/td[10]/div[1]/div[1]/ul[1]/li[6]/a[1]")
    private WebElement emailtxt;
    @FindBy(xpath = "//body/div[@id='emailModal']/div[1]/div[1]/div[3]/button[2]")
    private WebElement emailclosebtn;
    @FindBy(xpath = "//tbody/tr[@id='282']/td[10]/div[1]/div[1]/ul[1]/li[7]/a[1]")
    private WebElement deleteinvoicetxt;

    public void salesclick(){
        wait(saleclick);
        saleclick.click();
    }
    public void saleopt(){
        wait(saleoption2);
        action(saleoption2);
        wait(saleoption3);
        action(saleoption3);
        wait(saleoption4);
        action(saleoption4);
        wait(saleoption5);
        action(saleoption5);
        wait(saleoption5);
    }
    public void listentry(){
        wait(listent);
        action(listent);
    }
    public void showdropdown(){
        showdrp.click();
    }
    public void selectdrp(){
        Select drp = new Select(showdrp);
        List<WebElement> lst = drp.getOptions();
        for (int i = 0; i < lst.size(); i++) {
            String a = lst.get(i).getText();
            System.out.println(a);
            drp.selectByIndex(i);
            //drp.selectByVisibleText(a);
        }
    }
    public void copypage(){
        wait(copybtn);
        copybtn.click();
    }
    public void csvdownload(){
        wait(csvdwn);
        csvdwn.click();
    }
    public  void exceldownload(){
        wait(exceldwn);
        exceldwn.click();
    }
    public void  pdfdownload(){
        wait(pdfdwn);
        pdfdwn.click();
    }
    public void actiondropdown(){
        actiondrp.click();
    }
    public void actionoption () {
        invoiceopt.click();
        action(actiondrp);
        System.out.println("Invoice");
    }
    public void payment(){
        System.out.println("entering payment method");
        action(actiondrp);
        payopt.click();
    }
    public void paymentclose(){

        pclosebtn.click();
    }
    public void addpay(){
        action(actiondrp);
        addpaytxt.click();
    }
    public void addclose(){
        addclosebtn.click();
    }
    public void editinvoice(){
        action(actiondrp);
        editintxt.click();
    }
    public void updateinvoice(){
        updateinbtn.click();
    }
    public void downloadpdf(){
        action(actiondrp);
        downloadpdftxt.click();
    }
    public void emailinvoice(){
        action(actiondrp);
        emailtxt.click();
    }
    public void closeemail(){
        emailclosebtn.click();
    }
    public void deleteinvoice(){
        action(actiondrp);
        deleteinvoicetxt.click();
    }
    public void alertclose(){
        Alert alert= driver.switchTo().alert();
        String message=driver.switchTo().alert().getText();
        System.out.println(message);
        alert.dismiss();
    }
    private  void action(WebElement element){
        Actions action = new Actions(driver);
        wait(element);
        action.moveToElement(element).click().perform();
    }
    private void wait( WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

}
