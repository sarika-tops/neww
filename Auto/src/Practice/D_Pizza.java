package Practice;

import java.util.Scanner;

class PizzaMenu2 {
String Menu;
	    String pizzaSize;
	    int quantity;
	     PizzaMenu2() {
			        System.out.println("Welcome to D pizza");
			        System.out.println("Small pizza-150, medium pizza-250, large pizza-350, monster pizza-500");
	        		System.out.println("Offers on "+ "Buy 4 small pizza & get 500 ml coke free");
	        		System.out.println("Buy 3 Medium pizza & get garlic bread");
	        		System.out.println("Buy 3 large pizza & get 500 ml coke+ garlic bread free");
	        		System.out.println("Buy 2 monster pizza and get 500ml coke+garlic bread + icecream");
	     }
	     PizzaMenu2(String pizzaSize, int quantity) {
	    	        this.pizzaSize = pizzaSize;
	    	        this.quantity = quantity;
	     }
		
}
public class D_Pizza {
            public static void main(String[] args) {
            	Scanner sc = new Scanner(System.in);
            	PizzaMenu2 p4 = new PizzaMenu2();
            	System.out.print("Enter the pizza size (small/medium/large/monster): ");
            	String pizzaSize = sc.next();
            	System.out.println("Enter the quantity : ");
            	int quantity = sc.nextInt();
            	PizzaMenu2 p5 = new PizzaMenu2(pizzaSize, quantity);
        		double pizzaPrice = 0;
        		if (pizzaSize.equals("small")) {
        	           pizzaPrice = 150;
        	        } else if (pizzaSize.equals("medium")) {
        	             pizzaPrice = 250;
        	        } else if (pizzaSize.equals("large")) {
        	             pizzaPrice = 350;
        	        } else if (pizzaSize.equals("monster")) {
        	            pizzaPrice = 500;
        	        } else {
        	            System.out.println("Invalid pizza size.");
        	        }
        		double totalCost = pizzaPrice * quantity;
        		System.out.println("Total Cost: Rs. " + totalCost);
                System.out.print("Do you want to order another pizza? (yes/no): ");
                String orderChoice = sc.next();
                
                System.out.println("your choice is "+orderChoice);
                if (orderChoice.equals("no") || orderChoice.equals("n")) {
                } else if (orderChoice.equals("yes") || orderChoice.equals("y")) {
                	       PizzaMenu2 p3 = new PizzaMenu2();
                	       System.out.print("Enter the pizza size (small/medium/large/monster): ");
                	       String pizzaSize1 = sc.next();
                	       System.out.println("Enter the quantity : ");
                       	int quantity1 = sc.nextInt();
                	       PizzaMenu2 p6 = new PizzaMenu2(pizzaSize, quantity);
                } else {
                    System.out.println("Invalid choice. Please enter 'yes' or 'no'.");  	
        }
                System.out.println("Thank you for your order!");  
			}
}

//PizzaMenu(String pizzaSize) {
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the pizza size (small/medium/large/monster): " +pizzaSize);
//this.pizzaSize = pizzaSize;
//}
//PizzaMenu(int quantity){
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter the quantity : " +quantity);
//this.quantity = quantity;
//
//}
//System.out.println("Welcome to D pizza");
//System.out.println("Small pizza-150, medium pizza-250, large pizza-350, monster pizza-500");
//System.out.println("Offers on "
//		+ "Buy 4 small pizza & get 500 ml coke free");
//System.out.println("Buy 3 Medium pizza & get garlic bread");
//System.out.println("Buy 3 large pizza & get 500 ml coke+ garlic bread free");
//System.out.println("Buy 2 monster pizza and get 500ml coke+garlic bread + icecream");