package Exercises;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		
		int[] numArrays = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		double average= 0;
		
		
		for(int i = 0; i < numArrays.length; ++i) {
			System.out.println("Numbers in order " + numArrays[i]);}
		for(int j = 9; j >= 0; --j) {
			System.out.println("Numbers in reverse order " + numArrays[j]);
			total = total + numArrays [j];
			average = total / 10;}
		
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		
		for(int z = 0; z < average; ++z) {
			System.out.println("Numbers less than the average: " + numArrays [z]);}
		
		
	}

}
