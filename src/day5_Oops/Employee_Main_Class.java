package day5_Oops;

public class Employee_Main_Class {
	public static void main(String args[]) {
		Employee emp1 = new Employee(); // Creating object for employee class
		emp1.EmpId = 1;
		emp1.Empname = "Sahil salaria";
		emp1.Salary = 20000;
		emp1.Deptno = 2;
		emp1.job = "Software tester";
		emp1.display();

		Employee emp2 = new Employee();
		emp2.EmpId = 2;
		emp2.Empname = "Shivani thakur";
		emp2.Salary = 20000;
		emp2.Deptno = 2;
		emp2.job = "Software tester";
		emp2.display();
	}

}
