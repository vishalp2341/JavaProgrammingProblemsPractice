package day4to5Ifelse;

import java.util.Scanner;

//check whether the letter is unicode value is uppercase ot not
public class upperCaseORNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unicode value");
		int n = sc.nextInt();

		char ch = (char) n;
		System.out.println(ch);

		if (n >= 65 && n <= 90) {
			System.out.println("yes it is uppercase");
		} else

		{
			System.out.println("no it is not uppercase ");
		}

	}

}
