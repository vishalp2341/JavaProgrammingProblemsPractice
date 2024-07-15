package day13Array;

import java.util.Scanner;
//Add Any 2 Elements To Get Min Sum

public class AddAny2ElementsToGetMinSum {

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
		
		int FirstSmallestElement = firstmin(ar);
		int SecondSmallestElement = secondmin(ar);
		int Smallestof2 = SecondSmallestElement + FirstSmallestElement;
		System.out.println("Smallest sum of any 2 elements is " + Smallestof2);
	}
		
		
		private static int firstmin(int[] ar) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++)
		{
		if(ar[i]<smallest)
		{
			smallest = ar[i];
		}
		}
		
		return smallest;
	}


		private static int secondmin(int[] ar) {
			int p = Integer.MAX_VALUE;
			int vp = Integer.MAX_VALUE;
			
			for(int i = 0; i<ar.length; i++)
			{
				if(ar[i]<p)
				{
					vp = p;
					p = ar[i];
							
				}
				
				else if(ar[i]<vp) //second condition not required as duplicate elements can be used 
									//(as the question mentitons, any 2 elements) to find the sum . 
				{
					vp = ar[i];
				}
			}
			return vp;
		
	}

}
