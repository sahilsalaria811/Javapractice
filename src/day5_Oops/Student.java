package day5_Oops;

public class Student {

	int sid;
	String sname;
	char grade;

	// Void method to print the value
	void display() {
		System.out.println("Sid= " + sid + " Sname= " + sname + " grade= " + grade);
	}

	// 2> Create a void method to call in th main class assign the value
	void getvalues(int id, String name, char g) {
		sid = id;
		sname = name;
		grade = g;
	}

	// 1) Constructor is a special type of method
	// 2) Constructor is used for initilizing the class variable
	// 3) Constructor name should be same as the class name
	// 4) Constructor will not return any value(not even void)
	// 5) Constructor will be invoked at the time of object creation.
	Student(int id, String name, char g)
	{
		sid=id;
		sname=name;
		grade=g;
		
	}
	

}
