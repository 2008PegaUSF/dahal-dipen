package isEven;

import java.util.Scanner;

public class isEven {

	public static void main(String[] args) {
		
		int n=0;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter any Number");
		 n= in.nextInt();
		 int result=checkEven(n);
		 
		 if(result==1)
		 {
			 System.out.println(" The give number " + n + " is Even");
		 }
		 else
		 {
			 System.out.println(" The give number " + n + " is Odd");
		 }
		 	  
		  

	}

	public  static int checkEven(int n) {
		if((n/2) * 2==n)
		{
			return 1;
		}
		return 0;
		
	}

}
