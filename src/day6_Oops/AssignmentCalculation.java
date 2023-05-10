package day6_Oops;

public class AssignmentCalculation {

	int sum(int x, int y) {
		return x + y;
	}

	int sum(int x, int y, int z) {
		return x + y + z;
	}

	double sum(double x, double y) {
		return x + y;
	}

	double sum(double x, double y, double z) {
		return x + y + z;
	}

	public static void main(String[] args) {

		AssignmentCalculation assign = new AssignmentCalculation();

		int s =assign.sum(10, 101);
		assign.sum(10, 0);
		assign.sum(10.2, 100.2, 0);
		assign.sum(105.2, 10.25, 10.10);
System.out.println(s);
	}
} 
