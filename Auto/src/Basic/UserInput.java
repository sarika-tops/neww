package Basic;

import java.util.Scanner;

class a{
	public void call() {
		System.out.println("Hello call function");
	}
}


public class UserInput {
       public static void main(String[] args) {
    	a obj = new a();
   		obj.call();
   		System.out.println("Hello");
   		Scanner sc = new Scanner(System.in);
   		System.out.println("enter a = ");
   		int a = sc.nextInt();
   		System.out.println("enter b = ");
   		int b = sc.nextInt();
   		int c = a*b;
   		System.out.println("c = "+c);
   		System.out.println("enter double value = ");
   		double d = sc.nextDouble();
   		System.out.println("d = "+d);
	}
}
