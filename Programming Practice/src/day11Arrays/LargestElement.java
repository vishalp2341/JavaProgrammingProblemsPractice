package day11Arrays;

import java.util.Scanner;

public class LargestElement {

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
			largest(ar);
	}

	private static void largest(int[] ar)
	{ 
		int largest=Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i]>largest)
			{
				largest = ar[i];
			}
			
		}
		System.out.println("Largest Element is "+largest);
		
		
	}

}
