package day7_Oops;

class parent {

	int a;

	void display() {
		System.out.println(a);
	}

}

class Child1 extends parent {

	int x;

	void show() {
		System.out.println(x);
	}

}

class Child2 extends parent {
	int y;

	void show2() {
		System.out.println(y);
	}
}

public class HierarchyInheritance {
	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.x = 10;
		c1.show();
		c1.a = 100;
		c1.display();

		Child2 c2 = new Child2();

		c2.y=10;
		c2.show2();
		c2.a=201;
		c2.display();
		
		
		
	}

}
