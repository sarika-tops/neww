package Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class ParametersTest {
	        @Parameters({"email","pass"})
	        @Test
            public void login(String email, String pass) {
            	        WebDriver driver = new DriverConnection().getConnection();
            	        driver.get("https://www.facebook.com/");
            	        WebElement emailele = driver.findElement(By.id("email"));
            	        emailele.clear();
            	        emailele.sendKeys(email);
            	        WebElement passele = driver.findElement(By.id("pass"));
            	        passele.clear();
            	        passele.sendKeys(pass);
            }
}
