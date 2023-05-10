package day4_array;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		int a[] = { 10, 10, 12 };
		System.out.println(a[0]);

		int s[][] = { { 10, 29 }, { 33, 33 } };

		System.out.println(s[1][1]);

		int f[] = { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 22, 2, };
		ArrayList w = new ArrayList();
		w.add(11);
		w.add(2);
		w.sort(null);
		System.out.println(w.isEmpty());
		w.add(2, 12);
		System.out.println(w.size());
	}

}
