package Gitcheckout.Samplecheck;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class sampletest {
	
	@Test
	public void jenkins() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("Abdulkalam");
	driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	}

}