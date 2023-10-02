package Junit.learning;

import org.junit.Ignore;
import org.junit.Test;

public class P001_BasicTest {
	       @Test
           public void test1() {
        	   System.out.println("test1 running");
           }
	       @Test
           public void test2() {
        	   System.out.println("test2 running");
           }
	       @Test
           public void test3() {
        	   System.out.println("test3 running");
           }
	       @Ignore
	       @Test
	       public void test4() {
	    	   System.out.println("test4 running");
	       }
}
