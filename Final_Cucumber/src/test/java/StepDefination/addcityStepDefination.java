package StepDefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PO.Addcity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class addcityStepDefination {
    public WebDriver driver;
    public Addcity obj;

   

    @Given("Chrome browser")
    public void chrome_browser() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj = new Addcity(driver);
    }
    
    @When("User opens URL {string}")
    public void user_opens_url(String url) {
    	driver.get(url);
    }
    @When("User enters Email as {string} and password as {string} and click on Login")
    public void user_enters_email_as_and_password_as_and_click_on_login(String uname, String pswrd) {
    	 obj.enterEmailAndPassword(uname, pswrd);
         obj.ClickLogin();
    }
    @When("user click on Location")
    public void user_click_on_location() {
        obj.Clickcity();
    }
    @Then("click on city")
    public void click_on_city() {
        obj.Clickcity();
    }
    @Then("click on add city and enter the city as {string}")
    public void click_on_add_city_and_enter_the_city_as(String name) {
        obj.Clickaddcity();
        obj.entercityname(name);
    }
    @Then("click on add")
    public void click_on_add() {
    	obj.Clickadd();
       
    }
    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
    	
    	Assert.assertEquals(title,driver.getTitle());
    }
    @Then("close browser")
    public void close_browser() {
    	driver.quit();
       
    }



}



