package Selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P014_ScrollEvent {
            public static void main(String[] args) {
            String url= "https://demoqa.com/automation-practice-form";
            WebDriver driver = new DriverConnection().getConnection(url);
            
//        1. Scroll By Pixels
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,100)");
            
//        2. Scroll By Element
//           WebElement ele = driver.findElement(By.xpath("//*[@id='stateCity-wrapper']/div[2]/div/div/div[1]"));
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].scrollIntoView();", ele); 
                 
//        3. Scroll at the end of page
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            }
}
