package exercise3;

import java.io.*;


class Card{
	int num=1;
	public Card(int num) {  
		  this.num = num;  
		 }  
}
public class program6 {
	
	
	public static void main(String[] args) {
		try{  
			  Card s1 =new Card(211);  
			  FileOutputStream fileOut =new FileOutputStream("C:\\Users\\rinit\\eclipse-workspace\\Programs\\files\\f.txt");
			 ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(s1);
		out.close();
		fileOut.close();
		System.out.println("success");
		}
		catch(Exception e) {
			
		}
	}


}

