
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMaxMin {

	public static void main(String[] args) {

		/*
		 * List<Integer> list= Arrays.asList(2,33,454,33,224,789,655);
		 * 
		 * Integer max= Collections.max(list);
		 * 
		 * Integer min = Collections.min(list);
		 * 
		 * System.out.println("Theme MAX value is "+ max);
		 * 
		 * System.out.println("Theme MIN value is "+ min);
		 */
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Ram");
		list.add("Shyam");
		list.add("Shiva");
		list.add("hari");
		
		
		Iterator<String> it= list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		int array[] = new int[] {-14, -46, 47, 86, 92, 52, 48, 36, 66, 85};
		
		int max= getMax(array);
		System.out.println("The max value is " + max);
		
	 // Calling getMin() method for getting min value
	    int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
		
	}
	
	public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    int secMax=inputArray[0];
	   
	    for(int i=0;i < inputArray.length;i++){ 
	     
	    	if(inputArray[i] > maxValue){ 
	    	 secMax= maxValue;
	         maxValue = inputArray[i]; 
	      } 
	      else if(inputArray[i]> secMax)
	      {
	    	  secMax= inputArray[i];
	      }
	    } 
	    
	    return secMax; 
	  }
	
	public static int getMin(int[] inputArray)
	{
		int minValue= inputArray[0];
		
		for(int i=1;i< inputArray.length;i++)
		{
			if( inputArray[i]< minValue )
			{
				minValue= inputArray[i];
			}
		}
		
		return minValue;
	}

}
