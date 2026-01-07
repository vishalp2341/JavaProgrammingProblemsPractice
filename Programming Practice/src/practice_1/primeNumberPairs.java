package practice_1;

import java.util.Scanner;

public class primeNumberPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		System.out.println("enter the size");
		int n = scan.nextInt();
		
		int ar[] = new int [n];
		
		System.out.println("enter the array elements");
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		for(int i = 0; i<ar.length-1; i++)
		{
			for(int j = i+1; j<ar.length; j++)
			{
				if(checkPrime(ar[i]) && checkPrime(ar[j]))
				System.out.println(ar[i] + " " + ar[j]);
			}
		}

	}
	
	public  static boolean checkPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		for(int i = 2; i*i <= n; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
			
			
		}
		return true;
	}

}
