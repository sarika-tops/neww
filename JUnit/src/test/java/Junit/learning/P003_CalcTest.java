package Junit.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P003_CalcTest {
	       @Test
           public void calc() {
	    	   Calc c = new Calc();
	    	   int actual = c.addition(5,5);
	    	   int expected = 15;
	    	   assertEquals(expected, actual);
           }
}















