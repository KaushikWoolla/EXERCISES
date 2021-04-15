package exercise2;

public class program2 {
	public static void main(String args[]) {
		int[] numbers = new int[100];       
	    for(int i = 0; i < numbers.length; i++) {
	      numbers[i] = (int)(Math.random()*1000 + 1);
	    }
	}
}
