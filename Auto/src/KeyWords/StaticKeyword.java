package KeyWords;

//Static variable : To allocate same memory for every object
//Static method : Call directly by class name
//Static block : Will execute before main

class Student {
	  int id; String name; long contact;
	  static String cname = "GPG";
	  public void call() {
		     id = 1; 
		     System.out.println("call method in student class");
	  }
	  public static void calling() {
		     cname = "GPG"; //In static function use only static datatype
		     System.out.println("static method in student class");
		     
	  }
	  static {
		     System.out.println("static block in student class");
	  }
}

public class StaticKeyword {
       public static void main(String[] args) {
    	   Student s = new Student();
		   s.call();
		   Student.calling();
	}
}
