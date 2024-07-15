package day10loops;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		sumofdigits(n);

	}

	private static void sumofdigits(int n) 
	{
		int sum = 0;
		int rem = 0;

		while (n > 0) 
		{

			rem = n % 10;
			sum = sum + rem;
			n = n/10;

		}
		System.out.println(sum);

	}

}
