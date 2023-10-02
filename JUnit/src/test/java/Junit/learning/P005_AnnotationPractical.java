package Junit.learning;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class P005_AnnotationPractical {
           static WebDriver driver;
           @BeforeClass
           public static void beforeClass() {
        	          driver = new DriverConnection().getConnection();
        	          driver.get("https://www.facebook.com/");
           }
           @AfterClass
           public static void afterClass() {
        	          driver.close();
           }
           @Test
           public void titleTest() {
        	           assertEquals("Facebook - log in or sign up", driver.getTitle());
           }
}
