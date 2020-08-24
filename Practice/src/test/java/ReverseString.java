package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import StringReverse.StringReverse;

class ReverseString {

	@Test
	void test() {
		StringReverse stringreverse=null;
		String expected="nepiD";
		String value= "Dipen";
		 String result= stringreverse.reverseString(value);
		assertEquals(expected,result);
	}

}
