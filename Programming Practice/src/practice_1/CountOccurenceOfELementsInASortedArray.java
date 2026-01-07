package practice_1;

import java.util.Scanner;

public class CountOccurenceOfELementsInASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
	
		int n = scan.nextInt();
		
		int ar[] = new int [n];
		System.out.println("enter the array elements");
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		int count = 1;
		
		for(int i = 0; i<ar.length-1; i++)
		{
			if(ar[i] == ar[i+1])
			{
				count++;
			}
			else
			{	
			System.out.println(ar[i]+ "->"+count);
			count = 1;
			}
		}
		System.out.println(ar[ar.length-1]+"->"+count);

	}

}
