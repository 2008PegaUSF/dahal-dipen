import java.util.HashSet;
import java.util.Set;

public class TestClass {

	public static void main(String[] args) {
		
		/*
		 * String input="Dipen";
		 * 
		 * 
		 * for (int i=input.length()-1;i>=0;i--) System.out.print(input.charAt(i));
		 */
		
		/*
		 * String text = "stress"; for (int i = 0; i <= text.length() - 1; i++) { char
		 * c1 = text.charAt(i); boolean hasReoeated = false; for (int j = 0; j <=
		 * text.length() - 1; j++) { char c2 = text.charAt(j); if (c1 == c2 && i != j) {
		 * hasReoeated = true; break; } }
		 * 
		 * if (!hasReoeated) { System.out.println(text.charAt(i)); break; }
		 * 
		 * 
		 * }
		 */
		
		
		int[] arr1 = {3, 10, 1, 0, 9};
		int[] arr2 = {32, 5, 10, 6, 9, 1};
		findCommonElement(arr1, arr2);
		String text= "madam";
		
		boolean result= isPalindrome(text );
			
		if(result)
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("No Palindrome");
		}
		
		
		

	}
	
	public static boolean isPalindrome(String text) {
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    int length = clean.length();
	    int forward = 0;
	    int backward = length - 1;
	    while (backward > forward) {
	        char forwardChar = clean.charAt(forward++);
	        char backwardChar = clean.charAt(backward--);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    
	    return true;
	}
	
	public static void findCommonElement(int[] arr1, int[] arr2){
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		// adding elements from array1
		for(int i : arr1){
			set1.add(i);
		}
		// adding elements from array2
		for(int i : arr2){
			set2.add(i);
		}
		set1.retainAll(set2);
		System.out.println("Common elements- " + set1);
	}

}
