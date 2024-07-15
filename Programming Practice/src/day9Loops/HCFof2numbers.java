package day9Loops;

import java.util.Scanner;

//for finding hcf/gcd ie highest common factor, write loop in descending order 
//and print the first value only using break or return
//break exits loop
//return exits the whole method

public class HCFof2numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();

		HcfAB(a,b);
	}

	private static void HcfAB(int a, int b)
	{
		
		int min = a < b ?a : b;
		
		for(int i = min ;i>=1 ; i--)
		{
			if (a % i == 0 &&  b % i == 0)
			{
				System.out.print (i+" ");
				break;
			}
		}
		
	}

}
