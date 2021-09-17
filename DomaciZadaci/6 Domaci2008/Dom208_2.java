package Primer02;

public class Dom208_2 {

	public static void main(String[] args) {
		/*-Napisati program gde u nizu napisete ovih 5 gradova 
		 * (Lisabon, London, Helsinki, Prag i Madrid) a program
			stampa gradove sve dok ne dodje do "Prag"-a*/

		String[] gradovi = { "Lisabon", "London", "Helsinki", "Prag", "Madrid" };

		for (int i = 0; i < gradovi.length - 2; i++) {
			System.out.println("grad: " + gradovi[i]);
		}

	}

}
