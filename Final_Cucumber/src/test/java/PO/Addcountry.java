package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcountry {
public WebDriver ldriver;   
    
    public Addcountry(WebDriver ldriver)
    {
        PageFactory.initElements(ldriver,this);
    }

    @FindBy(xpath="//input[@id='useremail']")
    @CacheLookup
    WebElement useremail_login;
    
    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    WebElement password_login;
    
    @FindBy(xpath = "(//button[@type='submit'])")
    @CacheLookup
    WebElement loginbutton;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
    @CacheLookup
    WebElement location;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[1]/a")
    @CacheLookup
    WebElement country;
    @FindBy(xpath = "(//a[@class='btn btn-success btn-flat m-b-10 m-l-5'])")
    @CacheLookup
    WebElement addcountry;
    @FindBy(xpath = "(//input[@id='Country'])")
    @CacheLookup
    WebElement countryname;
    //(//button[@onclick='return validate()'])
    @FindBy(xpath = "(//button[@onclick='return validate()'])")
    @CacheLookup
    WebElement add;

public void enterEmailAndPassword(String str1, String str2) {
    useremail_login.sendKeys(str1);
    password_login.sendKeys(str2);
}
public void ClickLogin() {
    loginbutton.click();
}
public void Clicklocation() {
	location.click();
}
public void Clickcountry() {
	country.click();
}

public void Clickaddcountry() {
	addcountry.click();
}
public void entercountryname(String name) {
	countryname.sendKeys(name);
}
public void Clickadd() {
	add.click();
}







}