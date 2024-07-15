package day4to5Ifelse;

import java.util.Scanner;

//Finding Largest Of 4 numbers using ternary operator

public class LargestOf4numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 4 numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		
		int max1 = n1>n2?n1:n2;
		int max2 = n3>n4?n3:n4;
		int max = max1>max2?max1:max2;
		
		System.out.println(max);
		
	}

}
