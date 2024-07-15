package day18SubArrays;

import java.util.Scanner;
//size is given

public class PrintSubArraOfGivenSize {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Accept the size of the ar
		System.out.print("Enter the size of the ar: ");
		int size = scanner.nextInt();

		// Initialize the ar
		int[] ar = new int[size];
		System.out.println("enter array elements");

		// Accept ar elements from the user
		for (int i = 0; i < size; i++) {

			ar[i] = scanner.nextInt();
		}
		System.out.println("enter k");
		int k = scanner.nextInt();
		scanner.close();
		subar(ar, k);
	}

	static void subar(int[] ar, int size) 
	{	
		
		for (int i = 0; i <= ar.length - size; i++) 
			{

				for (int j = i; j < i + size; j++)
				{
					System.out.print(ar[j]+" ");
				}

				System.out.println();
			}
		}
		
	}
