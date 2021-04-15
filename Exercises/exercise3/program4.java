package exercise3;

import java.util.StringTokenizer;

public class program4 {
	public static void main(String args[]){  
		   StringTokenizer st = new StringTokenizer("hello today is a good day"," ");  
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		     }  
		   } 
}
