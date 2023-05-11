package day7_Oops;

public class Animal {
	String color = "White";

	void eating() {

		System.out.println("Eating................");
	}

	Animal() {
		System.out.println("Animal is created");
	}

}

class Dog extends Animal {

	Dog() {
		super(); // invoked parent class constructor
		System.out.println("Dog is craeted");
       
	}

	String color = "Black";

	void Displaycolor() {
		System.out.println(color);
		System.out.println(super.color);

	}

    void eating() {
	System.out.println("Bread........");
		super.eating();
	}
}
