package exercise2;

public class program3 {
	public static void main(String[] args) 
    {
        String[] my_array = {"bcd", "llf", "jj", "bcd", "oiu", "gzw", "oiu"};
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i].equals(my_array[j])) && (i != j) )
                {
                    System.out.println("Duplicate"+my_array[j]);
                }
            }
        }
    }  
}
