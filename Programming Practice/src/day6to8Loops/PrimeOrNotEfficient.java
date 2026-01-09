
package day6to8Loops;

import java.util.Scanner;

public class PrimeOrNotEfficient {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		if (checkPrime(n)) {
			System.out.println("prime");

		} else

		{
			System.out.println("not prime");
		}
	}

	static boolean checkPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

}
