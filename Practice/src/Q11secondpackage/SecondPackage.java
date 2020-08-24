package Q11secondpackage;

import Q11FirstPackage.FirstPackage;

public class SecondPackage {

	public static void main(String[] args) {
		
		FirstPackage value= new FirstPackage();
		
		float sum= value.num1+ value.num2;
		
		System.out.println("Sum of two number is " + sum);

	}

}
