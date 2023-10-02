package OOPS;

abstract class RBI {
		     abstract public void interest();
		     abstract public void HL();
		     public static void reporate() {
		   	     System.out.println("reporate : +-5%");
		     }
}
class SBI extends RBI {
		     public void interest() {
		   	     System.out.println("SBI interest : 7%");
		     }
		     public void HL() {
		   	  System.out.println("SBI HL : 8%");
		     }  
}
class JAVA extends RBI {
		      public void interest() {
		   	      System.out.println("JAVA interest : 8%");
		      }
		      public void HL() {
		   	      System.out.println("JAVA HL : 9%");
		      }
}

public class Abstraction {
            public static void main(String[] args) {
		              SBI s = new SBI();
		  		      s.interest();
		  		      s.HL();
		  		      JAVA j = new JAVA();
		  		      j.interest();
		  		      j.HL();
		  		      SBI.reporate();
		  		      JAVA.reporate();
			}
}
