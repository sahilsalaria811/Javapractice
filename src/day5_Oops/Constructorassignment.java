package day5_Oops;

public class Constructorassignment {

	int x, y, z;

	Constructorassignment(int a, int b, int c) // Constructor
		
	{    x = a;
		y = b;
		z = c;
	}

	void sum() {
		System.out.println(x + y + z);}
		

	public static void main(String[] args) {

		Constructorassignment s = new Constructorassignment(10, 20, 30);
	s.sum();

	}

}
