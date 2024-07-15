package day6to8Loops;
// Multiples Of A and B till N
import java.util.Scanner;

public class MultipleOfAORBTillN {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n,a,b");
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i = 1 ; i <=n; i++)
		{
			if(i % a == 0 || i % b  == 0)
			{
				System.out.println(i);
			}
		}
		
	}

}
