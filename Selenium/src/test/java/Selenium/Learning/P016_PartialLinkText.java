package Selenium.Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P016_PartialLinkText {
            public static void main(String[] args) throws InterruptedException {
			String url = "https://www.facebook.com/";
			WebDriver driver = new DriverConnection().getConnection(url);
			
			List<WebElement> list  = driver.findElements(By.partialLinkText("Create"));
			for (WebElement link : list) {
				System.out.println(link.getText());
			}
			System.out.println(list.size());
			list.get(0).click();
			Thread.sleep(2000);
			driver.navigate().back();
			}
            
}
