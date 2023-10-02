package ArrayPractice;

import java.util.Scanner;

public class MultiDimensional {
       public static void main(String[] args) {
    	      Scanner sc = new Scanner(System.in);
		      System.out.println("enter number of row : ");
		      int row = sc.nextInt();
		      System.out.println("enter number of column : ");
		      int col = sc.nextInt();
		      int arr[][] = new int[row][col];
		      for(int i=0;i<row;i++) {
		    	  for(int j=0;j<col;j++) {
		    		  System.out.print("enter element at arr["+i+"]["+j+"] : ");
		    		  arr[i][j] =sc.nextInt();
		    	  }
		    	  System.out.println();
		      }
		      System.out.println("final output array 1");
		      for(int i=0;i<row;i++) {
		    	  for(int j=0;j<col;j++) {
		    		  System.out.print(arr[i][j]+" ");
		    	  }
		    	  System.out.println();
		      }
		      System.out.println();
		      int arr2[][] = new int[row][col];
		      for(int i=0;i<row;i++) {
		    	  for(int j=0;j<col;j++) {
		    		  System.out.print("enter element at arr["+i+"]["+j+"] : ");
		    		  arr2[i][j] =sc.nextInt();
		    	  }
		    	  System.out.println();
		      }
		      System.out.println("final output array 2");
		      for(int i=0;i<row;i++) {
		    	  for(int j=0;j<col;j++) {
		    		  System.out.print(arr[i][j]+" ");
		    	  }
		    	  System.out.println();
		      }
		      System.out.println("sum of array1 and array2");
	          int sum[][]=new int[3][3];
	          for(int i=0;i<3;i++) {
	        	  for(int j=0;j<3;j++) {
	        		  sum[i][j] = arr[i][j] + arr[i][j];
	        		  System.out.print(sum[i][j] +" ");
	        	  }
	        	  System.out.println();
	          }
	          
		      
//		      System.out.println();
//		      int arr3[][] = new int[row][col];
//		      for(int i=0;i<row;i++) {
//		    	  for(int j=0;j<col;j++) {
//		    		  System.out.print("enter element at arr["+i+"]["+j+"] : ");
//		    		  arr3[i][j] =sc.nextInt();
//		    	  }
//		    	  System.out.println();
//		      }
	}
}
