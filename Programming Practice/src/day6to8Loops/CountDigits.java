package day6to8Loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
//		for(int i =0; i<n; i++)
		while(n>0)
		{
			count++;
			n = n/10;
		}
		System.out.println(count);
	}
	

}
