package KeyWords;

class A1{
	 int i=1;
	 public void change() {
		System.out.println(i);
	}
}
class B1 extends A1{
	public void change() {
		super.change();
	}
}

public class FinalKeyword {
       public static void main(String[] args) {
    	      B1 b = new B1();
 	          b.change();
	}
}
