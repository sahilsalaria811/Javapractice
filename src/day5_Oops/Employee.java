package day5_Oops;

public class Employee {
	// class and objects

	int EmpId;
	String Empname;
	double Salary;
	int Deptno;
	String job;

	void display() {
		System.out.println(EmpId);
		System.out.println(Empname);
		System.out.println(Salary);
		System.out.println(Deptno);
		System.out.println(job);

	}

//	public static void main(String args[]) {
//		Employee emp1 = new Employee(); // Creating object for employee class
//		emp1.EmpId = 1;
//		emp1.Empname = "Sahil salaria";
//		emp1.Salary = 20000;
//		emp1.Deptno = 2;
//		emp1.job = "Software tester";
//		emp1.display();
//
//		Employee emp2 = new Employee();
//		emp2.EmpId = 2;
//		emp2.Empname = "Shivani thakur";
//		emp2.Salary = 20000;
//		emp2.Deptno = 2;
//		emp2.job = "Software tester";
//		emp2.display();
//	}

}