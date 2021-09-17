package primer01;

import java.util.Scanner;

public class Dom178_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen
		 * negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako
		 * korisnik unese 1 2 5 3 -1, program treba da ispise 11
		 */

		System.out.println("Unesite broj: ");
		Scanner sc4 = new Scanner(System.in);

		int a = sc4.nextInt();
		int zbir = 0;

		while (a >= 0) {
			zbir = zbir + a;

			System.out.println("Unesite broj: ");
			a = sc4.nextInt();

		}
		System.out.println("Zbir: " + zbir);
		sc4.close();
	}

}
