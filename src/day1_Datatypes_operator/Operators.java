package day1_Datatypes_operator;

public class Operators {

	public static void main(String[] args) {
		int a=20;
		int b= 10;
		// Arithmetic operator + - * / %
		System.out.println(a+b);
		System.out.println("Sum of the two numbers"+ (a+b));  // +
		System.out.println("Diff of the two numbers"+ (a-b)); // -
		System.out.println("Sum of the two numbers"+ (a%b)); // % Quotient
		System.out.println("Sum of the two numbers"+ (a/b));  // / reminder
		

		// Relational operators/Comparison operators always retirn the boolean value(True or False)
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
	
	
	//Logical operators  
		boolean x=true;
		boolean y= false;

		System.out.println(x && y); //False

		System.out.println(x || y); //TRUE

		System.out.println(!x); // FALSE
		
	//	Increment and Decrement operators
	
	
	
	}

}
