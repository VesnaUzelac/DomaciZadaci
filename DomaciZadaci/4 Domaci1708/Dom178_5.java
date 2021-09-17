package primer01;

import java.util.Scanner;

public class Dom178_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji oponasa kviz za pogadjanje glavnog grada. - Program
		 * treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa.
		 * 1. Francuska 2. Italija 3. Srbija 4. Izlaz - Nakon odabira drzave, potrebno
		 * je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' - Ako korisnik
		 * odgovori tacno, ispisuje se poruka 'Odgovor je tacan' - Ako korisnik odgovori
		 * netacno, ispisuje se poruka 'Odgovor nije tacan' - Nakon davanja odgovora
		 * (bilo da je tacan ili netacan), ponovo treba da se postave sve pocetne opcije
		 * i ponudi korisniku da odabere neku od njih. - Program se zavrsava kad korisni
		 * odabere 4. opciju 'Izlaz' - Program uraditi koriscenjem dosad naucenog +
		 * do-while petlje
		 */

		System.out.println(
				"Doborodsli!\nPred vama je kviz u kome pogadjate glavne gradove drzava. \nMozete ucestvovati odabirom drzave, tako sto cete uneti njihov redni broj, a mozete i odustati od kviza.\n \t 1. Francuska\n \t 2. Italija \n\t 3. Srbija\n \t 4. Izlaz za napustanje kviza");

		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Odaberite drzavu unosom broja od 1 do 3 ili unesite 4 za izlazak iz kviza");

			a = sc.nextInt();

			if (a == 1) {
				System.out.println("Drzava koju ste odabrali je Francuska. ");

				System.out.println(
						"Koji je glavni grad Francuske?\nUnesite broj tacnog odogovora: 1 Pariz, 2 Rim, 3 London.");
				b = sc.nextInt();
				if (b == 1) {
					System.out.println("Odgovor je tacan.");
				} else {
					System.out.println("Odgovor je netacan.");
				}
			}

			else if (a == 2) {
				System.out.println("Drzava koju ste odabrali je Italija.");

				System.out.println(
						"Koji je glavni grad Italije?\nUnesite broj tacnog odogovora: 1 Moskva , 2 Tokio, 3 Rim.");
				c = sc.nextInt();
				if (c == 3) {
					System.out.println("Odgovor je tacan.");
				} else {
					System.out.println("Odgovor je netacan.");
				}

			}

			else if (a == 3) {
				System.out.println("Drzava koju ste odabrali je Srbija.");
				System.out.println(
						"Koji je glavni grad Srbije?\nUnesite broj tacnog odogovora: 1 Moskva , 2 Beograd, 3 Pariz.");
				d = sc.nextInt();
				if (d == 2) {
					System.out.println("Odgovor je tacan.");
				}

				else {
					System.out.println("Odgovor je netacan.");
				}
			} else if (a > 4) {

				System.out.println(
						"Niste uneli broj nijedne od ponudjenih drzava.");
			}

			else if (a == 4) {

				System.out.println("Odlucili ste da napustite kviz. Dovidjenja.");
			}
		
		}
		while (a != 4);
		sc.close();
	}

}
