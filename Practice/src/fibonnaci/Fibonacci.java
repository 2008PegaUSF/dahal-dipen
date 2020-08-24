package fibonnaci;

public class Fibonacci {

	public static void main(String[] args) {
		int n= 5;
		
		for(int i=0;i<n;i++)
		{
			System.out.print( fibonaccinumber(i));
		}
	}

	public static int fibonaccinumber(int n) {
		
		if(n==0)
		{
			return 1;
		}else if(n==1)
		{
			return 1;
		}
		else
		{
			return fibonaccinumber(n-1)+fibonaccinumber(n-2);
			
		}
		
			
		 
	}

}
