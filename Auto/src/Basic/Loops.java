package Basic;

import java.util.Scanner;

//1. for(initialization;condition;incre/decre){body}
//2. while(condition){body}
//3. do{body} while(condition);
//4. for each -> for(Type object: list){body}

public class Loops {
	   public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("for loop");
			System.out.println("enter num to print table : ");
			int num = sc.nextInt();
			for (int a=1;a<=10;a++) {
				System.out.println(num+" x "+a+" = "+(num*a));
			
			}
			
			System.out.println(" ");
			System.out.println("while loop");
			System.out.println("enter num to print table : ");
			  int Num = sc.nextInt();
			  int b = 1;
			  while(b<=10) {
				  System.out.println(Num+" x "+b+" = "+(Num*b));
				  b++;
			  }
			  
			System.out.println(" ");  
		    System.out.println("do while loop");
			System.out.println("enter num to print table : ");
		    int number = sc.nextInt();
		    int c = 1;
		    do {
		    	  System.out.println(number+" x "+c+" = "+(number*c));
		    	  c++;
		    	
		      }
		      while(c<=10);
		    
		    System.out.println(" ");
		    System.out.println("for loop");
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
			
			System.out.println(" ");
			System.out.println("while loop");
			int j = 10;
			while(j>=1) {
				System.out.println(j);
				j--;
			}
			
			System.out.println(" ");
			System.out.println("do while loop");
			int k = -1;
			do {
				System.out.println(k);
				k--;
		       }
			while(k>=-10);
			
			
		}

	}


