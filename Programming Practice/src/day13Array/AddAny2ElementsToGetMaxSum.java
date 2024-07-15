package day13Array;

import java.util.Scanner;
//Add Any 2 Elements To Get Max Sum

public class AddAny2ElementsToGetMaxSum {

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
		
		int FirstLargestElement = firstmax(ar);
		int SecondLargestElement = secondmax(ar);
		int Largestof2 = FirstLargestElement + SecondLargestElement;
		System.out.println("largest sum of any 2 elements is " + Largestof2);
	}
		
		
		private static int firstmax(int[] ar) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++)
		{
		if(ar[i]>largest)
		{
			largest = ar[i];
		}
		}
		
		return largest;
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
				
				else if(ar[i]>vp) //second condition not required as duplicate elements can be used 
					               //(as the question mentitons, any 2 elements) to find the sum . 
				{
					vp = ar[i];
				}
			}
			return vp;
		
	}

}
