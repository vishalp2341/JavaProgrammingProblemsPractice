package day21StringsIntro;

import java.util.Scanner;

public class PalindromeEfficient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		sc.close();
		String res = isPalindrome(s);
		System.out.println(res);
	}

	private static String isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return "Not Palindrome";
			}
				
		}
		return "Palindrome";
		
	}

}
