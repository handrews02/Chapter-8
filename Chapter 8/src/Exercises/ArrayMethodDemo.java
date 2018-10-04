package Exercises;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		
		int[] numArrays = {1,2,3,4,5,6,7,8,9,10};
		int total=0;
		int average = 0;
		
		for(int i = 0; i < numArrays.length; ++i) {
			System.out.println("Numbers in order " + numArrays[i]);
			total = total + numArrays[i];
			display1(numArrays [i]);
			}
		
			average = total / 10;
			
			display2(total, average);
			display3(numArrays, average); 
			
		
	}
	public static void display1( int numArrays){
		for(int j = 9; j >= 0; --j) {
			System.out.println("Numbers in reverse order " + numArrays);
			}
		
	}
	public static void display2( int total, int average) {
		
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
	}
	public static void display3(int [] numArrays, int average) {
		
		for(int z = 0; z < average; ++z) {
			System.out.println("Numbers less than the average: " + numArrays [z]);}
		
		
	}

}
