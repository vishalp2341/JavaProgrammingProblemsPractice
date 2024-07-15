package day11Arrays;

import java.util.Scanner;

public class sumOfAllElements 
{

//	for sum data type, use long as the test case might exceed the range of int (if the program requires it)

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n");
		int n = scan.nextInt();

		int ar[] = new int[n];

		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {

			ar[i] = scan.nextInt();

		}

		Sum(ar);
	}

	private static void Sum(int[] ar) {

		long sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}

		System.out.println("The sum is " + sum);

	}

}
