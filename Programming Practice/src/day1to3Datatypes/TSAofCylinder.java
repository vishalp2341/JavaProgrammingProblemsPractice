package day1to3Datatypes;

import java.util.Scanner;

//Total Surface Area of a Cylidner 

// Area should have 4 decimals 
public class TSAofCylinder {
	public static void main(String[] args) {
		float pi = 3.142f;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius of the cylinder");
		int r  = scan.nextInt();
		System.out.println("enter the height of the cylinder");
		int h = scan.nextInt();
		Float area = 2*pi*r*(r+h);
		System.out.println("Area of the cylinder is: ");
		System.out.printf("%.4f", area);
	}
	

}
