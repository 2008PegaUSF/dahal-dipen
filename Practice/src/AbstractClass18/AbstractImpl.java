package AbstractClass18;

public class AbstractImpl extends AbstractClass {

	
	@Override
	public Boolean checkUppercase() {
		String str = getStr(); 
		 int upper = 0;
         ;
        
        for(int i = 0; i < str.length()-1; i++) 
        { 
            char ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
               
            	
           return true;
            break;
        }
        return false;
		
	}

	@Override
	public void checkLowercase() {
		String str = getStr(); 
		String upper = str.toUpperCase(); 
		System.out.println("String to Upper Case "+ upper);

		
	}

	@Override
	public void addString() {
		String str = getStr(); 
		int i=Integer.parseInt(str);  
		
		System.out.println("The sum after adding 10 is "+ (i + 10));
	}

}
