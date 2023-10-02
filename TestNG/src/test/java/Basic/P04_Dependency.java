package Basic;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class P04_Dependency {
	        @Test
            public void register() {
            	System.out.println("register user");
            	assertFalse(true);
            }
	        @Test(dependsOnMethods = "register")
            public void login() {
            	System.out.println("login user");
            }
	        @Test(dependsOnMethods = "login")
            public void logout() {
            	System.out.println("logout user");
            }
}
