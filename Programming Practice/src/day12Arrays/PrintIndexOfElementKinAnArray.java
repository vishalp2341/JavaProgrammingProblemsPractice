package day12Arrays;

import java.util.Scanner;

public class PrintIndexOfElementKinAnArray {

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
		
		int res = printKindex(ar,k);
		System.out.println(res);
	}

	private static int printKindex(int[] ar, int k) {
		
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i]==k)
			{
				return i;
			}
		
		}
		return -1;
		
	}

}
