package Selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P010_IconTriggercal {
           public static void main(String[] args) throws InterruptedException {
           String url = "https://www.globalsqa.com/demo-site/datepicker/";
       	   WebDriver driver = new DriverConnection().getConnection(url);
   		   JavascriptExecutor js = (JavascriptExecutor) driver;
   		   js.executeScript("window.scrollBy(0,150)");
   		   
   		  driver.findElement(By.id("Icon Trigger")).click();
		  Thread.sleep(2000);
		  WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[3]/p/iframe"));
		  driver.switchTo().frame(iframe);
	      Thread.sleep(2000);
		  WebElement dateclick = driver.findElement(By.className("ui-datepicker-trigger"));
          dateclick.click();
          
          String myDate = "22";
          String myMonth = "February";
          String myYear = "1996";
          String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
          int y1 = Integer.parseInt(myYear);
          int y2 = Integer.parseInt(currentYear);
          while(!myYear.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText())) {
        	        if(y1>y2) {
        	        	driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
        	        }
        	        else {
        	        	driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
        	        }
          }
          while(!myMonth.equals(driver.findElement(By.xpath ("//span[@class='ui-datepicker-month']")).getText())) {
        	        if(y1>y2) {
        	        	driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
        	        }
        	        else {
        	        	driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
        	        }
          }
          WebElement date = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]"));
          date.click();
          System.out.println(date.getText()+" "+myMonth+" "+myYear);
          
//          WebElement cdate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[1]/a"));
//          System.out.print(cdate.getText() +" ");
//          
//          WebElement cmonth = driver.findElement(By.className("ui-datepicker-month"));
//          System.out.print(cmonth.getText() +" ");
//          
//          WebElement cyear = driver.findElement(By.className("ui-datepicker-year"));
//          System.out.print(cyear.getText() +" ");
          
          
			}
}
