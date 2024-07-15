package day4to5Ifelse;

import java.util.Scanner;
//even or odd


public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		if(n%2 == 0)
		{
			System.out.println("even");
		}
		{
			System.out.println("odd");
		}

	}

}
