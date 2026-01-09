package day6to8Loops;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n : ");
		int n = sc.nextInt();
		
		int rev = 0;
		while(n>0)
		{
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}	
		
		System.out.println(rev);

	}

}
