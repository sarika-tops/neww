package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// 10. W.A.J. Script To find the total hyperlink from this web page http://demo.guru99.com/test/web-table-element.php

public class Que_10 {
           public static void main(String[] args) {
		   WebDriver driver = new DriverConnection().getConnection("http://demo.guru99.com/test/web-table-element.php");
		   List<WebElement> link = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		   System.out.println(link.size());
		   for(WebElement tl : link) {
			    System.out.println(tl.getText());
		   }
		   
           }
}
