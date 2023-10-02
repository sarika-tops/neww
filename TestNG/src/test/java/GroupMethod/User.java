package GroupMethod;

import org.testng.annotations.Test;

public class User {
	        @Test(groups = "smoke")
            public void register() {
            	System.out.println("register user");
            }
	        @Test(groups = "purchase")
            public void login() {
            	System.out.println("login user");
            }
	        @Test
            public void profile() {
            	System.out.println("profile user");
            }
	        @Test
            public void logout() {
            	System.out.println("logout user");
            }
}
