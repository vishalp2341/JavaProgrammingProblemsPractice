package day6to8Loops;

import java.util.Scanner;

public class MultiplicationTableTill10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number for multiplication table");
		int n = scan.nextInt();
		
		for(int i = 1; i <=10;i++)
		{
			System.out.println(n+"X"+i+"="+(n*i));
		}

	}

}
