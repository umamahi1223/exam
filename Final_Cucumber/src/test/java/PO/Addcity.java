package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcity {
public WebDriver ldriver;  
    
    public Addcity(WebDriver ldriver)
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
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[3]/a")
    @CacheLookup
    WebElement city;
    @FindBy(xpath = "(//a[@class='btn btn-success btn-flat m-b-10 m-l-5'])")
    @CacheLookup
    WebElement addcity;
    @FindBy(xpath = "(//input[@id='city'])")
    @CacheLookup
    WebElement cityname;
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
public void Clickcity() {
	city.click();
}

public void Clickaddcity() {
	addcity.click();
}
public void entercityname(String name) {
	cityname.sendKeys(name);
}
public void Clickadd() {
	add.click();
}
}