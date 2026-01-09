package day6to8Loops;

import java.util.Scanner;

public class PalidromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n : ");
		int n = sc.nextInt();
		
		int rev = 0;
		int temp = n;
		while(n>0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n /10;
		}
		
		if(rev == temp)
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not Palindrome");
			
		}

	}

}
