package ConstructorDemo;

// Constructor : is a special member function of class which has same name as class name
// Called automatically when object is created
// Have no return type
// Three types : 1. Default, 2.Parameterized, 3.Copy

class Demo {
		  int i;
		  String name;
		  Demo() {
			  System.out.println("Defualt constructor");
		  }
		  Demo(int i) {
			  System.out.println("Parameterized : "+i);
		  }
		  Demo(int i,String name) {
			  this.i=i;
			  this.name=name;
			  System.out.println("Parameterized : i = "+ i +" name = " +name);
		  }
		  public void showData() {
			  System.out.println("i = "+i+" name = "+name);
		  }
}

public class Constructor {
           public static void main(String[] args) {
		        	  Demo d = new Demo();
		 		      Demo d1 = new Demo(1," Sara"); 
		 		      d1.showData();
		}
}
