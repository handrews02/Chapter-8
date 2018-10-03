package Exercises;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] arrayNums = new double [20];
		Scanner input = new Scanner(System.in);
		int i= 0;
		double total=0;
		double average = 0;
		int quit = 0;
		
		while(quit != 99999) {
			
		System.out.println("Enter a number >> ");
		arrayNums[i] = input.nextDouble();
		total = total + arrayNums[i];
		average = total / arrayNums[i];
		i++;
		
		System.out.println("Do you want to quit press 99999 >> ");
		quit = input.nextInt();
		}
		
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		
		for(int j = 19; j >= 0; j--) {
			System.out.println(arrayNums[j]);
		}
	
	
	
	}

}
