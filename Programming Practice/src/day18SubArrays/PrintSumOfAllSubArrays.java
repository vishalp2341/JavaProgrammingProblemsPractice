package day18SubArrays;

import java.util.Scanner;

public class PrintSumOfAllSubArrays {
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
		subar(ar);
	}

	static void subar(int[] ar) 
	{
		
		for (int size = 1; size <= ar.length; size++) 
		{
			for (int i = 0; i <= ar.length - size; i++) 
			{
				int sum = 0;
				for (int j = i; j < i + size; j++)
				{
					sum = sum + ar[j];
				}
					System.out.print(sum);
					System.out.println();
				}
			}
		}
		
	}
