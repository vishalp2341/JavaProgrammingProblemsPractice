package day11Arrays;

import java.util.Scanner;

public class ElementsAtOddIndex {
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
		
		OddIndexElements(ar);
	}

	private static void OddIndexElements(int[] ar) {
		for (int i = 0; i < ar.length; i++)
		{
			if (i % 2 != 0)
			{
				System.out.println(ar[i]+" ");
			}
		}
		
	}
}
