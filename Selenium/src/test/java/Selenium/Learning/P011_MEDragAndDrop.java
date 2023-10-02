package Selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P011_MEDragAndDrop {
           public static void main(String[] args) throws InterruptedException {
		   String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		   WebDriver driver = new DriverConnection().getConnection(url);
		   
		   WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		   driver.switchTo().frame(iframe);
		   
		   WebElement from = driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
		   WebElement to = driver.findElement(By.id("trash"));
		   Thread.sleep(2000);
		   Actions action = new Actions(driver);
		   action.clickAndHold(from).moveToElement(to).release().build().perform();
//		   Action a1 = action.clickAndHold(from).moveToElement(to).release().build();
//		   a1.perform();
		   Thread.sleep(2000);
		   
		   driver.close();
		   
		}
}
