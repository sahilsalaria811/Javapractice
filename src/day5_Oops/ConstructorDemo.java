package day5_Oops;

public class ConstructorDemo {

	// 2 TYPES OF CONSTRUCTOR
//	    i)Default CONSTRUCTOR
	// ii)Parameterised CONSTRUCTOR

	int x;
	int y;

	ConstructorDemo()    //	    Default CONSTRUCTOR
	{
		x = 20;
		y = 256;
	}

	ConstructorDemo(int a, int b)   // Parameterised CONSTRUCTOR
	{
		x = a;
		y = b;
	}
	
	
	
	
	
	
	

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		ConstructorDemo cm = new ConstructorDemo();
        cm.display();
          	
	     ConstructorDemo cm1 = new ConstructorDemo(10,20);
	     cm1.display();
	}

}
