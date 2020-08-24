package Interface15;

public class ImpleCalculation implements Calculation {
	
  private	int a,b;
	 

	public ImpleCalculation() {
		
	}
	
	

	public ImpleCalculation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}



	@Override
	public void addition() {

       System.out.println("Sum of 2 number is "+ a+b);
		
	}

	@Override
	public void subtraction() {

      System.out.println("Difference of 2 nubmer is "+ (a-b) );
		
	}

	@Override
	public void multiplication() {
		System.out.println("Multiply of 2 nubmer is " + (a*b));
		
	}

	@Override
	public void division() {
		System.out.println("Division of 2 number is " + (a/b));
		
	}

}
