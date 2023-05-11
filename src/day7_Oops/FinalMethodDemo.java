package day7_Oops;

class Bike {
//	final
	void run() // Final method so we cannot override this method in child class 
	{
		System.out.println("Running ......");
	}
}

class Honda extends Bike {

	void run() {
		System.out.println("Started ......");
	}

}


public class FinalMethodDemo {

}
