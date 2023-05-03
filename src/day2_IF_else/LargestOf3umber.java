package day2_IF_else;

public class LargestOf3umber {
	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;

		if (a > b && a > c) {
			System.out.println("A is the largest");
		} else if (b > a && b > c) {
			System.out.println("B is the Largest");
		} else {
			System.out.print("C is the Largest");
		}

	}
}
