package Primer02;

import java.util.Scanner;

public class Dom198_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*-Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
		(Koristiti for petlju)
		Na primer N: 5
		*
		**
		***
		****
		***** */

		System.out.println("Unesite broj redova u koma zelite da se ispise *.");
		Scanner sc = new Scanner(System.in);
		String z = "*";
		int n = 0;
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println(z);
			z = z + "*";

		}
		System.out.println();
		sc.close();
	}

}
