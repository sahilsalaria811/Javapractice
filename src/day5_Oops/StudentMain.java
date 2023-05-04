package day5_Oops;

public class StudentMain {

	public static void main(String args[]) {
//		Assign the value to class variables
		// 1st>> Assign value by using reference variable
//		Student Student1 = new Student();
//		Student1.sname = "Sahil";
//		Student1.sid = 12;
//		Student1.grade = 'a';
//
//		Student1.display();
//
//		Student student2 = new Student();
////2nd>> Assign the value by using method
//		student2.getvalues(1, "sahil salaria", 'b');

		// 3rd assign value by using the constructor.
		Student Student = new Student(1,"sahil",'a');
		Student.display();
		
		
		
		
	}
}
