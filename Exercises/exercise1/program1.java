package exercise1;
import java.util.*;  


public class program1 {
	public static void main(String[] args)   
	{  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a number: ");  
	 
	int age = sc.nextInt();  
	sc.close();  
	if(age<18) {
		System.out.println("Cant vote");
	}
	else {
		System.out.println("Can vote");
	}
	}  
}
