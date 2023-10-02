package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

// 8. W.A.J.Script To use Mouse and Keyboard event using Action class 
// 2. Keyboard event

public class Que_08_KE {
           public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new DriverConnection().getConnection("https://www.facebook.com/");
		   WebElement id = driver.findElement(By.id("email"));
		   Actions action1 = new Actions(driver);
		   action1.click(id)
		               .keyDown(Keys.SHIFT)
		               .sendKeys("hello").keyUp(Keys.SHIFT).pause(Duration.ofSeconds(2))
		               .doubleClick(id)
		               .contextClick()
		               .pause(Duration.ofSeconds(2))
		               .keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN)
		               .keyDown(Keys.ENTER)
		               .build().perform();
		   WebElement pwd = driver.findElement(By.id("pass"));
		   Actions action2 = new Actions(driver);
		   action2.click(pwd)
		               .pause(Duration.ofSeconds(2))
		               .contextClick()
		               .sendKeys(id, args)
		               .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		               .sendKeys(Keys.ENTER)
		               .build().perform();
           }		     
}
