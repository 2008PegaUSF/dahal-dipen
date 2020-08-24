package FindEvenInArray;

public class FindEven {

	public static void main(String[] args) {
		int array[] = new int[100];
		int count=0;
		for(int i=1;i<=100;i++)
		{
			array[count]=i;
			count++;
		}
		
		for(int n:array)
		{
			if(n%2==0)
			{
				System.out.println("The Even numbers are: " +n);
			}
			
		}
		
	}

}
