package day6_Oops;

public class ConstructorOverloading {
	
	
	ConstructorOverloading(int a, int b){

		System.out.println(a+b);
	
	}
	ConstructorOverloading(int a, double b)
	{
		System.out.println(a+b);
		
	}
	

	public static void main (String []args) {
	
	ConstructorOverloading obj= new ConstructorOverloading(10,10.12);
	}
}
	
	
	


