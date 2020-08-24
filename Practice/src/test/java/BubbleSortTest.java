/**
 * 
 */
package test.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import bubbleSort.BubbleSort;

/**
 * @author Dipen Dahal
 *
 */
class BubbleSortTest {
	
	private BubbleSort sort= new BubbleSort();

	@Test
	void test() {
		
		 int[] values = { 9, -3, 5, 0, 1};
	     int[] expectedOrder = { -3, 0, 1, 5, 9};
	     sort.bubbleSort(values);
	     assertArrayEquals(expectedOrder, values);
	}

}
