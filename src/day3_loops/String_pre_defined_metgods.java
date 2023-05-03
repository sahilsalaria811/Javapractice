package day3_loops;

public class String_pre_defined_metgods {
public static void main(String[]args) {
	String s= "this is the string and type in lower case";
	//length and uppercase methods
	
	System.out.println(s.length() +s);
	System.out.println(s.toUpperCase());
	
	//charAt()
	s="welcome";
	System.out.println(s.charAt(3));
	
	
	//contains() this method returns true
	s="Welcome to the java";
	System.out.println(s.contains("to"));

	//equals() method
	s="welcome";
	String s1="Welcome";
System.out.println(s.equals(s1));
	
	System.out.println(s.equalsIgnoreCase(s1));		
	
	//replace() method
	s="Welcome";
	System.out.println(s.replace("e", "a"));
		
	//substring method
	s="welcome";
	System.out.println(s.substring(0,3));

	
	
	
	
	
}
}
