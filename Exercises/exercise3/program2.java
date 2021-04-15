package exercise3;
import java.io.*;  


public class program2 {
	public static void main(String args[])  
	{  
	try  
	{  
	File file=new File("C:\\Users\\rinit\\eclipse-workspace\\Programs\\files\\demo.txt");    
	FileReader fr=new FileReader(file);    
	BufferedReader br=new BufferedReader(fr);  
	StringBuffer sb=new StringBuffer();     
	String line;  
	while((line=br.readLine())!=null)  
	{  
	sb.append(line);  
	sb.append("\n");     
	}  
	fr.close();    
	System.out.println("Contents of File: ");  
	System.out.println(sb.toString());    
	}  
	catch(IOException e)  
	{  
	e.printStackTrace();  
	}  
	}  
}
