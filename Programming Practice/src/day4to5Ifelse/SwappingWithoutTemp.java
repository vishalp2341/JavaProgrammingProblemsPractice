package day4to5Ifelse;

public class SwappingWithoutTemp 
{

	public static void main(String[] args) 
	{
		int a, b, temp;

		a = 10;
		b = 20;
		System.out.println("Before Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
