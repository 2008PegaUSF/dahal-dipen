package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factorial.factorialNumber;

class Nfactorial {

	factorialNumber facnum;
	@Test
	void test() {

		int expected=1;
		
	 int value= facnum.factorial(0);
		
	 assertEquals(expected,value);
		

	}

}
