package GroupMethod;

import org.testng.annotations.Test;

public class Payment {
			@Test(groups = "smoke")
		    public void COD() {
		    	System.out.println("COD test");
		    }
		    @Test
		    public void debitCard() {
		    	System.out.println("debit card");
		    }
		    @Test(groups = "purchase")
		    public void creditCard() {
		    	System.out.println("credit card");
		    }
		    @Test
		    public void UPI() {
		    	System.out.println("UPI");
		    }
}
