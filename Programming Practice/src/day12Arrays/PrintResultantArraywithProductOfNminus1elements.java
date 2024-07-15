package day12Arrays;

import java.util.Scanner;

public class PrintResultantArraywithProductOfNminus1elements {

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
		ProductOfNminus1elements(ar);

	}

	private static void ProductOfNminus1elements(int[] ar) {
		int product = 1;
		int [] res=new int[ar.length];
		//find the product of all elements
		for (int i = 0; i < ar.length; i++)
		{
			product=product*ar[i];
		}
		
		//finding the product of n-1 elements
		for (int i = 0; i < ar.length; i++)
		{
			res[i] = product/ar[i];
		}
		
		//printing res arr
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print(res[i]+" ");
		}
		
		
	}

}
