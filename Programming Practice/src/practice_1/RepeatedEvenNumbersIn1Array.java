package practice_1;

import java.util.Scanner;

public class RepeatedEvenNumbersIn1Array {

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
		
		for(int i = 0; i<ar.length-1; i++)
		{
			if(ar[i] == ar[i+1] && ar[i]%2 == 0)
			{
				System.out.print(ar[i]+ " ");
				while(i<ar.length - 1 && ar[i] == ar[i+1])
					i++;
			}
		}

	}

}
