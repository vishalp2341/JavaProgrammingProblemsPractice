package day9Loops;

import java.util.Scanner;

//Multiples of a number "n" till given value "x" 
public class Multiplesofnumbertillgivenvalue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		System.out.println("enter x");
		int x = scan.nextInt();
		
		for(int i = 1 ; i <= x; i++)
		{
			if(i % n == 0)
			{
				System.out.print (i+" ");
			}
		}
	}

}
