package factorial;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		 int n=0;
         Scanner in= new Scanner(System.in);
         System.out.println("Enter the Number");
         n= in.nextInt();
         int result= factorial(n);
         System.out.println("Factorial of " + n + " is " +result);

	}

	public static int factorial(int n) {
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n* factorial(n-1);
		}
	}
	
	

}
