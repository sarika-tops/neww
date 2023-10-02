package OOPS;

class AA {
				  public void area(double r) {
					     System.out.println("area of circle : "+(Math.PI*r*r));
				  }
				  public void area(double h,double b) {
					     System.out.println("area of triangle : "+((h*b)/2));
				  }
				  public void area(int l,int w) {
					     System.out.println("area of rectangle : "+(l*w));
				  }
	  
}

public class Overloading {
            public static void main(String[] args) {
		               AA a = new AA();
		  		       a.area(4);
		               a.area(2.1,5.9);	     
		  		       a.area(15,10);
			}
}
