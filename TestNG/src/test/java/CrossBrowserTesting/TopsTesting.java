package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.ExceptionHandler;

public class TopsTesting {
	       @Parameters("browser")
	       @Test
            public void test(String browser) {
            	        WebDriver driver = null;
            	        if (browser.equals("chrome")) {
            	        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarika Namsha\\Downloads\\Webdriver\\chromedriver.exe");
            	        	 driver = new ChromeDriver();
            	        }
            	        if (browser.equals("ff")) {
            	        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sarika Namsha\\Downloads\\Webdriver\\geckodriver.exe");
            	        	driver =  new FirefoxDriver();
            	        }
            	        if (browser.equals("edge")) {
            	        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sarika Namsha\\Downloads\\Webdriver\\msedgedriver.exe");
            	        	driver =  new EdgeDriver();
            	        }
            	        driver.get("https://careercenter.tops-int.com/");
	       }
            	        @Test
            	        public void login() {
//						driver.findElement(By.id("mobile")).sendKeys("7041480673");
//            	        driver.findElement(By.id("password")).sendKeys("7041480673");
//            	        driver.findElement(By.xpath("//input[@value='Login']")).click();
            	        }
}
