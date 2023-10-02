package AssignmentProgram;

import java.util.Scanner;

//Q.5. W.A.J.P to check given number is Armstrong or not?

public class ArmstrongNumber {
       public static void main(String[] args) {
    	   int i, arms=0, remin, j;
       	   System.out.println("use only 3 digits");
       	   Scanner sc = new Scanner(System.in);
       	   i = sc.nextInt();
       	   j = i;
       	   while (i>0) {
       	    	remin = i%10;
       	    	arms = (remin*remin*remin)+arms;
       	    	i = i/10;
       	    }
       	   if (j==arms) { 
       	        System.out.println("Number is armstrong"); 
       	    	}
       	   else {
       	    	System.out.println("Number is not armstrong");
       	    }
       	   while (arms<=99) {   
       	    	System.out.println("");
       	    }
	}
}
