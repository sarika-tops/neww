package Basic;

/* *****
   ****
   ***
   **
   * */

public class Patterns {
       public static void main(String[] args) {
    	   for(int r=1;r<=5;r++) {
	        	  for(int c=5;c>=r;c--) {
	        		  System.out.print("*");
	        	  }
	        	      System.out.println();
	          }        
/* *
   **
   ***
   ****	         
   ***** */   
    	      System.out.println(" ");
	          for(int r=1;r<=5;r++) {
	        	  for(int c=1;c<=r;c++) {
	        		  System.out.print("*");
	        	  }
	        	      System.out.println();
	          }
/* 1	      
   12       
   123       
   1234       
   12345 */   
	          
	      System.out.println(" ");    
          for(int r=1;r<=5;r++) {
        	     for(int c=1;c<=r;c++) {
        		     System.out.print(c);
	        	  }
                  System.out.println();	        	  
	          }
/* 1
   2 2
   3 3 3            
   4 4 4 4            
   5 5 5 5 5 */
          
          System.out.println(" ");
          for(int r=1;r<=5;r++) {
        	     for(int c=1;c<=r;c++) {
        	    	 System.out.print(" ");
        		     System.out.print(r);
	        	  }
        	         
                  System.out.println();	        	  
           }
/*
 * 
 *              
 *              
 */
          System.out.println(" ");
          for(int r=1;r<=5;r++) {
	        	  for(int c=5;c<=5;c++) {
	        		  System.out.print("*");
	        	  }
	        	      System.out.println();
	          }     
/* 1
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1 */  
          
          System.out.println(" ");
          for(int r=1;r<=6;r++) {
         	 for(int c=1;c<=r;c++) {
         		 if((r+c)%2 == 0) {
         		   System.out.print("1");
         		 }
         		 else {
         		   System.out.print("0");
         		 } 
         	 }
         	       System.out.println();
          }
          
	}
}
