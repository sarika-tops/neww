package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

// 2. W.A.J.Script for Selecting multiple items in a drop dropdown

public class Que_02 {
            public static void main(String[] args) {
			WebDriver driver = new DriverConnection().getConnection("https://demoqa.com/select-menu");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,100)");
			WebElement md = driver.findElement(By.xpath("//div[@id='selectMenuContainer']/div[7]/div/div/div/div[1]"));
			Actions action = new Actions(driver);
			action.click(md)
			          .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
			          .pause(Duration.ofSeconds(1))
			          .sendKeys(Keys.ENTER).pause(Duration.ofSeconds(1))
			          .sendKeys(Keys.ENTER).pause(Duration.ofSeconds(1))
			          .sendKeys(Keys.ENTER).pause(Duration.ofSeconds(1))
			          .sendKeys(Keys.ENTER).pause(Duration.ofSeconds(1))
			          .build().perform();
			}
}
