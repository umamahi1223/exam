package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentReportManager;

public class PO_Ecommerce {
	WebDriver driver = null;
	public PO_Ecommerce(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how=How.XPATH,using="//input [@type='email']")
	WebElement mail;
	@FindBy(how=How.XPATH,using="(//input [@type='password'])")
	WebElement password;
	@FindBy(how =How.XPATH,using="(//button [@type='submit'])")
	WebElement signin;
	@FindBy(how =How.XPATH,using="(//a[@class='sidebar-sub-toggle'])[2]")
	WebElement product;
	
	@FindBy(how =How.XPATH,using="/html/body/div[1]/div/div[1]/ul/li[3]/ul/li[1]/a")
	WebElement category;
	
	@FindBy(how =How.XPATH,using="(//a[@class='ti-image'])")
	WebElement image;
	
	@FindBy(how =How.XPATH,using="//input[@name='image']")
	WebElement browser;
	@FindBy(how=How.XPATH,using="(//button[@type='submit'])")
	WebElement update;
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div[1]/div[1]/div/div/h1")
	WebElement success;
	@FindBy(how=How.XPATH,using="(//a[@class='ti-pencil-alt'])[1]")
	WebElement update1;

	@FindBy(how=How.XPATH,using="(//input[@id='category_name'])")
	WebElement categoryname;
	@FindBy(how=How.XPATH,using="(//button[@type='submit']")
	WebElement submit;
	@FindBy(how=How.XPATH,using="//*[@id=\"editCategory\"]/div[1]/div/p")
	WebElement error;
	
	
	
	
	
	public void Email(String email) {
		mail.sendKeys(email);
		ExtentReportManager.extentTest.log(LogStatus.INFO,"entering the email","email is: "+ email);
		}
		public void Password(String pswrd) {
		password.sendKeys(pswrd);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "entering the password " ,"password is: " + pswrd);
		}

		public void Signin() {

		signin.click();
		ExtentReportManager.extentTest.log(LogStatus.INFO, "click sign_in:  " , "signin successful");
		}
		public void Product() {

			product.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click products:  " , "products opened successful");
			}
		public void Category() {

			category.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click category:  " , "category list opened successful");
			}
		public void imageaction() {

			image.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click update image:  " , "new tab opened to update");
			}
		
		public void Browser(String uimage) {

			browser.sendKeys(uimage);
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click upload image:  " , "image uploaded successful");
			}
		public void Update() {

			update.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click update :  " , " update button clicked");
			}
		public void Update1() {

			update1.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click update :  " , " update button clicked");
			}
		public void Categoryname(String name) {

			categoryname.sendKeys(name);
			categoryname.clear();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click categoryn :  " , " clicked");
			}
		public void Submit() {

         submit.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click update :  " , " update button clicked");
			}
		
		
		public void uploadimage(String email,String pswrd,String uimage ,String expectedresult) {
			try {
			Email(email);
			Thread.sleep(2000);
			Password(pswrd);
			Thread.sleep(2000);
			Signin();
			Thread.sleep(2000);
			Product();
			Thread.sleep(2000);
			Category();
			Thread.sleep(2000);
			imageaction();
			Thread.sleep(2000);
			Browser(uimage);
			Thread.sleep(2000);
			Update();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+success.getText().trim());
			if(expectedresult.equals(success.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
			
		}
		public void uploadcategory1(String email,String pswrd,String name,String expectedresult) {
			try {
			Email(email);
			Thread.sleep(2000);
			Password(pswrd);
			Thread.sleep(2000);
			Signin();
			Thread.sleep(2000);
			Product();
			Thread.sleep(2000);
			Category();
			Thread.sleep(2000);
			Update1();
			Thread.sleep(2000);
			Categoryname(name);
			Thread.sleep(2000);
			Submit();
			
		ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+error.getText().trim());
			if(expectedresult.equals(error.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
			
		}
		public void uploadcategory2(String email,String pswrd,String name,String expectedresult) {
			try {
			Email(email);
			Thread.sleep(2000);
			Password(pswrd);
			Thread.sleep(2000);
			Signin();
			Thread.sleep(2000);
			Product();
			Thread.sleep(2000);
			Category();
			Thread.sleep(2000);
			Update1();
			Thread.sleep(2000);
			Categoryname(name);
			Thread.sleep(2000);
			Submit();
			
		ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+success.getText().trim());
			if(expectedresult.equals(success.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
			
		}
		public void uploadcategory3(String email,String pswrd,String name,String expectedresult) {
			try {
			Email(email);
			Thread.sleep(2000);
			Password(pswrd);
			Thread.sleep(2000);
			Signin();
			Thread.sleep(2000);
			Product();
			Thread.sleep(2000);
			Category();
			Thread.sleep(2000);
			Update1();
			Thread.sleep(2000);
			Categoryname(name);
			Thread.sleep(2000);
			Submit();
			
		ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+error.getText().trim());
			if(expectedresult.equals(error.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
			
		}
		public void uploadcategory4(String email,String pswrd,String name,String expectedresult) {
			try {
			Email(email);
			Thread.sleep(2000);
			Password(pswrd);
			Thread.sleep(2000);
			Signin();
			Thread.sleep(2000);
			Product();
			Thread.sleep(2000);
			Category();
			Thread.sleep(2000);
			Update1();
			Thread.sleep(2000);
			Categoryname(name);
			Thread.sleep(2000);
			Submit();
			
		ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+success.getText().trim());
			if(expectedresult.equals(success.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
			
		}
		public void uploadcategory5(String email,String pswrd,String name,String expectedresult) {
			try {
			Email(email);
			Thread.sleep(2000);
			Password(pswrd);
			Thread.sleep(2000);
			Signin();
			Thread.sleep(2000);
			Product();
			Thread.sleep(2000);
			Category();
			Thread.sleep(2000);
			Update1();
			Thread.sleep(2000);
			Categoryname(name);
			Thread.sleep(2000);
			Submit();
			
		ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+success.getText().trim());
			if(expectedresult.equals(success.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
			
		}
		public void uploadcategory6(String email,String pswrd,String name,String expectedresult) {
			try {
			Email(email);
			Thread.sleep(2000);
			Password(pswrd);
			Thread.sleep(2000);
			Signin();
			Thread.sleep(2000);
			Product();
			Thread.sleep(2000);
			Category();
			Thread.sleep(2000);
			Update1();
			Thread.sleep(2000);
			Categoryname(name);
			Thread.sleep(2000);
			Submit();
			
		ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+success.getText().trim());
			if(expectedresult.equals(success.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
			
		}
}


