package funkcije;

import java.util.Scanner;

public class Domaci_2583 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * DodatniFunkcije3 spojena prva dva zadatka sa malo izmenjenim zahtevima
		 * /*Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i
		 * poziva i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga
		 * vraca najveci od unetih brojeva.
		 */
		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite broj");
			a[i] = sc.nextInt();
		}

		int zbir = sabiranje(a);
		System.out.println("Zbir brojeva je: " + zbir);

		int maximum = maximum(a);
		System.out.println("Najveci broj je: " + maximum);
		sc.close();

	}

	private static int sabiranje(int[] a) {

		int sabiranje = 0;
		for (int i = 0; i < a.length; i++) {
			sabiranje += a[i];

		}
		return sabiranje;
	}

	private static int maximum(int[] a) {

		int maximum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (maximum < a[i]) {
				maximum = a[i];
			}

		}

		return maximum;

	}

}
