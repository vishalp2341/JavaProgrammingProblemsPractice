package day22Strings;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		sc.close();
		int res = countVowels(s);
		System.out.println(res);
	}

	private static int countVowels(String s) {
		int count = 0;
	
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' 
					||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'  )
			{
				count++;
			}
		}
		return count;

}
}
