package day23removeSpecialCharacters;


import java.util.Scanner;

public class RemoveSplCharAndAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String s = sc.nextLine();
		sc.close();

		RemoveSplandadd(s);
	}

	private static void RemoveSplandadd(String s) {
		String res = "";
		String alph = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
				if(ch >= 'A' && ch <= 'Z'|| 
				   ch >= 'a' && ch <= 'z')
				{
					alph = alph + ch;
				}
				else if(ch >= '0' && ch <= '9')
			
				{
					sum = sum + (ch-'0');
				}
				
		}
		res= alph + sum;
		System.out.println(res);
		
	}

}
