package day6to8Loops;

import java.util.Scanner;

public class PrintPrimeNumbersBetween2numbers {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n1 and n2");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		printPrime(n1, n2);

	}

	static void printPrime(int n1, int n2) 
	{
		for (int i = n1; i <= n2; i++)
		{
			if (checkPrime(i)) 
			{
				System.out.println(i);
			}
		}

	}

	static boolean checkPrime(int n) 
	{
		for (int i = 2; i * i <= n; i++) 
		{
			if (n % i == 0) 
			{
				return false;
			}

		}
		return true;
	}

}
