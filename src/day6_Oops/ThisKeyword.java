package day6_Oops;

public class ThisKeyword {
	int a, b; // instance variable or class variable

	void getvalues(int x, int y) {
		a = x;
		b = y;
	}

	void printvalues() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword();
		th.getvalues(10, 20);
		th.printvalues();
	}

}
