package SwitchCase;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int n;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Number");
        n= in.nextInt();
        switch(n) {
        case 1 :
        	int number=0;
            Scanner input= new Scanner(System.in);
            System.out.println("Enter the Number to find Square root");
            number= input.nextInt();
            System.out.println(Math.sqrt(number)); 
            
           break;
        
        case 2 :
        	System.out.println("Current Date " +java.time.LocalDate.now());  
        	
           break;
           
        case 3 :
        	String str= "I am learning Core Java";
        	
        	String[] strArray = str.split(" ");
           
        	System.out.println(Arrays.toString(strArray));
        
        	break;
        default :
           System.out.println("Invalid Number or out of Range");
     }

	}

}
