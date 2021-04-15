package exercise2;
import java.util.Arrays;


public class program13 {
	public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
	
	public static void main(String[] args)
    {
        String string1 = "parliament";
        String string2 = "partial men";

         string1 = sortString(string1).replaceAll("\\s+","");
         string2 = sortString(string2).replaceAll("\\s+","");
         if(string1.equalsIgnoreCase(string2)) {
        	 System.out.println("anagram");
         }
         else {
        	 System.out.println("not anagram");
         }
       
    }
}
