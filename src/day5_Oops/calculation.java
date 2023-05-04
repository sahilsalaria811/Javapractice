package day5_Oops;

//methods understanding
public class calculation {

	int x = 10;
	int y = 20;

	// CASE 1
	void sum() {
		System.out.println("CASE 1> " + x + y);}
	

	// CASE 2 -not taking value but returning value
	int sum1() {
		return (x + y);}

	
	// CASE 3
	void sum2(int a, int b) {
		System.out.println("CASE 3> " + (a + b));}
	
	
	//CASE 4
	int Sum3(int a, int b) {return (a+b);}

	
	public static void main(String[] args) {
		calculation cal = new calculation();
		// case1
		cal.sum();
		// CASE 2
		int res = cal.sum1();
		System.out.println("CASE 2> " + res);
		System.out.println(cal.sum1());

		// CASE 3
		cal.sum2(100, 200);

		//CASE 4 
		System.out.println("CASE 4  "+ cal.Sum3(200, 400));
	}
}

// Method>>> Block of code.
//Case1- not taking parametters and also not return any value
//Case2- not taking parametters but returning value
//Case3- method is taking parameter and aslo returning a value








