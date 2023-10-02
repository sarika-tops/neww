package TestNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.DriverConnection;

// 16. W.a. TestNG program to check gmail login using with @beforetest,@aftertest,@Test

public class Que_16 {
	        WebDriver driver = null;
	        @BeforeTest
	        public void before() {
	        	        driver = new DriverConnection().getConnection();
	        	        driver.get("https://accounts.google.com/");
	        }
	        @Test
	        public void login() {
	        	WebElement ele = driver.findElement(By.id("identifierId"));
	        	ele.sendKeys("java123@gmail.com");
	        	WebElement ele2 = driver.findElement(By.xpath("//div[@id='identifierNext']/div/button/span"));
	        	ele2.click();
	        }
//	        @AfterTest
//	        public void after() {
//	        	        driver.close();
//	        }
}
