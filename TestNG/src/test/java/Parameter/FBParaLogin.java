package Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DriverConnection;

public class FBParaLogin {
           static WebDriver driver;
           
           @BeforeClass
           public static void openBrowser() {
        	           driver = new DriverConnection().getConnection();
        	           driver.get("https://www.facebook.com/");
           }
           @Test(dataProvider = "dp")
           public void test(String email, String pass) {
        	           WebElement emailele = driver.findElement(By.id("email"));
        	           emailele.clear();
        	           emailele.sendKeys(email);
        	           WebElement passele = driver.findElement(By.id("pass"));
	           	       passele.clear();
	           	       passele.sendKeys(pass);
           }
           @DataProvider(name = "dp")
           public static Object[][] dataProviderMethod(){
        	          Object [][] o = new Object[2][2];
        	          
        	          o[0][0] = "correct@gmail.com";
        	          o[0][1] = "correct@123";
        	          
        	          o[1][0] = "incorrect@gmail.com";
        	          o[1][1] = "incorrect@123";
                       
        	          return o;
           }
           @AfterClass
           public static void closeBrowser() {
        	          driver.close();
           }
}
