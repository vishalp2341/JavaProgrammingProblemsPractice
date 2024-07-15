package day13Array;

import java.util.Scanner;
//Printing Second Largest Element In An Array
public class SecondLargestElementInAnArray {

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
		int secondlargest = secondmax(ar);
		System.out.println(secondlargest);

	}

	private static int secondmax(int[] ar) {
		int p = Integer.MIN_VALUE;
		int vp = Integer.MIN_VALUE;
		
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]>p)
			{
				vp = p;
				p = ar[i];
						
			}
			
			else if(ar[i]>vp && ar[i]!=p)
			{
				vp = ar[i];
			}
		}
		return vp;
	}

}
