package funkcije;

import java.util.Scanner;

public class Dom_2382 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog
		 * ulaza i taj program treba da pozove i vrati (u mainu) proizvod unetih
		 * brojeva.
		 */

		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite broj");
			a[i] = sc.nextInt();
		}
		int proizvod = proizvod(a);
		System.out.println("Proizvod unetih brojeva je: " + proizvod);

	}

	private static int proizvod(int[] a) {
		// TODO Auto-generated method stub
		int proizvod = a[0];
		for (int i = 1; i < a.length; i++) {
			proizvod = a[i];

		}
		return proizvod;

	}

}
