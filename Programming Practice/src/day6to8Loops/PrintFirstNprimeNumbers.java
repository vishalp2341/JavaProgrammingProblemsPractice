package day6to8Loops;

import java.util.Scanner;

public class PrintFirstNprimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of prime numbers to be printed");
		int n = scan.nextInt();
		printPrime(n);

	}

	static void printPrime(int n) {
		int count = 0;
		for (int i = 2; count <n; i++) {
			if (checkPrime(i)) {
				count++;
				System.out.println(i);
			}

		}
	}

	static boolean checkPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

}
