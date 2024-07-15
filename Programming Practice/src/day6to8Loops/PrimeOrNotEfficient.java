package day6to8Loops;

import java.util.Scanner;

public class PrimeOrNotEfficient {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		String res = checkPrime(n);
		System.out.println(res);
	}

	static String checkPrime(int n)
	{
		for (int i = 2; i * i <= n; i++) 
		{
			if (n % i == 0)
			{
				return "not prime";
			}

		}
		return "prime";
	}

}
