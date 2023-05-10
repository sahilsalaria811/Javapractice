package day7_Oops;

class Bank {

	double rateofinterest() {

		return 0;
	}
}

class SBI extends Bank {
	double rateofinterest() {

		return 10.5;
	}
}

class ICICI extends Bank {
	double rateofinterest() {

		return 9.3;
	}

}

class AXIS extends Bank {
	double rateofinterest() {

		return 8.5;
	}
 
}

public class Methodoverriding {
	public static void main(String[] args) {

		SBI sbi = new SBI();
		System.out.println(sbi.rateofinterest());

		ICICI icici = new ICICI();
		System.out.println(icici.rateofinterest());

		AXIS axis = new AXIS();
		System.out.println(axis.rateofinterest());

	}
}