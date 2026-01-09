package Day14ArrayPair;

import java.util.Scanner;

public class CheckPrimeSumArrayPair {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n");
		int n = scan.nextInt();


		int ar[] = new int[n];

		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {

			ar[i] = scan.nextInt();

		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				int sum = ar[i] + ar[j];
				if (checkprime(sum)) {
					System.out.println(ar[i] + " " + ar[j]);

				}
			}
		}
	}

	private static boolean checkprime(int n) {
		// TODO Auto-generated method stub
		if (n <= 0)
			return false;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
