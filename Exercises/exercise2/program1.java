package exercise2;

public class program1 {
	public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] my_array1 = {
	            1789, 2000, 1899, 1456};
	      System.out.println(contains(my_array1, 2000));
	      System.out.println(contains(my_array1, 1));
	   }
	  
}
