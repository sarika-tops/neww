package Practice;

import java.util.Scanner;

class PizzaMenu {
String size;
int q;
String Menu;
                     public PizzaMenu() {
		                    	 System.out.println("Pizza menu : ");
		                    	 System.out.println("Small - 150");
		                    	 System.out.println("Medium - 250");
		                    	 System.out.println("Large - 350");
		                    	 System.out.println("Monster - 500");
		                    	 System.out.println("Offers on pizza : ");
		                    	 System.out.println("Buy 4 small size pizza get 500 ml coke free");
		                    	 System.out.println("Buy 3 medium size pizza get 1 garlic bread free");
		                    	 System.out.println("Buy 3 large pizza get 500ml coke+garlic bread free");
		                    	 System.out.println("Buy 2 monster pizza get 500ml coke+garlic bread+icecream free"); 
					}
                     PizzaMenu(String size,int q){
                    	          this.size = size;
                    	          this.q = q;
                     }
}

public class PizzaPurchase {
           public static void main(String[] args) {
           PizzaMenu p = new PizzaMenu();
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter size of pizza : ");
		   String size = sc.next(); 
		   System.out.println("Enter quantity of pizza : ");
		   int q = sc.nextInt();
		   PizzaMenu p2 = new PizzaMenu(size, q);
		   double price = 0;
		 
		   if (size.equals("small")) {
			        price = 150;
		   }
		   else if (size.equals("medium")) {
			   		price = 250;
		   }
		   else if (size.equals("large")) {
		   			price = 350;
	   }
		   else if (size.equals("monster")) {
		   			price = 500;
	   }
		
		   double Total = price*q;
		   System.out.println("Price is : " +Total);
	   System.out.println("Do you want to order more? : ");
	   String more = sc.next();
	   if(more.equals("yes")) {
		   PizzaMenu p3 = new PizzaMenu();
		   System.out.println("Enter size of pizza : ");
		   String size1 = sc.next(); 
		   System.out.println("Enter quantity of pizza : ");
		   int q1 = sc.nextInt();
		   PizzaMenu p4 = new PizzaMenu(size1, q1);
		   double Total1 = price*q1;
		   System.out.println("Price is : " +Total1);
		   double Bill = Total+Total1; 
		   System.out.println("Your total bill amount is : " +Bill);
		   System.out.println("Thank you for the order  <_>");
	   }
	   else if(more.equals("no")) {
		   System.out.println("Your total bill amount is : " +Total);
		   System.out.println("Thank you for the order  <_>");
	   }
}
}