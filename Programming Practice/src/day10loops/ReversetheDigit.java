package day10loops;
//Reversing the given Digit
import java.util.Scanner;

public class ReversetheDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		revofdigits(n);

	}

	private static void revofdigits(int n) 
	{
		int rev = 0;
		int last = 0;

		while (n > 0) 
		{
			last = n % 10;
			rev = rev * 10 + last;
			n = n/10;
		}
		System.out.println(rev);

	}

}
