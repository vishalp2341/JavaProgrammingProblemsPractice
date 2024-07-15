package day19rearrangearray.ConsecutiveSubarray;

import java.util.Scanner;

public class SeparateNegative1Approach1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the ar: ");
		int size = scanner.nextInt();

		int[] ar = new int[size];
		System.out.println("enter array elements");

		for (int i = 0; i < size; i++) {

			ar[i] = scanner.nextInt();
		}
		scanner.close();

		

		approach1(ar);
	}

	private static void approach1(int[] ar) {

		int i = ar.length-1;
		int j = ar.length-1;
		
		while(i>=0)
		{
			if(ar[i]==-1)
			{
				i--;
			}
			else
			{
				ar[j]=ar[i];
				i--;
				j--;
			}
		}
		while (j>=0) 
		{
			ar[j]=-1;
			j--;
		}
		
		for (int k = 0; k < ar.length; k++) {
			System.out.print(ar[k]+" ");
		}
}
}
