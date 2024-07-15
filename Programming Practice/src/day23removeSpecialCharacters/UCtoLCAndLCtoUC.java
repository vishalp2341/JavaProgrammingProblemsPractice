package day23removeSpecialCharacters;


import java.util.Scanner;

public class UCtoLCAndLCtoUC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String s = sc.nextLine();
		sc.close();

		UCtoLCAndLCtoUCchar(s);
	}

	private static void UCtoLCAndLCtoUCchar(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
				if(ch >= 'A' && ch <= 'Z')
				   
				{
					res = res + (char)(ch+32);
				}
			
				else if(ch >= 'a' && ch <= 'z')
					   
					{
						res = res + (char)(ch-32);
					}
				
		}
		System.out.println(res);
		
	}

}
