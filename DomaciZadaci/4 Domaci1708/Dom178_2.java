package primer01;

import java.util.Scanner;

public class Dom178_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku
		 * noc!” onoliko puta koliko je korisnik zadao preko konzole. Primer: ako
		 * korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta 
		 */

		System.out.println("Unesite broj");

		Scanner sc6 = new Scanner(System.in);
		int broj = 1;
		broj = sc6.nextInt();
		int i = 0;

		while (i < broj) {
			System.out.println("Laku noc!");
			i++;
sc6.close();
		}

	}

}
