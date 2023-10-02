package OOPS;

class A { //Parent,Base class
			  A() {
				     System.out.println("A class constructor");
			  }
			  public void classA() {
				     System.out.println("class A function");
			  }
}	  
class B extends A { //Child,Derived class
			  public void classB() {
				     System.out.println("class B function");
			  }
}
class C extends B {
			  public void classC() {
				     System.out.println("class C function");
			  }
}
class D extends A {
			  public void classD() {
				     System.out.println("class D function");
			  }
}

public class Inheritance {
           public static void main(String[] args) {
		        	  B b = new B();
		 		      b.classA();
		 		      b.classB();
		 		      C c = new C();
		 		      c.classA();
		 		      c.classB();
		 		      c.classC();
		}
}
