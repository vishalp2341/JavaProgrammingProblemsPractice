package day26and27;

import java.util.Scanner;

public class ReverseFirstLastWords {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String");
		 String s = sc.nextLine();
		
		 int size = countWords(s);
			
		 String st[] = splitString(s,size);
		 String res = reverseWords(st);
		 System.out.println(res);
	}

	private static String reverseWords(String[] st) {
		
		String res = "";
		for(int i = 0 ; i<st.length; i++)
		{
			String t = st[i];
			String rev = reverse(t);
			if(i==0 || i==st.length-1)
			{
				
				res = res + rev+ ' ';
			}
			
			else
			{
				res= res + t + " ";
			}
		}
		return res;
	}

	private static String[] splitString(String s, int size) {
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
		
		return st;
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
	
	private static String reverse(String s) {
		String t = "";
		for(int i = s.length()-1; i >=0 ; i--)
		{
			t= t+s.charAt(i);
		}
		return t;
	}

}
