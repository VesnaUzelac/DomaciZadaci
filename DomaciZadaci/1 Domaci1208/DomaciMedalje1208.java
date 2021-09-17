package primer01;

import java.util.Scanner;

public class DomaciMedalje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Napisati program gde deklarisete vase ime, prezime kao string, pol kao char
 *  i odstampajte adekvatno sva tri unosa. Nakon toga preko skenera treba da
 *  unesete ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama 
 *  i ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama,
 *   na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja. 
 *   SAMO SE TRAZIO PROCENAT MEDALJA. POGLEDAJ I IZRACUNAVANJE % PREKO INT I DOUBLE!*/
	
		String ime = "Vesna";
		String prezime = "Uzelac";
		System.out.println("Ime i prezime: " + ime + " " + prezime);
		
		char pol = 'Z';
		System.out.println("Pol: " + pol);
		
	
		Scanner vesna3 = new Scanner(System.in);
		System.out.println("Unesite ukupan broj medalja koje je osvojila Srbija na olimpijskim igrama:");
		double ubm = vesna3.nextDouble();
		//int ubm = vesna3.nextInt();
		
		
		//System.out.println("Srbija je osvojila ukupno medalja na olimpijskim igrama: " + ubm + ".");
		
		System.out.println("Unesite broj osvojenih zlatnih medalja koje je osvojila Srbija na olimpijskim igrama:");
		double zm = vesna3.nextDouble();
		//int zm = vesna3.nextInt();
		
		//System.out.println("Srbija je osvojila zlatnih medalja na olimpijskim igrama: " + zm + ".");
		
		double r = zm / ubm * 100;
		//double r = (double) zm / ubm * 100;	
		
		System.out.println("Procenat zlatnih u odnosu na ukupan broj medalja je: " + r + "%.");
		
		vesna3.close();
		
	}

}
