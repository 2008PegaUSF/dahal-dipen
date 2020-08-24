package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrime {

	public static void main(String[] args) {
		
		int value;
		int i;
		ArrayList<Integer>arraylist= new ArrayList<Integer>();
		
		for( i=1;i<=100; i++)
		{
			arraylist.add(i);
		}

		for (i = 0; i < arraylist.size(); i++)  
		{
         
	       value = checkPrime(arraylist.get(i));
	       
	       if(value!=0)
	       {
	    	   System.out.println("Prime Number "+ value);
	       }
		
		
		
		}
    }

	public static int checkPrime(int n) {
		// Corner case 
        if (n <= 1) 
        {
        	return 0 ; 
        }
           
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return 0; 
  
        return n; 
		
	} 
	

}
