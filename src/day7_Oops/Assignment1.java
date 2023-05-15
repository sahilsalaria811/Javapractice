package day7_Oops;

class Teacher {
	
	String Designation ="Teacher";
	String CollegeName= "Beginnersbook";
	 void does() {
		 System.out.println("Teaching");
	 }
	
}

class Computer extends Teacher{
	
	String Designation ="hi dfdjfdj";
	String CollegeName= "dfdfds";
	 void does() {
		 System.out.println("Teaching");
	
	
}}


	

public class Assignment1 {
	public static void main(String[] args) {
		Computer computer = new Computer();
		System.out.println(computer.CollegeName);
		System.out.println(computer.Designation);
		computer.does();
	}

}
