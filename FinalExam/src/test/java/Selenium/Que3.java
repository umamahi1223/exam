package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		try {
			WebDriver driver  = new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			WebElement usericon =driver.findElement(By.xpath("((//ul[@class = 'navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
			WebElement reglink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
			Actions action = new Actions(driver);
			action.moveToElement(usericon);
			action.click(reglink).build().perform();
			driver.quit(); 		
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
