package ArrayPractice;

import java.util.Scanner;

public class SingleDimensional {
       public static void main(String[] args) {
    	      Scanner sc = new Scanner(System.in);
	          System.out.println("enter size of array : ");
	          //take input for size of array
	          int size = sc.nextInt();
	          //to assign size to array
	          int arr[] = new int[size];
	          //take user input in array
	          for(int index=0;index<arr.length;index++) {
	        	  System.out.print("enter element at arr["+index+"] : ");
	        	  arr[index] = sc.nextInt();
	          }
	          
	          //addition of elements
	          int sum=0;
	          for(int index=0;index<arr.length;index++) {
	        	  sum = sum+arr[index];
	          }
	          System.out.println("sum ="+sum);
	          
	          //binary search operation
	          System.out.println("enter number to search in array : ");
	          int num = sc.nextInt();
	          int counter = 0;
	          for(int index=0;index<arr.length;index++) {
	        	  if(num == arr[index]) {
	        		  counter++;
	        	  }
	          }
	          if(counter>0) {
	        	  System.out.println("yes "+num+" is exist "+counter+" times ");
	          }
	          else {
	        	  System.out.println("no");
	          }
	          
	          System.out.println(" ");
	          System.out.println("print index number of array");
		      int i[] = {1,2,3,4,5,6,7,8,9,10};
		      for(int index=0;index<=9;index++) {
		    	  System.out.println(i[index]);
		      }
	}
}
