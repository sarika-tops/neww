package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P03_Annotations {
	        @BeforeClass
            public static void beforeclass() {
            	        System.out.println("before class");
            }
	        @AfterClass
	        public static void afterclass() {
	        	        System.out.println("after class");
	        }
	        @BeforeTest
	        public void before() {
    	        System.out.println("before test");
            }
	        @AfterTest
	        public void after() {
    	        System.out.println("after test");
        	}
	        @Test
	        public void test() {
	        	System.out.println("test");
	        }
}
