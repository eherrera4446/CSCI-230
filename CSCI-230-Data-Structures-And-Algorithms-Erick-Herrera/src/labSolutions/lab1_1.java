package labSolutions;								//given an integer return difference between product and sum 

import java.util.Random;

public class lab1_1 {
	
	private static int SumIterative(int n) {		//finding the sum of the number through iterative
		
		int total = 0;
		do {total += n % 10;}
		while((n /= 10) != 0);
		return total;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		
		int n = rand.nextInt();
		System.out.println("Number: " + n);
		System.out.println("SumIterative: " + SumIterative(n));
		System.out.println("ProductRecursive: " + ProductRecursive(n));
	}

}
