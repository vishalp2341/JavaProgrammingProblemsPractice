package day18SubArrays;

import java.util.Scanner;

public class PrintAllSubarraysWhoseSumisK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the ar: ");
		int size = scanner.nextInt();

		
		int[] ar = new int[size];
		System.out.println("enter array elements");

		
		for (int i = 0; i < size; i++) {

			ar[i] = scanner.nextInt();
		}
		System.out.println("enter k");
		int k = scanner.nextInt();
		scanner.close();
		subar(ar, k);
	}

	static void subar(int[] ar, int k) 
	{
		boolean kfound=false;
		for (int size = 1; size <= ar.length; size++) 
		{
			for (int i = 0; i <= ar.length - size; i++) 
			{
				int sum = 0;
				for (int j = i; j < i + size; j++)
				{
					sum = sum + ar[j];
				}

				if (sum == k) 
				{
					kfound = true;
					for (int j = i; j < i + size; j++)
					{
						System.out.print(ar[j]+" ");
					}
					System.out.println();
				}
			}
		}
		if(kfound==false)
		{
			System.out.println("None");
		}
		
	}
}