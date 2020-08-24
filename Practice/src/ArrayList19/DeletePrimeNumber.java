package ArrayList19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeletePrimeNumber {

	public static void main(String[] args) {

		ArrayList<Integer> numbers= new ArrayList<>();
       int evenSum=0;
       int oddSum=0;
       
       for(int i=1; i<=10; i++)
       {
    	   numbers.add(i);
       }

       Iterator<Integer> iterator = numbers.iterator();
       
       while (iterator.hasNext()) {
           Integer value = iterator.next();
       
           if (value%2==0) {
               evenSum= evenSum+value;
           }
           else
           {
        	   oddSum= oddSum+ value;
           }
           
           //check prime number
           boolean result=isPrime(value);
           
           if(result)
           {
        	   //remove prime number
        	   iterator.remove();
           }
         
          
       }
       
       System.out.println("Then Even Sum is "+ evenSum);
       System.out.println("Then Odd Sum is "+ oddSum);
       System.out.println("Modified ArrayList : " + numbers);
       
	}

	//prime check method
	private static boolean isPrime(Integer n) {
		  
		if (n%2==0) return false; 
	    //if not, then just check the odds 
	    for(int i=3;i<=Math.sqrt(n);i+=2) { 
	        if(n%i==0) 
	            return false; 
	    } 
	    return true; 
	}

}
