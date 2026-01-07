package practice_1;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		int n = 5;
		for (int i = 1; i <= n; i++) {
		    System.out.print(a + " ");
		    int c = a + b;
		    a = b;
		    b = c;
		}

	}

}
