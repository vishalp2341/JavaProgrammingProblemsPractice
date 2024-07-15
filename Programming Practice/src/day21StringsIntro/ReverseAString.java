package day21StringsIntro;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		String res = "";
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i = s.length() - 1; i >= 0; i--)
		{
			res = res + s.charAt(i);
		}
		System.out.println(res);
		sc.close();
	}

}
