package Basic;

import org.testng.annotations.Test;

public class P02_Priority {
	       @Test(priority = 3)
           public void logout() {
        	   System.out.println("logout test");
           }
	       @Test(priority = 1)
           public void createAccount() {
        	   System.out.println("create account test");
           }
	       @Test(priority = 2, expectedExceptions = Exception.class)
           public void login() {
        	   System.out.println("login test");
        	   int i = 10;
        	   int j =i/0;
        	   System.out.println(j);
           }
	       @Test(priority = 4)
           public void abc() {
        	   System.out.println("abc test");
           }
}
