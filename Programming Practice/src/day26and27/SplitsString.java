package day26and27;

import java.util.Scanner;

public class SplitsString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int size = countWords(s);
		
		splitString(s,size);
	}

	private static void splitString(String s, int size) {
		String st[] = new String[size];
		int j = 0;
		String t = "";
		for(int i = 0 ; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ') {
			 t = t + s.charAt(i);
			}
			else if(t.length()>0)
			{
				st[j]=t;
				j++;
				t = "";
			}
		}
		if(t.length()>0)
		{
			st[j] = t;
		}
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}

	private static int countWords(String s)
	{
		String t = "";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
			{
				t = t + s.charAt(i);
				count++;
			}

		}
		if (s.charAt(0) == ' ') 
		{
			return count;
		} else 
		{
			return count + 1;
		}
	}
}
