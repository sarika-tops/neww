package SeleniumAssignment;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A001_Website {
       public static void main(String[] args) throws InterruptedException {
       String url = "https://phptravels.com/demo/";
	   WebDriver driver = new DriverConnection().getConnection(url);
	   
	   driver.findElement(By.name("first_name")).sendKeys("Angel");
	   driver.findElement(By.name("last_name")).sendKeys("Dsouza");
	   driver.findElement(By.name("business_name")).sendKeys("Tester");
	   driver.findElement(By.name("email")).sendKeys("adsouza@gmail.com");
	   
	   WebElement num1 = driver.findElement(By.id("numb1"));
	   String s1 = num1.getText();
	   int n1 = Integer.parseInt(s1);
	   
	   WebElement num2 = driver.findElement(By.id("numb2"));
	   String s2 = num2.getText();
	   int n2 = Integer.parseInt(s2);
	   int n3 = n1+n2;
	   
	   String s3 = String.valueOf(n3);
	   WebElement res = driver.findElement(By.id("number"));
	   res.sendKeys(s3);
	   Thread.sleep(2000);
	   driver.findElement(By.id("demo")).click();
	   Thread.sleep(2000);
	   
	   WebElement ele = driver.findElement(By.xpath("//div[@id='mynavbar']/div[1]/a[2]"));
	   ele.click();
	   
	   String mainWin = driver.getWindowHandle();
	   System.out.println("mainWin");
	   Set<String> allWin = driver.getWindowHandles();
	   for(String win : allWin) {
		   System.out.println(win);
		   if(!win.equals(mainWin)) {
			   driver.switchTo().window(win);
		   }
	   }
	   Thread.sleep(2000);
	   driver.findElement(By.id("inputFirstName")).sendKeys("Angel");
	   driver.findElement(By.id("inputLastName")).sendKeys("Dsouza");
	   driver.findElement(By.id("inputEmail")).sendKeys("adsouza@gmail.com");
	   driver.findElement(By.id("inputPhone")).sendKeys("7456981238");
	   driver.findElement(By.id("inputCompanyName")).sendKeys("XYZ");
	   driver.findElement(By.id("inputAddress1")).sendKeys("ABC");
	   driver.findElement(By.id("inputAddress2")).sendKeys("ABC");
	   driver.findElement(By.id("inputCity")).sendKeys("Ahmedabad");
	   driver.findElement(By.id("stateinput")).sendKeys("Gujrat");
	   driver.findElement(By.id("inputPostcode")).sendKeys("380004");
	   driver.findElement(By.id("inputCountry")).sendKeys("India");
	   driver.findElement(By.id("customfield2")).sendKeys("7456981238");
	   driver.findElement(By.id("inputNewPassword1")).sendKeys("ad@123456789");
	   driver.findElement(By.id("inputNewPassword2")).sendKeys("ad@123456789"); 
	   driver.findElement(By.xpath("//p[@align='center']/input")).click();
	}
}
