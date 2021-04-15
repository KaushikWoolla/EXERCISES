package exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class program3 {

	public static void main(String[] args)throws IOException {
		
		
		try{  
			File file = new File("C:\\Users\\rinit\\eclipse-workspace\\Programs\\files\\append.txt");

			Writer output = new BufferedWriter(new FileWriter(file, true));
			output.append("New Line!");
			output.close();
  
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }   
	
	
	}

