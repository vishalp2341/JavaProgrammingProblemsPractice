package day9Loops;

import java.util.Scanner;
//lowest common multiple .
//formula is (a*b)/hcf(a,b)

public class LCMof2numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();
		
		
		int hcf = hcfAB(a,b);
		
		int lcm = (a*b)/hcf;
		System.out.println(lcm);
	}

	private static int hcfAB(int a, int b) 
	{
		int min = a < b ?a : b;
		
		for(int i = min ;i>=1 ; i--)
		{
			if (a % i == 0 &&  b % i == 0)
			{
				return i; //return inside loop or condition is used so another return should be given
						  // outside it.
			}
		}
		return -1;		//another return here
		
	}

}
