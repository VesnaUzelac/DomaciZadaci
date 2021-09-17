package primer01;
import java.util.Scanner;
public class Domaci1308_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Zadatak 1
		 * -Napisati program gde preko skenera unesete broj, 
		 * ako je broj manji od 10 onda ga pomnoziti sa 100, 
		 * ako je broj veci od 100 onda ga podeliti sa 10. 
		 * Na kraju zakomentarisite koje brojeve ste koristili za proveru programa
		 *  * ZADATAK OCENJEN KAO NETACAN, JER SAM PREDALA BEZ ISPISA (A NIJE TRAZEN) I NISAM URADILA OPCIJU IZMEDJU 10 I 100 (NIJE TRAZENO). 
		 *  OCEKIVALO SE DA PITAM?!*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj");
		
		double broj = sc.nextDouble();
		double r = 10;
		
		if (broj < 10) {
			r = broj * 100;
			System.out.println("Uneti broj je manji od 10 i pomnožen sa 100 daje rezultat: " + r); 
				
		}
		
		/*else if (broj >= 10 && broj <= 100) {
			r = broj;
			System.out.println("Dobijeni broj " + r + " nije predmet obracuna");
		}*/
				
		
		else if (broj > 100) {
			r = broj / 10;
			System.out.println("Uneti broj je veci od 100 i podeljen sa 10 daje rezultat: " + r);
		}
		
		// Korisceni brojevi za proveru su: -1, 0, 9, 10, 11, 100, 101.//
		
		sc.close();
	}

}
