package Basic;

import java.util.Scanner;

//1. simple if
//2. if else
//3. nested if
//4. else if ladder
//5. switch case

public class ConditionalStatements {
       public static void main(String[] args) {
    	      Scanner sc = new Scanner(System.in);
	          System.out.println("enter a = ");
	          int a = sc.nextInt();
	          if (a !=0) {
	        	  System.out.println("a = "+a);
	          }
	          System.out.println("enter b = ");
	          int b = sc.nextInt();
	          // 1. simple if
	          if (a < b) {
	        	  System.out.println("b is greater than a");
	          }
	          
	          // 2. else if
	          if (a < b) {
	        	  System.out.println("b is greater than a");
	          } else {
	        	  System.out.println("a is greater than b");
	        	     }
	          
	          // 3. nested if
	          System.out.println("enter age : ");
	          int age = sc.nextInt();
	          if (age > 18) {
	        	  if (age < 60) {
	        		 System.out.println("you are eligible");
	             } else {
	            	 System.out.println("age is greater than 18 but less than 60");
	             }
	           } else {
	        	     System.out.println("age is less than 18");
	        	     
	          }
	          
	          // 4. else if ladder
	          System.out.println("enter marks : ");
	          int marks = sc.nextInt();
	          if (marks < 35) {
	        	  System.out.println("fail");
	         } else if (marks >= 35 && marks <= 50) {
	        	 System.out.println("pass class");
	         } else if (marks >= 51 && marks <= 70) {
	        	 System.out.println("C grade");
	         } else if (marks >= 71 && marks <= 80) {
	        	 System.out.println("B grade");
	         } else if (marks >= 81 && marks <= 90) {
	        	 System.out.println("A grade");
	         } else if (marks >=91 && marks <=100) {
	        	 System.out.println("A+ grade");
	         } else {
	        	 System.out.println("invalid input");
	         }
	          
	          // 5. switch case
	          System.out.println("1. For English 2. For Hindi 3. For Gujarati");
	          int lang = sc.nextInt();
	          switch (lang) {
	          
	          case 1 : 
	        	  System.out.println("You Selected English");
	        	  break;
	          case 2 : 
	        	  System.out.println("You Selected Hindi");
	        	  break;
	          case 3 : 
	        	  System.out.println("You Selected Gujarati");
	        	  break;
	          default : 
	        	  System.out.println("invalid input");
	        	  
	          }
    }
}
	

