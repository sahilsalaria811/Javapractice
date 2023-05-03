package day5_Oops;

public class StudentMain {

	public static void main(String args[]) {

//		Student student1 = new Student();

// 1st>> Assign value by using reference variable
//		 student1.sid=1;
//		   student1.sname="Sahil salaria";
//		    student1.grade='A';
//		

		// 2nd>> Assign the value by using method
		// student1.getvalues(10, "sahil", 'A');

		Student student1 = new Student(10, "sahil", 's'); // 3rd by using constructor

		student1.display();

	}
}
