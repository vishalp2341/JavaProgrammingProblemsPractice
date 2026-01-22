package day18SubArrays;

import java.util.Scanner;

public class PrintAllSubArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter the size of the ar: ");
		int size = scanner.nextInt();

		
		int[] ar = new int[size];

		
		for (int i = 0; i < size; i++) {

			ar[i] = scanner.nextInt();
		}
		scanner.close();
		subar(ar);
	}

	static void subar(int[] ar) {
		for (int size = 1; size <= ar.length; size++)
		{
			for (int i = 0; i <= ar.length - size; i++)
			{
				for (int j = i; j < i + size; j++)
				{
					System.out.print(ar[j] + " ");
				}
				System.out.println();

			}
		}
	}
}