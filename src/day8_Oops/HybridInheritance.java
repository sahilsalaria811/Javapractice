package day8_Oops;

class A1{

	void m1()
	{
		System.out.println("This is the method from A1 class");
	}
}

interface B1{
	void m2();
	
}
interface B2{
	void m3();
}





public class HybridInheritance extends A1 implements B1, B2{

	
	public void m2() {
		System.out.println("this is m2 Method from B1 interface");
	}
	
	public void m3()
	{
		System.out.println("method m3 from the B2 interface ");
	}
	
	
	public static void main(String[] args) {
		
		HybridInheritance hybrid = new HybridInheritance();
	
		hybrid.m1();
		hybrid.m2();
		hybrid.m3();
		
			
	}

}
