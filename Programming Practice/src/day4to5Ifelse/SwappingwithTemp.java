package day4to5Ifelse;

public class SwappingwithTemp 
{

	public static void main(String[] args)
	{
		int a, b, temp;

		a = 10;
		b = 20;
		System.out.println("Before Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
