package TestNG_Assignment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// 19. w.a. TestNG program to create dataprovider.

public class Que_19 {
	        @Test(dataProvider = "dp")
	        public void test(String name, String age) {
	        	        System.out.println("Name : "+name);
	        	        System.out.println("Age : "+age);
	        }
	       @DataProvider(name = "dp")
            public Object[][] dp() {
	    	           Object[][] o = new Object[2][2];
	    	           
	    	           o[0][0] = "Sara";
	    	           o[0][1] = "26";
	    	           
	    	           o[1][0] = "Nehal";
	    	           o[1][1] = "29";
					   return o;
            }
}
