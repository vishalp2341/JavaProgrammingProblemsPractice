package day1to3Datatypes;
//print the numbers excluding the last digit
import java.util.Scanner;

public class PrintNumbersExcludingLastDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = n/10;
		System.out.println("number without the last digit is : "+res);
		

	}

}
