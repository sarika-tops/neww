package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// 4. W.A.J.script to register your self in Gmail.

public class Que_04 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new DriverConnection().getConnection("https://accounts.google.com/signup");

		driver.findElement(By.id("firstName")).sendKeys("Sara");
		driver.findElement(By.id("lastName")).sendKeys("Namsha");
		WebElement next = driver.findElement(By.xpath("//div[@id=\"collectNameNext\"]/div/button/span"));
		next.click();
		Thread.sleep(1000);

		driver.findElement(By.id("day")).sendKeys("4");
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByVisibleText("May");
		driver.findElement(By.id("year")).sendKeys("1997");

		WebElement g = driver.findElement(By.id("gender"));
		Select gender = new Select(g);
		gender.selectByVisibleText("Female");
		Thread.sleep(1000);

		WebElement next1 = driver.findElement(By.xpath("//div[@id='birthdaygenderNext']/div/button/span"));
		next1.click();
		List<WebElement> emails = driver.findElements(By.xpath("//div[@class='enBDyd ']"));
		System.out.println(emails.size());
		for (WebElement id : emails) {
			emails.get(1).click();
			Thread.sleep(1000);

		}
	}
}
//span[@class='oJeWuf']/div[2]/div