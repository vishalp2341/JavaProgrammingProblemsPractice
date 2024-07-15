package day6to8Loops;

import java.util.Scanner;

public class CountNumberofFactors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		int count = 0;
		for(int i = 1;i<=n;i++)
		{
			
			if(n % i ==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
