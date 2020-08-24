package AbstractClass18;

public class Main {

	public static void main(String[] args) {
		
		AbstractClass absclass;

		AbstractImpl abs= new AbstractImpl();
		
		absclass = abs;
		
		absclass.setValues("hello");
		
		boolean value = absclass.checkUppercase();
		
		if(value)
		{
			System.out.println(value);
		}
		else
		{
			System.out.println(value);
		}
		
		absclass.checkLowercase();
		
		absclass.setValues("200");
		absclass.addString();

	}

}
