package day6to8Loops;

import java.util.Scanner;

public class FactorsOfaGivenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		for(int i = 1;i<=n;i++)
		{
			
			if(n % i ==0)
			{
				System.out.println(i);
			}
		}

	}

}
