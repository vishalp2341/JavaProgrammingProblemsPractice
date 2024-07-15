package day29Collections;


import java.util.TreeSet;
import java.util.Scanner;

public class RemoveArrayDuplicatesANDSort 
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size and elements");
		int n = scan.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]= scan.nextInt();
		}
		scan.close();
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < ar.length; i++)
		{
			set.add(ar[i]);
		}
		
		String res = ""; 
		
		for(int x : set)
		{
			
			System.out.println(x);
		}
	}
	
}
