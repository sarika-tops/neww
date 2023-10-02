package Junit.learning;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class P002_Assert {
	       @Test
           public void test() {
        	           assertEquals(4, 22);
        	         //  assertFalse(false);
        	           assertTrue(true);  
        	           int a[] = {5,4,3,2,1};
        	           int b[] = {5,4,3,2,1,};
        	           assertArrayEquals(a, b);
        	           
           }
}
