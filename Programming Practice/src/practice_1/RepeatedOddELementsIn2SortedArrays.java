package practice_1;

import java.util.Scanner;

public class RepeatedOddELementsIn2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of array 1 and array 2");
		Scanner scan = new Scanner(System.in);
		int n =  scan.nextInt();
		int m =  scan.nextInt();
		int ar1[] = new int[n];
		int ar2[] = new int[m];
		System.out.println("enter array 1 elements");
		for(int i = 0; i<ar1.length; i++)
		{
			ar1[i] = scan.nextInt();
		}
		System.out.println("enter array 2 elements");
		for(int j = 0; j<ar2.length; j++)
		{
			ar2[j] = scan.nextInt();
		}
		
		int i = 0;
		int j = 0;
		while(i<ar1.length && j <ar2.length)
		{
			if(ar1[i] == ar2[j])
			{
				if(ar1[i] % 2 != 0)
				{
					System.out.print(ar1[i]+" ");
				}
				i++;
				j++;
			}
			else if(ar1[i] < ar2[j])
				i++;
			else
				j++;
		}
		
		
	}

}
