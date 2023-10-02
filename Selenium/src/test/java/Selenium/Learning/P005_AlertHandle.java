package Selenium.Learning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P005_AlertHandle {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = new DriverConnection().getConnection(url);

		// 1. Alert
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		System.out.println("alert clicked");
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		// 2. Alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement alertButton1 = driver.findElement(By.id("timerAlertButton"));
		alertButton1.click();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		// 3. Alert
		WebElement alertButton2 = driver.findElement(By.id("confirmButton"));
		alertButton2.click();
		Thread.sleep(2000);
		
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		// 4. Alert
		WebElement alertButton3 = driver.findElement(By.id("promtButton"));
		alertButton3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("enter text here");
		Thread.sleep(2000);
		alert3.accept();
	}
	
}
