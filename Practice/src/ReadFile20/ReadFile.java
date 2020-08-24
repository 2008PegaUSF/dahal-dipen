package ReadFile20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		 
		 // 
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\\\Dipen Dahal\\\\Desktop\\\\test.txt")); 
		  StringBuilder sb = new StringBuilder(); 
		  String line1 = "";
      
		  while( (line1 = br.readLine())!= null ){
			  
			    String [] tokens = line1.split(":");
			    String var_1 = tokens[0];
		        String var_2 = tokens[1];
		        String var_3 = tokens[2];
		        String var_4 = tokens[3];
		  	    System.out.println("Name: " + var_1 + " "+ var_2 );
		  	    System.out.println("Age: " + var_3 + " Years ");
		  	    System.out.println("State: " + var_4);
		  	    System.out.println("");
		  }
		  
		    br.close();
		    
            
		  
		
	  
	  } 

	}


