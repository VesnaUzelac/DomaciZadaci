package primer01;
import java.util.Scanner;
public class DomaciRazredi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ZADATAK 1
		Sa switch petljom, proveri unetu godinu zivota i to
		ako je 7god   -> ispisi da je prvi razred
		ako je 8god   -> ispisi da je drugi razred*/
		
		Scanner raz = new Scanner(System.in);
		System.out.println("Unesite broj godina: ");
		
		int god = raz.nextInt();
		
		switch (god) {
		case 7:
		System.out.println("Prvi je razred");
		break;
		case 8:
		System.out.println("Drugi je razred");
		break;
		default:
		System.out.println("Ne moze se odrediti");
		}
		raz.close();
	}
			
	
}
