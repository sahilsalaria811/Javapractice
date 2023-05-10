package day7_Oops;

// examples of single and multilevel inheritance class.

class A // parent class
{
	int a;

	void display() {

		System.out.println(a);
	}
}

class B extends A // b is a child class and A is parent class

{
	int b;

	void print() {
		System.out.println(b);
	}

}


class C extends B{

	int c;
	void cdisplay() {
		
		System.out.println(c);
	}

}

public class InheritanceExamples {

	public static void main(String[] args) {

		A aobj = new A();
		aobj.a = 10;
		aobj.display();

		B bobj = new B();
		bobj.a = 120;// A
		bobj.b = 250;// B

		bobj.display();// A
		bobj.print(); // B

		C cobj = new C();
		cobj.c=33;
		cobj.cdisplay();
		cobj.a=20;
		cobj.display();
		
		
		
		
	}

}
