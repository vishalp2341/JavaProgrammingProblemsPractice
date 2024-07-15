package day4to5Ifelse;

import java.util.Scanner;

//if else ladder


public class Marks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scan.nextInt();

		if (marks >= 80) {
			System.out.println("Distinction");
		} 
		
		else if (marks >= 60 && marks <= 79) {
			System.out.println("First Class");
		} 
		
		else if (marks >= 40 && marks <= 59) {
			System.out.println("second Class");
		}
		
		else
		{
			System.out.println("fail");
		}

	}
}
