package day6_Oops;

public class OverloadMainmethod {

	public void main(int x) 
	{
		System.out.println(x);
	}

	public void main(int x, int y) 
	{
		System.out.println(x + y);

	}

	public static void main(String[] args) {
		OverloadMainmethod obj =new OverloadMainmethod();
		obj.main(100);
		obj.main(50, 20);
	}

}
