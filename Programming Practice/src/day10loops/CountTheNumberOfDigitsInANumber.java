package day10loops;

import java.util.Scanner;

//Count The Number Of Digits In A Number

public class CountTheNumberOfDigitsInANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		countDigits(n);
		
	}

	private static void countDigits(int n) {
		int count = 0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		
	}

}
