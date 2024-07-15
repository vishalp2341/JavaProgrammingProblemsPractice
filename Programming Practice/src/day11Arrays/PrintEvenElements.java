package day11Arrays;

import java.util.Scanner;

public class PrintEvenElements {
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = scan.nextInt();

		int ar[] = new int[n];
		
		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++)
		{
			
			ar[i] = scan.nextInt();
			
		}
		
		EvenElements(ar);
	}

	private static void EvenElements(int[] ar) {
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] % 2 == 0)
			{
				System.out.print(ar[i]+" ");
			}
		}
		
	}
}
