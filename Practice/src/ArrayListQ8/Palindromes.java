package ArrayListQ8;

import java.util.ArrayList;

public class Palindromes {

	public static void main(String[] args) {

     ArrayList<String>array= new ArrayList<String>();
     ArrayList<String> arr2= new ArrayList<String>();
     array.add("karan");
     array.add("madam");
     array.add("tom");
     array.add("civic");
     array.add("radar");
     array.add("jimmy");
     array.add("kayak");
     array.add("john");
     array.add("refer");
     array.add("billy");
     array.add("did");

  // for loop to reterive single value
     for (String str : array)
     {
    	 boolean result=isPalindromString(str);
    	 
    	 if(result)
    	 {
    		 //add palindrom string to second array
    		 arr2.add(str);
    	 }
     }
   
    // loop to to print palindrom string from second array 
     for (String str : arr2)
     {
    	 System.out.println(str);
     }
     

	}

	// method to check palindrome
	private static boolean isPalindromString(String  array) {
		String reverse = new StringBuffer(array).reverse().toString();
		
		if(array.equalsIgnoreCase(reverse)){
			
			return true; 
			
		}
		
		return false;

		
	}

}
