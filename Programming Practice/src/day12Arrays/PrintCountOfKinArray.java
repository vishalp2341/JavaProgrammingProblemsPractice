package day12Arrays;

import java.util.Scanner;

public class PrintCountOfKinArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n");
		int n = scan.nextInt();

		int ar[] = new int[n];

		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++)
		{

			ar[i] = scan.nextInt();

		}
		
		System.out.println("enter k");
		int k = scan.nextInt();
		
		Countarr(ar,k);

	}

	private static void Countarr(int[] ar, int k) {
		
		int count = 0;
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i]==k)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
