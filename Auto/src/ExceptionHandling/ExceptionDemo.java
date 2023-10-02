package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class Division {
	  public void divide() throws ArithmeticException,InputMismatchException {
			     Scanner sc = new Scanner(System.in);
			     System.out.println("Enter a = ");
			     int a = sc.nextInt();
			     System.out.println("Enter b = ");
			     int b = sc.nextInt();
			     if(b<0) {
			           throw new ArithmeticException("Denominator cannot be zero");
			     }
			     int c = a/b;
			     System.out.println(c);
	  }
}

public class ExceptionDemo {
           public static void main(String[] args) {
		        	   try {
		 				  Division d = new Division();
		 				  d.divide();
		 			} catch (ArithmeticException e) {
		 				  System.out.println("Denominator cannot be zero");
		 			}
		 		      catch (InputMismatchException e) {
		 				  System.out.println("Denominator should be numeric value");
		 			}
		 		      
		 				try {
		 				Scanner sc = new Scanner(System.in);
		 				System.out.println("enter a = ");
		 				int a = sc.nextInt();
		 				System.out.println("enter b = ");
		 				int b = sc.nextInt();
		 				int c = a/b;
		 				System.out.println(c);
		 				
		 			}  catch (ArithmeticException e) {
		 				System.out.println("denominator cannot be zero");
		 			}
		 			   catch (InputMismatchException e) {
		 			   System.out.println("denominator should be numeric value");
		 			}
		 			   catch (Exception e) {
		 			   System.out.println("error");
		 			}
		 			   finally {
		 			   System.out.println("this will exceute everytime");			
		 			}		      
 	}
}

