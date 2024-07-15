package day1to3Datatypes;
// Print the Last Digit 
import java.util.Scanner;

public class PrintLastDigit {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int lastDigit = n%10;
		
		System.out.println(lastDigit);
		


	}

}
