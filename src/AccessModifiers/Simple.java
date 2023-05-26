package AccessModifiers;

class A {
	
	
	
//	private int data = 10;
//
//	private void M1() {
//		System.out.println(data);
//	}

	
	
	protected int a=20;
	protected void m2() {
		
	}
	
	
	
	
	
}

public class Simple {

	public static void main(String[] args) {

		A aobj = new A();

	//	aobj.M1(); // Complile time error

	}
}
