package day21StringsIntro;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		sc.close();
		palcheck(s);
	}

	private static void palcheck(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
	}

}
