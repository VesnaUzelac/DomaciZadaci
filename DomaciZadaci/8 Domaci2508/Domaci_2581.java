package funkcije;

import java.util.Scanner;

public class Domaci_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja)
		// i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena
		// broja.

		Scanner sc = new Scanner(System.in);

		int[] unos = new int[3];

		int najmanji;

		for (int i = 0; i < unos.length; i++) {
			System.out.println("Unesite broj");
			unos[i] = sc.nextInt();
		}
		najmanji = najmanji(unos);
		System.out.println("Najmanji broje od unetih je: " + najmanji);
		sc.close();
	}

	private static int najmanji(int[] unos) {
		int najmanji = unos[0];
		for (int i = 0; i < unos.length; i++) {
			if (najmanji > unos[i]) {
				najmanji = unos[i];
			}

		}

		return najmanji;

	}

}
