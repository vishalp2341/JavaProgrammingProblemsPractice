package day13Array;

import java.util.Scanner;
//Smallest Product Using Any 2 Elements
public class SmallestProductUsingAny2Elements {

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
		int Largest = firstmax(ar);
		int SecondLargest = secondmax(ar);
		
		int Smallest = firstmin(ar);
		int SecondSmallest = secondmin(ar);
		
	
		int product1 = Largest * SecondLargest;
		int product2 = Smallest * SecondSmallest;
		int product3 = Largest * Smallest;
		
		int minprod = product1 < product2?product1:product2;
		
		int res = minprod < product3? minprod:product3;
		
		System.out.println("Smallest Product Using Any 2 Elements is "+res);
		
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
