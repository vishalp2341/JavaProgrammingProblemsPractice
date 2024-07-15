package day6to8Loops;
//Multiple of 3 and 5
import java.util.Scanner;

public class Multipleof3and5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		
		if(n%3 == 0 && n%5 == 0)
		{
			System.out.println("tapacad");
		}
		
		else if(n%3==0)
		{
			System.out.println("tap");
		}
		else if(n%5==0)
		{
			System.out.println("acad");
		}
		
		

	}

}
