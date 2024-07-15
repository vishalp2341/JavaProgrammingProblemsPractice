package day23removeSpecialCharacters;


import java.util.Scanner;

public class RemoveSplChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String s = sc.nextLine();
		sc.close();

		RemoveSpl(s);
	}

	private static void RemoveSpl(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
				if(ch >= 'A' && ch <= 'Z'|| 
				   ch >= 'a' && ch <= 'z'||
				   ch >= '0' && ch <= '9')
				{
					res = res + ch;
				}
			
		}
		System.out.println(res);
		
	}

}
