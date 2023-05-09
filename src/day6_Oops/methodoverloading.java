package day6_Oops;

public class methodoverloading {

	void Mymethod(int a, int b) {
		System.out.println(a + b);
	}

	void Mymethod(int a, double b)

	{
		System.out.println(a+b);
	}

	void Mymethod(double a, double b)

	{
		System.out.println(a+b);
	}

	void Mymethod(int a, int b, int c)

	{
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		
		methodoverloading obj = new methodoverloading();
		obj.Mymethod(22, 22.2);
		
		
		
		
	}

}