package day9Loops;

import java.util.Scanner;

// "n" common Multiples of numbers "a" and "b" 
public class FirstNCommonMultiplesOfAandB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();
		System.out.println("enter n");
		int n = scan.nextInt();
		printNCommonMultiples(a,b,n);
	}

	private static void printNCommonMultiples(int a, int b, int n) {
		int count = 0;
		for(int i = 1 ; count < n; i++)
		{
			if(i % a == 0 && i % b == 0)
			{
				System.out.print (i+" ");
				count++;
			}
		}
		
	}

}
