package day5_Oops;

public class Assignment {

	int sid;
	String sname;
	int sub1;
	int sub2;
	int sub3;

	void getSdata(int id, String name) {
		sid = id;
		sname = name;
	}

	void getSmarks(int marks1, int marks2, int marks3) {

		sub1 = marks1;
		sub2 = marks2;
		sub3 = marks3;
	}

	void totalmarks() {
		System.out.println(
				"Student id: " + sid + " Student name: " + sname + " Student total marks: " + (sub1 + sub2 + sub3));
	}

	public static void main(String[] args) {

		Assignment student1 = new Assignment();
		student1.getSdata(1, "sahil");
		student1.getSmarks(10, 110, 20);
		student1.totalmarks();

		Assignment student2 = new Assignment();

		student2.getSdata(2, "Sahil salaria");
		student2.getSmarks(200, 300, 400);
		student2.totalmarks();

	}
}
