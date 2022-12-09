package Selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que4 {
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	try {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement confirmmail = driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
		WebElement Username = driver.findElement(By.xpath("//input[@id='Username']"));
		WebElement checkavailability = driver.findElement(By.xpath("//input[@id='check-availability-button']"));
		WebElement country = driver.findElement(By.xpath("//select[@id='CountryId']"));
		WebElement timezoneid = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='Newsletter']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		WebElement primarily = driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
		WebElement register = driver.findElement(By.xpath("//input[@type='submit']"));
		Select countrySelector = new Select(country);
		Select timezoneSelector = new Select(timezoneid);
		Select primarilySelector = new Select(primarily);
		firstName.sendKeys("mahi");
		Thread.sleep(2000);
        LastName.sendKeys("budireddy");
		Thread.sleep(2000);
		Email.sendKeys("umauma1@gmail.com");
		Thread.sleep(2000);
		confirmmail.sendKeys("umauma1@gmail.com");
		Thread.sleep(2000);
		Username.sendKeys("umauma1123");
		Thread.sleep(2000);
		checkavailability.click();
		Thread.sleep(8000);
		country.sendKeys("India");
		countrySelector.selectByVisibleText("India");
		Thread.sleep(2000);
		timezoneid.sendKeys("(UTC-10:00) Hawaii");
		timezoneSelector.selectByVisibleText("(UTC-10:00) Hawaii");
		Thread.sleep(1000);
		if(checkbox.isEnabled()) {
			checkbox.click();
		}
		Thread.sleep(1000);
		password.sendKeys("Mahimahi@2001");
		Thread.sleep(1000);
		confirmpassword.sendKeys("Mahimahi@2001");
		Thread.sleep(1000);
		primarily.sendKeys("I am student");
		Thread.sleep(1000);
		register.click();
		Thread.sleep(1000);
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//ScreenShot/screen.png"));
		driver.quit();
       }catch(Exception e) {
    	   e.printStackTrace();
    	   
       }
	}
}
