package Day14ArrayPair;

import java.util.Scanner;

public class PairsSumEqualsK {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n");
		int n = scan.nextInt();
		
		System.out.println("Enter k");
		int k = scan.nextInt();

		int ar[] = new int[n];

		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {

			ar[i] = scan.nextInt();

		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				int sum = ar[i] + ar[j];
				if (sum == k) {
					System.out.println(ar[i] + " " + ar[j]);

				}
			}
		}

	}
}
