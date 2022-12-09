package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentReportManager;

public class PO_xlogist {
	WebDriver driver = null;
	public PO_xlogist(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how=How.XPATH,using="//input [@type='email']")
	WebElement mail;
	@FindBy(how=How.XPATH,using="(//input [@type='password'])")
	WebElement password;
	@FindBy(how =How.XPATH,using="(//button [@type='submit'])")
	WebElement signin;
	@FindBy(how= How.XPATH,using="/html/body/div[1]/div/div[1]/ul/li[8]/a")
	WebElement coupon;
	@FindBy(how= How.XPATH,using="(//a[@class='btn btn-success btn-flat m-b-10 m-l-5'])")
	WebElement addcoupon;
	@FindBy(how= How.XPATH,using="(//input[@id='coupon_name'])")
	WebElement entercoupon;
	@FindBy(how= How.XPATH,using="(//button[@type='submit'])")
	WebElement add;
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div[1]/div[1]/div/div/h1")
	WebElement Success;
	@FindBy(how=How.XPATH,using="(//span[@id='coupon_err_msg'])")
	WebElement errormessage;
	
	
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
		public void Coupon() {

			coupon.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click coupon:  " , "coupon list is apperared");
			}
		
		public void Addcoupon() {

			addcoupon.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click add coupon:  " , "next tab is opened");
			}
		
		public void Entercoupon(String coupon1) {

			entercoupon.sendKeys(coupon1);
			ExtentReportManager.extentTest.log(LogStatus.INFO, "entering the coupon  " , "coupon is :"+coupon1);
			}
		
		public void Add() {

			add.click();
			ExtentReportManager.extentTest.log(LogStatus.INFO, "click add:  " , "clicked add button");
			}
		public void valid(String email,String pswrd,String coupon1,String expectedresult) {
			try {
			Email(email);
			Password(pswrd);
			Signin();
			Coupon();
			Addcoupon();
			Entercoupon(coupon1);
			Add();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+Success.getText().trim());
			if(expectedresult.equals(Success.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		public void character1(String email,String pswrd,String coupon1,String expectedresult) {
			try {
			Email(email);
			Password(pswrd);
			Signin();
			Coupon();
			Addcoupon();
			Entercoupon(coupon1);
			Add();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+errormessage.getText().trim());
			if(expectedresult.equals(errormessage.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		public void character2(String email,String pswrd,String coupon1,String expectedresult) {
			try {
			Email(email);
			Password(pswrd);
			Signin();
			Coupon();
			Addcoupon();
			Entercoupon(coupon1);
			Add();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+errormessage.getText().trim());
			if(expectedresult.equals(errormessage.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		public void character3(String email,String pswrd,String coupon1,String expectedresult) {
			try {
			Email(email);
			Password(pswrd);
			Signin();
			Coupon();
			Addcoupon();
			Entercoupon(coupon1);
			Add();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+errormessage.getText().trim());
			if(expectedresult.equals(errormessage.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		public void character4(String email,String pswrd,String coupon1,String expectedresult) {
			try {
			Email(email);
			Password(pswrd);
			Signin();
			Coupon();
			Addcoupon();
			Entercoupon(coupon1);
			Add();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+errormessage.getText().trim());
			if(expectedresult.equals(errormessage.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		public void character5(String email,String pswrd,String coupon1,String expectedresult) {
			try {
			Email(email);
			Password(pswrd);
			Signin();
			Coupon();
			Addcoupon();
			Entercoupon(coupon1);
			Add();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+errormessage.getText().trim());
			if(expectedresult.equals(errormessage.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		public void character6(String email,String pswrd,String coupon1,String expectedresult) {
			try {
			Email(email);
			Password(pswrd);
			Signin();
			Coupon();
			Addcoupon();
			Entercoupon(coupon1);
			Add();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+errormessage.getText().trim());
			if(expectedresult.equals(errormessage.getText())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "test passed");
			}
			else {
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "test failed");
			}
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		public void character(String email,String pswrd,String coupon1,String expectedresult) {
			try {
			Email(email);
			Password(pswrd);
			Signin();
			Coupon();
			Addcoupon();
			Entercoupon(coupon1);
			Add();
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expected Result:"+expectedresult,"Actual Result:"+errormessage.getText().trim());
			if(expectedresult.equals(errormessage.getText())) {
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
		
		

