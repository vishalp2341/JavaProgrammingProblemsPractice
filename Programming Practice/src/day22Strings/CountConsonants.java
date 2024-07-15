package day22Strings;

import java.util.Scanner;

public class CountConsonants {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		sc.close();
		int res = CountCons(s);
		System.out.println(res);
	}

	private static int CountCons(String s) 
	{
		int count = 0;

		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			{
				if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I'
						&& ch != 'O' && ch != 'U')
				{
					count++;
				}
			}
		}
		return count;

	}
}
