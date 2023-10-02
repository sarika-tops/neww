package AssignmentProgram;

import java.util.Scanner;

//Q.10. W.A.J.P to calculate the average value of array elements.

public class AverageUsingArray {
       public static void main(String[] args) {
    	      Scanner sc = new Scanner(System.in);
              double arr[] = {15,54,65,85,45};
              double sum=0;
              double length=arr.length;
              for(int index=0;index<length;index++) {
        	  sum=sum+arr[index];
        	  }  	   
              System.out.println("Sum of array elements : ");
        	  System.out.println(sum);
        	  System.out.println("Average of array elements : ");
        	  double average=sum / length;
              System.out.println(average);
	}
}
