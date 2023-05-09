package day6_Oops;



public class StaticKeyword {

	static int a = 10; // static variable
	int b = 20; // no static variable

	static void m1() {
		System.out.println("this is m1 static method ");
	}

	void m2() {
		System.out.println("thi is m2 no static method");
	}

	void m3() {

		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		// static method only access only static stuff
		System.out.println(a);
		StaticKeyword.m1();

		// System.out.println(b); incorrect as b is no-static variable
		// m2(); incorrect, Because m2 is non static method.

		// static methods can also access non static stuff but through objects
		StaticKeyword se = new StaticKeyword();
		se.m2();
		System.out.println(se.b);
		se.m3();

	}
}
