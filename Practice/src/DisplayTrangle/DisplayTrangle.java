package DisplayTrangle;

public class DisplayTrangle {
	
	/*
	0
	1 0
	1 0 1
	0 1 0 1
	 */

	public static void main(String[] args) {
		
		int a=0;
		for (int i=0; i<=4; i++)
		  {
		  for (int j=1; j<=i; j++)
		  {
			
			 
			  if (a == 0)
			  {
				  
				  System.out.print(a);
				  a=1;
			  }
			  else
			  {
				  System.out.print(a);
				  a=0;
			  }
		     
		  }
		  System.out.println("");
		  
		 
		  

	}}

}


