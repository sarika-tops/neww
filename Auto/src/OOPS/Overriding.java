package OOPS;

class parent {
				  public void call() {
					     System.out.println("parent calling");
				  }
}
class child extends parent {
				  public void call() {
					     System.out.println("child calling");
					     super.call();
				  }
}

public class Overriding {
            public static void main(String[] args) {
            	      child c = new child();
  		              c.call();
			}
}
