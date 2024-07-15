package day9Loops;

import java.util.Scanner;

//Multiples of numbers "a" and "b" till given value "n" 
public class COMMONMutiplesofAandBTillN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();
		System.out.println("enter n");
		int n = scan.nextInt();
		multiplesABN(a,b,n);
	}

	private static void multiplesABN(int a, int b, int n) {
		for(int i = 1 ; i <= n; i++)
		{
			if(i % a == 0 && i % b == 0)
			{
				System.out.print (i+" ");
			}
		}
		
	}

}
