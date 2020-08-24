package TestCalculator;

public class Calculator {
	
	public static void main(String[] args)
	{
		  String a = "20+3";
		   
		  System.out.println(a);
		   
		  calculate(a);
		    
	}

	private static void calculate(String a) {
		
		String operators[]=a.split("[0-9]");
	    String operands[]=a.split("[+-]");
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
	        
	        else if(operators[i].equals("%"))
	        {
	        	System.out.println("Hell");
	        	 agregate%= Integer.parseInt(operands[i]);
	        }
	        
	        else if(operators[i].equals("/"))
	        {
	        	 agregate /= Integer.parseInt(operands[i]);
	        }
	        
	        else 
	        {
	        	agregate *= Integer.parseInt(operands[i]);
	        }
	           
	    }
	    System.out.println(agregate);
		
	}

}
