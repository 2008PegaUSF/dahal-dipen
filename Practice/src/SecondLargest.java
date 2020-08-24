
public class SecondLargest {

	public static void main(String[] args) {
		int[] arry= {10,45,100,30,80,90};
		int secondlg,lrg;
		secondlg=lrg=Integer.MIN_VALUE;
		
		for(int i=0; i<arry.length;i++)
		{
			if(lrg<arry[i])
			{
				secondlg=lrg;
				lrg=arry[i];
			}
			else if (arry[i]>secondlg && lrg>arry[i])
			{
				secondlg=arry[i];
			}
		}

		System.out.println("second Largests is"+ secondlg);
	}

}
