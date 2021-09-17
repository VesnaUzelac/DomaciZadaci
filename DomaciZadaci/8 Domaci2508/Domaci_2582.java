package funkcije;

import java.util.Scanner;

public class Domaci_2582 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog
		 * ulaza i taj program treba da pozove i vrati (u mainu) proizvod unetih
		 * brojeva.
		 */

		Scanner sc = new Scanner(System.in);

		int[] unos = new int[3];

		for (int i = 0; i < unos.length; i++) {
			System.out.println("Unesite broj");
			unos[i] = sc.nextInt();
		}
		int proizvod = proizvod(unos);
		System.out.println("Proizvod unetih brojeva je: " + proizvod);
		sc.close();

	}

	private static int proizvod(int[] unos) {
		int proizvod = unos[0];
		for (int i = 1; i < unos.length; i++)
			proizvod *= unos[i];

		{
			return proizvod;

		}

	}

}
