package Testcases;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import PO.PO_Ecommerce;
import Utility.BrowserManager;
import Utility.ExtentReportManager;

public class Ecommerce_Testcases {
	WebDriver driver;
	JSONObject update;
	@BeforeClass
	public void beforeclass()throws InterruptedException{
		InputStream details = null;
		String Filename = "Data/ecommerce.json";
		details = getClass().getClassLoader().getResourceAsStream(Filename);
		JSONTokener Tokener = new JSONTokener(details);
		update= new JSONObject(Tokener);
		System.out.println("the data is :"+update);
		ExtentReportManager.createReport("update");
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
		ExtentReportManager.startTest("image upload");
		String Email = update.getJSONObject("valid").getString("email");
		String Password = update.getJSONObject("valid").getString("pswrd");
		String Browser = update.getJSONObject("valid").getString("image");
		String expectedresult = update.getJSONObject("valid").getString("expectedresult");
		PO_Ecommerce obj = PageFactory.initElements(driver,PO_Ecommerce.class );
		obj.uploadimage(Email, Password,Browser,expectedresult);	
		
	}
	@Test(priority=2)
	public void uploadcategory2() {
		ExtentReportManager.startTest("empty upload");
		String Email = update.getJSONObject("valid").getString("email");
		String Password = update.getJSONObject("valid").getString("pswrd");
		String name = update.getJSONObject("empty").getString("image");
		String expectedresult = update.getJSONObject("empty").getString("expectedresult");
		PO_Ecommerce obj = PageFactory.initElements(driver,PO_Ecommerce.class );
		obj.uploadcategory1(Email, Password,name,expectedresult);	
		
	}
	
	@Test(priority=3)
	public void uploadcategory3() {
		ExtentReportManager.startTest("char1 upload");
		String Email = update.getJSONObject("valid").getString("email");
		String Password = update.getJSONObject("valid").getString("pswrd");
		String name = update.getJSONObject("char1").getString("image");
		String expectedresult = update.getJSONObject("char1").getString("expectedresult");
		PO_Ecommerce obj = PageFactory.initElements(driver,PO_Ecommerce.class );
		obj.uploadcategory2(Email, Password,name,expectedresult);	
		
	}
	@Test(priority=4)
	public void uploadcategory4() {
		ExtentReportManager.startTest("num upload");
		String Email = update.getJSONObject("valid").getString("email");
		String Password = update.getJSONObject("valid").getString("pswrd");
		String name = update.getJSONObject("num").getString("image");
		String expectedresult = update.getJSONObject("num").getString("expectedresult");
		PO_Ecommerce obj = PageFactory.initElements(driver,PO_Ecommerce.class );
		obj.uploadcategory3(Email, Password,name,expectedresult);	
		
	}
	@Test(priority=5)
	public void uploadcategory5() {
		ExtentReportManager.startTest("alphanum upload");
		String Email = update.getJSONObject("valid").getString("email");
		String Password = update.getJSONObject("valid").getString("pswrd");
		String name = update.getJSONObject("alphanum").getString("image");
		String expectedresult = update.getJSONObject("alphanum").getString("expectedresult");
		PO_Ecommerce obj = PageFactory.initElements(driver,PO_Ecommerce.class );
		obj.uploadcategory4(Email, Password,name,expectedresult);	
		
	}
	@Test(priority=6)
	public void uploadcategory6() {
		ExtentReportManager.startTest("image upload");
		String Email = update.getJSONObject("valid").getString("email");
		String Password = update.getJSONObject("valid").getString("pswrd");
		String name = update.getJSONObject("splnum").getString("image");
		String expectedresult = update.getJSONObject("splnum").getString("expectedresult");
		PO_Ecommerce obj = PageFactory.initElements(driver,PO_Ecommerce.class );
		obj.uploadcategory5(Email, Password,name,expectedresult);	
		
	}
	@Test(priority=7)
	public void uploadcategory7() {
		ExtentReportManager.startTest("namespace upload");
		String Email = update.getJSONObject("valid").getString("email");
		String Password = update.getJSONObject("valid").getString("pswrd");
		String name = update.getJSONObject("namespace").getString("image");
		String expectedresult = update.getJSONObject("namespace").getString("expectedresult");
		PO_Ecommerce obj = PageFactory.initElements(driver,PO_Ecommerce.class );
		obj.uploadcategory6(Email, Password,name,expectedresult);	
		
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
