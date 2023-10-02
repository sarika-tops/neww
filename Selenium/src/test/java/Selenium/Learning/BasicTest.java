package Selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTest {
	public static void main(String[] args) {
		 String url = "https://www.facebook.com/";
//	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarika Namsha\\Downloads\\chromedriver_win32\\");
//	      WebDriver driver = new ChromeDriver();
//	      driver.manage().window().maximize();
//	      driver.get(url);
//	      
//	      System.setProperty("webdriver.edge.driver", "C:\\Users\\Sarika Namsha\\Downloads\\edgedriver_win64\\");
//	      WebDriver driver = new EdgeDriver();
//	      driver.manage().window().maximize();
//	      driver.get(url);
//	      
	      System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sarika Namsha\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\\");
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get(url);
	      
	      String expectedResult = "facebook.com";
	      String actual = driver.getTitle();
	      System.out.println(actual);
	      if(expectedResult.equals(actual)) {
	    	  System.out.println("pass");
	      }
	      else {
	    	  System.out.println("fail");
	      }
	      WebElement email = driver.findElement(By.id("email"));
	      email.sendKeys("selenium@gmail.com");
	      WebElement password = driver.findElement(By.id("pass"));
	      password.sendKeys("pass");
	}

}
