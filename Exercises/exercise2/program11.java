package exercise2;
import java.util.*;  


public class program11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a name: ");  
		String fullName= sc.nextLine(); 
		String[] arrSplit = fullName.split(" ");
		for (int i=0; i < arrSplit.length; i++)
	    {
			if(i!=arrSplit.length-1) {
				System.out.print(arrSplit[i].charAt(0)+".");
				
			}
			else {
				System.out.print(arrSplit[i]);
			}
	      
	    }
	}
}
