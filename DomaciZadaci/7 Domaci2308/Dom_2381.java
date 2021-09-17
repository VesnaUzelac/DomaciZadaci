package funkcije;

import java.util.Scanner;

public class Dom_2381 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja)
//i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.

		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite broj");
			a[i] = sc.nextInt();
		}
		int minimum = minimum(a);
		System.out.println("Najmanji broj je: " + minimum);

	}

	private static int minimum(int[] a) {
		// TODO Auto-generated method stub
		int minimum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (minimum > a[i]) {
				minimum = a[i];
			}

		}
		return minimum;
	}
}
