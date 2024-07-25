package day22Strings;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		sc.close();
	
		int res = countWords(s);
		System.out.println(res);
	}

	private static int countWords(String s) {
		int count = 0;
		for(int i = 0; i<s.length()-1; i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return s.charAt(0) == ' '? count : count+1;

}
}
	