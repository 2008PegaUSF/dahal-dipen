package bubbleSort;

public class BubbleSort {
	
	public static void main(String[] args)
	{
		int value[]= {2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		
		bubbleSort(value);
		
		for(int i = 0; i < value.length; i++) {
	         System.out.print(value[i] + " ");
	      }
		
		
	}
	
	public static void bubbleSort(int[] arrayValue)
	{
		int len= arrayValue.length;
		int temp=0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<(len-i);j++)
			{
				if(arrayValue[j-1]> arrayValue[j])
				{
					temp=arrayValue[j-1];
					arrayValue[j-1]= arrayValue[j];
					arrayValue[j]=temp;
				}
			}
		}
	}

}
