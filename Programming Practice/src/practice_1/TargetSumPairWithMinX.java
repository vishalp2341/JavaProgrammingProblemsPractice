package practice_1;

import java.util.Scanner;

public class TargetSumPairWithMinX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int min = Integer.MAX_VALUE;
		int n = scan.nextInt();
		
		int ar[] = new int [n];
		System.out.println("enter the array elements");
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		System.out.println("enter m");
		int m = scan.nextInt();
		int x = 0;
		int y = 0;
		
		for(int i = 0; i<ar.length - 1; i++)
		{
			for(int j = i+1; j<ar.length; j++)
			{
				if(ar[i] + ar[j] == m && ar[i] != ar[j])
				{
				if(ar[i] < min)
				{
					min = ar[i];
					x = ar[i];
					y = ar[j];
				}
				}
			}
		}
		if(min != Integer.MAX_VALUE)
		{
		System.out.println(x + " " +y);
		}
		else {
			System.out.println("no pair found");
		}

	}	
	
	

}
