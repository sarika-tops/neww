package Selenium.Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P013_AJAX_KeyBoard {
            public static void main(String[] args) {
			String url = "https://www.google.com/";
			WebDriver driver = new DriverConnection().getConnection(url);
			
			WebElement search = driver.findElement(By.id("APjFqb"));
			
			Actions action = new Actions(driver);
			action.click(search)
			          .keyDown(Keys.SHIFT)
			          .sendKeys("selenium")
			          .keyUp(Keys.SHIFT)
			          .pause(Duration.ofSeconds(5))
			          .sendKeys(Keys.ARROW_DOWN)
			          .sendKeys(Keys.ENTER)
			          .build().perform();
			}
}
