package AssignmentProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Q.19. W.A.J.P to iterate through all elements in an array list.

public class ArrayAssignment {
       public static void main(String[] args) {
    	   System.out.println("Q : 19 iterate through : ");
    	   List<Integer> name = Arrays.asList(4,5,7,8,3,2);
    	   for(int i=0;i<name.size();i++) {
    		   System.out.println(name.get(i) + "  ");
    	   } 
    	   System.out.println(" ");
           
// Q.20. W.A.J.P to update specific array element by given element.

    	   System.out.println("Q : 20 Update specific array : ");
           ArrayList<String> names = new ArrayList<String>();
           names.add("Apple");
    	   names.add("Banana");
    	   names.add("Cherry");
    	   System.out.println("Main array");
    	   for(String namee : names)
    	   System.out.println(namee);
    	   names.set(1, "Berry");
    	   System.out.println(" ");
    	   System.out.println("Updated array");
    	   for(String namee : names) {
    			System.out.println(namee);
    		}
    	   System.out.println(" ");
           
// Q.21. W.A.J.P to remove the third element from a array list.
    	   
            System.out.println("Q : 21 Remove the third element : ");
    		ArrayList<String> namess = new ArrayList<String>();
    		namess.add("Sara");
    		namess.add("Sarika");
    		namess.add("Shakira");
    		namess.add("Saru");
    		System.out.println("Main array");
    		System.out.println(namess);
    		System.out.println(" ");
    		namess.remove("Shakira");
    		System.out.println("After remove 3rd element");
    		System.out.println(namess);
    		System.out.println(" ");
    		
    		
// Q.22.  W.A.J.P to Copy one array into another

    		System.out.println("Q : 22 Copy one array into another : ");
    		int[] a = {4,5,97,22,2,96};
    		int[] b = new int[a.length];
    		b=a;
    		b[0]++;
            System.out.println("Array of a[] ");
    		for(int i=0;i<a.length;i++) 
    			System.out.println(a[i] + " ");
    	    System.out.println("Array of b[] ");
    	    for(int i1=0;i1<b.length;i1++) 
    	    	System.out.println(b[i1] + " ");
    	    System.out.println(" ");
    		
// Q.23. W.A.J.P to reverse an array of integer values
    	    
    	    System.out.println("Q : 23 Reverse an array of integer values : ");
    		int [] arr =new int[] {22,2,96};
    		System.out.println("Main array");
    		int i;
    		for (i=0;i<arr.length;i++){
    		System.out.print(arr[i]+ " ");
    		}
    		System.out.println();
    		System.out.println("reverse array");
    		for (i=arr.length-1;i>=0;i--) {
    			System.out.print(arr[i]+ " ");
    		} System.out.println(" ");

// Q.24. W.A.J.P to find the second largest element in an array.
    		
    		System.out.println(" ");
    		System.out.println("Q : 24 \nSecond largest element : ");
    		int [] array= {5,10,15,20,25,30};
    		int size = array.length;
    		Arrays.sort(array);
    		System.out.println("sort Array:" +Arrays.toString(array));
    		int i1 = array[size-2];
    		System.out.println("2nd largest element : "+i1);
	}
}
