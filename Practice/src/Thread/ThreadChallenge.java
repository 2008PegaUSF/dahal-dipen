package Thread;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class ThreadChallenge implements Runnable {
	
	
	Deque<Integer> deque = new LinkedList<Integer>();
	
    public ThreadChallenge() {
		
	}

    public void run() {
        addRondom();
        checkprime();
    }

    

	public synchronized  void  addRondom() {
      
    	
        Random rand = new Random();
        for(int i=0; i<5;i++)
        {
        	int rand_int1 = rand.nextInt(9999); 
        	 deque.add(rand_int1);
        }
        System.out.println("number generated: "+deque + "\n"); 
        
    }
    
	public void checkprime() {
		for (Integer number : deque) {
	         System.out.println("Number = " + number);
	         
	         if (isPrime(number)) 
	             System.out.println("The " + number+ " Prime"); 
	         else
	        	 System.out.println("The " + number+ " NotPrime"); 
	         
	      }
		
	}

	public Boolean isPrime(Integer n) {
		 
        if (n <= 1) 
            return false; 
  
        
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true;
		
	}
    

}
