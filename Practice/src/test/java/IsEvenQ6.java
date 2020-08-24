package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import isEven.isEven;

class IsEvenQ6 {

	@Test
	void test() {
		isEven even=null;
		int expected=0;
		int value= even.checkEven(5);
		assertEquals(expected,value);
	}

}
