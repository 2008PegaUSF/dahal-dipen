package Thread;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		     
		   // ThreadChallenge sum2 = new ThreadChallenge();
		  //  Thread t1 = new Thread(sum2);
		  //  t1.start();
		   // Thread t2 = new Thread(sum2);
		 
		   // t2.start();
		    
		    String a = "5+20-20";
		    System.out.println(a);
		    
		    String operators[]=a.split("[0-9]");
		    
		    
		    
		    String operands[]=a.split("[+-/*]");
		   
		   
		    
		    int agregate = Integer.parseInt(operands[0]);
		    
		    for(int i=1;i<operands.length;i++){
		    	
		        if(operators[i].equals("+"))
		        {
		        	agregate += Integer.parseInt(operands[i]);
		        	
		        }
		          
		        else if(operators[i].equals("-"))
		        {
		        	 agregate -= Integer.parseInt(operands[i]);
		        }
		        
		        else if(operators[i].equals("*"))
		        {
		        	 agregate *= Integer.parseInt(operands[i]);
		        }
		        
		        else if(operators[i].equals("/"))
		        {
		        	 agregate /= Integer.parseInt(operands[i]);
		        }
		        
		        else 
		        {
		        	agregate %= Integer.parseInt(operands[i]);
		        }
		           
		    }
		    System.out.println(agregate);
		    
	}

	}


