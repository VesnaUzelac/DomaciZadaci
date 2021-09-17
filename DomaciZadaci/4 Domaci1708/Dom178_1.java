package primer01;

import java.util.Scanner;

public class Dom178_1 {

	public static void main(String[] args) {
		// TODO
		/*
		 * TREBALO JE OTKRITI STA NEDOSTAJE U KODU. FALILI SU: import java.util.Scanner;
		 * System.out.println("Unesite broj: "); zagrada } koja zatvara if i sc.close
		 */

		System.out.println("Unesite broj: ");

		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();

		if (r > 0) {

			System.out.println(r * r * 3.14);
		} else {
			System.out.println("Greska u unosu!");

		}
		sc.close();
	}

}
