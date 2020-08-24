package SimpleInterest;

import java.util.Scanner;

public class SimpleInterest {

	private static Scanner input;

	public static void main(String[] args) {
		
		float principal;
		float rate;
		int time=0;
        input = new Scanner(System.in);
        System.out.println("Enter Principal,");
        principal= input.nextInt();
        
         System.out.println("Enter Rate,");
         rate= input.nextInt();
         
         System.out.println("Enter Time,");
         time= input.nextInt();
         
         float interest= simpleInterest(principal,rate,time);
         
         System.out.println("The Simple Interest is " + interest);

	}

	private static float simpleInterest(float principal, float rate, int time) {
		  
				  
		return (principal*rate*time)/100 ;
	}

}
