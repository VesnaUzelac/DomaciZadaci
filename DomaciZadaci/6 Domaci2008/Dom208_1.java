package Primer02;

public class Dom208_1 {

	public static void main(String[] args) {

		// Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve
		// osim prvog i poslednjeg unosa.

		String[] gradovi = { "Beograd", "Valjevo", "Nis", "Cacak", "Kragujevac" };

		for (int i = 1; i < gradovi.length - 1; i++) {
			System.out.println("grad: " + gradovi[i]);
		}

	}

}
