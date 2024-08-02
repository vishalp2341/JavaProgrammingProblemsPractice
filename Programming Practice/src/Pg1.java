class A {
	static int i = 100;

}

class B extends A {
	static {
		i = 200;
	}
}

class C extends B {
	static {
		i = 300;
		System.out.println(i);
	}
}

public class Pg1 {
	public static void main(String[] args) {
		System.out.println(C.i);
	}
}