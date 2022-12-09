package Testcases;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import PO.PO_xlogist;
import Utility.BrowserManager;
import Utility.ExtentReportManager;

public class Xlogist_Testcases {
	WebDriver driver;
	JSONObject add_coupon;
	@BeforeClass
	public void beforeclass()throws InterruptedException{
		InputStream details = null;
		String Filename = "Data/xlogist.json";
		details = getClass().getClassLoader().getResourceAsStream(Filename);
		JSONTokener Tokener = new JSONTokener(details);
		add_coupon= new JSONObject(Tokener);
		System.out.println("the data is :"+add_coupon);
		ExtentReportManager.createReport("add_Coupon");
	}
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser, String url) {
		try {
	driver = BrowserManager.getDriver(browser);
	Thread.sleep(2000);
	driver.get(url);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Thread.sleep(2000);
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	@Test(priority=1)
	public void Valid() {
		ExtentReportManager.startTest("valid coupon");
		String Email = add_coupon.getJSONObject("valid").getString("email");
		String Password = add_coupon.getJSONObject("valid").getString("pswrd");
		String Entercoupon = add_coupon.getJSONObject("valid").getString("coupon");
		String expectedresult = add_coupon.getJSONObject("valid").getString("expectedresult");
		PO_xlogist obj = PageFactory.initElements(driver,PO_xlogist.class );
		obj.valid(Email, Password,Entercoupon,expectedresult);			
	}
	@Test(priority=2)
	public void Char1() {
		ExtentReportManager.startTest("coupon with 1 character");
		String Email = add_coupon.getJSONObject("char1").getString("email");
		String Password = add_coupon.getJSONObject("char1").getString("pswrd");
		String Entercoupon = add_coupon.getJSONObject("char1").getString("coupon");
		String expectedresult = add_coupon.getJSONObject("char1").getString("expectedresult");
		PO_xlogist obj = PageFactory.initElements(driver,PO_xlogist.class );
		obj.character1(Email, Password,Entercoupon,expectedresult);			
	}
	@Test(priority=3)
	public void Empty() {
		ExtentReportManager.startTest("empty coupon");
		String Email = add_coupon.getJSONObject("empty").getString("email");
		String Password = add_coupon.getJSONObject("empty").getString("pswrd");
		String Entercoupon = add_coupon.getJSONObject("empty").getString("coupon");
		String expectedresult = add_coupon.getJSONObject("empty").getString("expectedresult");
		PO_xlogist obj = PageFactory.initElements(driver,PO_xlogist.class );
		obj.character2(Email, Password,Entercoupon,expectedresult);			
	}
	@Test(priority=4)
	public void Char26() {
		ExtentReportManager.startTest(" more than 26 characters as coupon");
		String Email = add_coupon.getJSONObject("char26").getString("email");
		String Password = add_coupon.getJSONObject("char26").getString("pswrd");
		String Entercoupon = add_coupon.getJSONObject("char26").getString("coupon");
		String expectedresult = add_coupon.getJSONObject("char26").getString("expectedresult");
		PO_xlogist obj = PageFactory.initElements(driver,PO_xlogist.class );
		obj.character3(Email, Password,Entercoupon,expectedresult);			
	}
	@Test(priority=5)
	public void splcharwithnum() {
		ExtentReportManager.startTest("special char with num as coupon");
		String Email = add_coupon.getJSONObject("splcharwithnum").getString("email");
		String Password = add_coupon.getJSONObject("splcharwithnum").getString("pswrd");
		String Entercoupon = add_coupon.getJSONObject("splcharwithnum").getString("coupon");
		String expectedresult = add_coupon.getJSONObject("splcharwithnum").getString("expectedresult");
		PO_xlogist obj = PageFactory.initElements(driver,PO_xlogist.class );
		obj.character4(Email, Password,Entercoupon,expectedresult);			
	}
	@Test(priority=6)
	public void splcharwithalpha() {
		ExtentReportManager.startTest("splcharwithalpha coupon");
		String Email = add_coupon.getJSONObject("valid").getString("email");
		String Password = add_coupon.getJSONObject("valid").getString("pswrd");
		String Entercoupon = add_coupon.getJSONObject("splcharwithalpha").getString("coupon");
		String expectedresult = add_coupon.getJSONObject("splcharwithalpha").getString("expectedresult");
		PO_xlogist obj = PageFactory.initElements(driver,PO_xlogist.class );
		obj.character5(Email, Password,Entercoupon,expectedresult);			
	}
	@Test(priority=7)
	public void couponwithspace() {
		ExtentReportManager.startTest("coupon with space");
		String Email = add_coupon.getJSONObject("valid").getString("email");
		String Password = add_coupon.getJSONObject("valid").getString("pswrd");
		String Entercoupon = add_coupon.getJSONObject("couponwithspace").getString("coupon");
		String expectedresult = add_coupon.getJSONObject("couponwithspace").getString("expectedresult");
		PO_xlogist obj = PageFactory.initElements(driver,PO_xlogist.class );
		obj.character6(Email, Password,Entercoupon,expectedresult);			
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		ExtentReportManager.extentReport.endTest(ExtentReportManager.extentTest);
		
	}
	@AfterClass
	public void afterclass()
	{
		ExtentReportManager.extentReport.flush();
	}
}
