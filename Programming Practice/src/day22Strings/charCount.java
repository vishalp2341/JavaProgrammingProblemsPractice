package day22Strings;

import java.util.Scanner;

public class charCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		sc.close();
		CountCons(s);
		
	}

	private static void CountCons(String s) 
	{
		int vcount= 0;
		int ccount= 0;
		int dcount = 0;
		int scount = 0;

		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			{
				if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' 
						||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'  )
				{
					vcount++;
				}
				else
				{
					ccount++;
				}
			}
			
			else if(ch>='0' && ch <= '9')
			{
				dcount++;
			}
			
			else
			{
				scount++;
			}
		}
		System.out.println("Vowels: " + vcount );
            
		System.out.println("Consonants: " + ccount);
		System.out.println("Special Characters: " + scount);
		System.out.println("Digits: " + dcount  );
	}
}
