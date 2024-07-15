package day29Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetRemoveDuplicates 
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s = scan.next();
		scan.close();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		String res = ""; 
		
		for(char x : set)
		{
			res = res + x;
		}
		System.out.println(res);
	}
	
}
