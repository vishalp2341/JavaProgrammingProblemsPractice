package day6to8Loops;

import java.util.Scanner;

public class ArmstrongOrNOt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int temp = n;
		while(n>0) {
			int digit = n % 10;
			sum = sum +  digit*digit*digit;
			n = n /10;
		}
		
		if(sum == temp)
		{
			System.out.println("sum ="+sum+" It is an armstrong Number");
			
		}
		else
		{
			System.out.println("sum ="+sum+" It is not an armstrong Number");
			
		}

	}

}
