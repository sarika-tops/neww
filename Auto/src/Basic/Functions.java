package Basic;

import java.util.Scanner;

class call {
	public int RunFunction (int i, double d, String name) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("enter number=");
		   int num = sc.nextInt();
		   System.out.println("Hello RunFunction");
		   return num;
		   
	}
}

public class Functions {
       public static void main(String[] args) {
    	   call c = new call();
   		   int i = c.RunFunction(5,4.22,"Sara");
   		   System.out.println("i = "+i);
   		   double d1 = c.RunFunction(5,4.22,"Sara");
   		   System.out.println("d1 = "+d1);
   		
    	   System.out.println("Hello main");

	}
}
