package day4to5Ifelse;
//Printing Absolute Values(no -)
import java.util.Scanner;

public class PrintAbsoluteValues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		
		if(n>0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(n*(-1));
		}

	}

}
