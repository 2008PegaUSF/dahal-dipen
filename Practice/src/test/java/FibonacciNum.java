/**
 * 
 */
package test.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fibonnaci.Fibonacci;

/**
 * @author Dipen Dahal
 *
 */
class FibonacciNum {

	private Fibonacci fib= new Fibonacci();
	
	@Test
	void testFibonaccinumber() {
		int testIndex = 0;
        int expectedResult = 1;
        
        
       int  values= fib.fibonaccinumber(testIndex);
		 
	      assertEquals(expectedResult, values);
	}

}
