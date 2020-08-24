package StringReverse;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

           String beforereverce;
           Scanner in= new Scanner(System.in);
           System.out.println("Enter the String to reverse");
           beforereverce= in.nextLine();
           
           String result= reverseString(beforereverce);
           
           System.out.println("Reversed string: "+result);
           
          

	}

	public static String reverseString(String beforereverce) {
		 String reverse="";
		int len= beforereverce.length();
         for(int i =len-1; i>=0;i--)
         {
      	   reverse= reverse + beforereverce.charAt(i);
      	  
      	   
         }
         
         return reverse;
	}

}
