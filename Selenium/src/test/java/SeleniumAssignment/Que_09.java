package SeleniumAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// 9. W.A.J. Script How to handled Alert in selenium "http://demo.guru99.com/test/delete_customer.php"

public class Que_09 {
            public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new DriverConnection().getConnection("http://demo.guru99.com/test/delete_customer.php");
			
			driver.findElement(By.name("cusid")).sendKeys("53920");
			
			WebElement submit = driver.findElement(By.name("submit"));
			submit.click();
			
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			}
}
