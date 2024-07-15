package day4to5Ifelse;

import java.util.Scanner;

public class TwodigitNumberOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		if(n>9 && n<100)
		{
			System.out.println("yes it is a 2 digit number");
		}
		else
		{
			System.out.println("no it is not a 2 digit number");
		}

	}

}
