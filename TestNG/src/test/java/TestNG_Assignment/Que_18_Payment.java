package TestNG_Assignment;

import org.testng.annotations.Test;

public class Que_18_Payment {
	        @Test(groups = "smoke")
            public void COD() {
            	         System.out.println("cash on delivery");
            }
	        @Test
            public void wallet() {
            	         System.out.println("wallet");
            }
	        @Test
            public void UPI() {
            	         System.out.println("UPI payment");
            }
	        @Test
            public void creditCard() {
            	         System.out.println("credit card");
            }
	        @Test
            public void debitCard() {
            	         System.out.println("debit card");
            }
}
