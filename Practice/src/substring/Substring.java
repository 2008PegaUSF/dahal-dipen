package substring;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		 String str;
		 int n=0;
         Scanner in= new Scanner(System.in);
         System.out.println("Enter the String");
         str= in.nextLine();
         System.out.println("Enter the Integer Index");
         n= in.nextInt();
         
         String result= substring(str,n);
         
         System.out.println("Substring Value is : "+result);
	}

	public static  String substring(String str, int n) {
		String substringValue="";
		
		for(int i=0; i<=(n-1);i++)
		{
			substringValue= substringValue+ str.charAt(i);
		}
		
		return substringValue;
	}

}
