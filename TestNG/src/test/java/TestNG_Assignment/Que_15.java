package TestNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import util.DriverConnection;

// 15. W.a. TestNG program to perform test with webdriver to login process of facebook

public class Que_15 {
            @Test
            public void fbLogin() {
            	        WebDriver driver = new DriverConnection().getConnection();
            	        driver.get("https://www.facebook.com/");
            	        WebElement eele = driver.findElement(By.id("email"));
                        eele.sendKeys("Testng@gmail.com");
            	        WebElement pele = driver.findElement(By.id("pass"));
            	        pele.sendKeys("Testng@123");
            	        WebElement button = driver.findElement(By.name("login"));
            	        button.click();
            }
}
