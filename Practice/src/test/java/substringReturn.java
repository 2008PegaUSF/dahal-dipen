package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import substring.Substring;

class substringReturn {

	@Test
	void test() {
		Substring substring = null;
		String expected="Appl";
		String value= substring.substring("Apple", 4);
		assertEquals(expected,value);
	}

}
