package day12Arrays;

import java.util.Scanner;

public class HighestAndLowestPossibleSumofNMinus1Elements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n");
		int n = scan.nextInt();

		int ar[] = new int[n];

		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {

			ar[i] = scan.nextInt();

		}

		int highest = largest(ar);
		int lowest = smallest(ar);
		int finalsum = Sum(ar);

		System.out.println("Highest sum = " + (finalsum - lowest));
		System.out.println("Lowest sum = " + (finalsum - highest));
	}

	private static int largest(int[] ar) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > largest) {
				largest = ar[i];
			}

		}
		return largest;

	}

	private static int smallest(int[] ar) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < smallest) {
				smallest = ar[i];
			}

		}
		return smallest;

	}

	private static int Sum(int[] ar) {

		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}

}
