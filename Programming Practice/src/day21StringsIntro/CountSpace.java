package day21StringsIntro;

import java.util.Iterator;
import java.util.Scanner;

public class CountSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		sc.close();
		int res = countspace(s);
		System.out.println(res);
	}

	private static int countspace(String s) {
		int count = 0;
	
		for (int i = 0; i < s.length()-1; i++)
		{
			
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		return count;

}
}
