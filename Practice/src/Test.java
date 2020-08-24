
public class Test {

	public static void main(String[] args) {

		  String s="fluffy";
		  
		  String  val= addKbeforeFs(s);
		  
		  System.out.println("New Added value "+ val);

	}
	
	static String addKbeforeFs(String text)
	{
		String result="";
        for(int i=0;i<text.length();i++){
            if(Character.toString(text.charAt(i)).equalsIgnoreCase("f")){
                result=result
                        .concat("K")
                        .concat(Character.toString(text.charAt(i)));
            }
            else{
                result=result
                        .concat(Character.toString(text.charAt(i)));
            }
        }
        return result;


	}

}
