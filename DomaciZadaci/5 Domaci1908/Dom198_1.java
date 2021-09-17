package Primer02;

import java.util.Scanner;

public class Dom198_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan
		 * broj prikaze mu se suma svih prethodno unetih brojeva i na kraju
		 * zakomentarisati koje ste brojeve sve unosili po testu na primer: //test 1 x,
		 * y, z //test 2 x, y, z //test 3 x, y, z (Koristiti do while petlju)
		 */

		Scanner sc = new Scanner(System.in);

		double broj = 0;
		double zbir = 0;

		do {
			zbir = zbir + broj;
			System.out.println("Unesite pozitivan broj");
			broj = sc.nextDouble();

		} while (broj >= 0);
		System.out.println("Zbir svih brojeva do broja koji ste uneli je: " + zbir);

		System.out.println("Niste uneli pozitivan broj. Kraj programa");
		sc.close();
	}

}
/* Test 1: -1
 * Test 2: 0, -1
 * Test 3: 1, 0, -1*/
