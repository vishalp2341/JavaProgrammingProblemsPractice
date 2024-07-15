package day6to8Loops;
//Even Numbers Till N
import java.util.Scanner;

public class EvenNumbersTillN {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		
		for(int i = 1 ; i <= n ; i=i+2)
		{
			System.out.println(i);
		}

	}

}
