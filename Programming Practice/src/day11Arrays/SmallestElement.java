package day11Arrays;

import java.util.Scanner;

public class SmallestElement {

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
			smallest(ar);
	}

	private static void smallest(int[] ar)
	{ int smallest=Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i]<smallest)
			{
				smallest = ar[i];
			}
			
		}
		System.out.println("Smallest element is " +smallest);
		
		
	}

}
