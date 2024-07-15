package day9Loops;

import java.util.Scanner;

// Print the Common Factors of A and B
public class PrintCommonFactorsofAandB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();
		
		
		commonmultiplesAB(a,b);
	}

	private static void commonmultiplesAB(int a, int b) {
		
		int min = a < b ?a : b;
		for(int i = 1 ;i<=min ; i++)
		{
			if (a % i == 0 &&  b % i == 0)
			{
				System.out.print (i+" ");

			}
		}
		
	}

}
