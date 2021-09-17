package primer01;
import java.util.Scanner;
public class DomaciKrug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  Uneti poluprecnik kruga
  Ako je manji ili jednak od 0 -> vratiti poruku da poluprecnik nije validan
  Ako je poluprecnik manji ili jednak od 5 izracunati P
  Ako je poluprecnik veci od 5 izracunati 0
  Ako je poluprecnik veci od 10 izracunati P i O
    napomena: pi=3.14    P = r*r*pi    O=2*r*pi
    * prikazati sa ugnjezdenim if-ovima*/
		
		System.out.println("Uneti poluprecnik kruga");
		
		Scanner krug = new Scanner (System.in);
		int r = krug.nextInt();
		double pi = 3.14;
		double p = r*r* pi;
		double o = 2 * r * pi;
		
		if (r <= 0 ) {
			System.out.println("Poluprecnik nije validan"); 
		}	
		
		else if (r <= 5) {
		
			System.out.println("Povrsina kruga je: " + p + "cm2");
		}
		/*else if (r > 10) {
			System.out.println("Povrsina kruga je: " + p );
			System.out.println("Obim kruga je: " + o);
			
		} 
		/*moglo je i iznad da se prebaci*/
		
		else if (r > 5 && r <= 10) { 
			System.out.println("Rezultat je: " + 0);	
			/*nejasno je sta znaci izracunati 0 u zadatku. Pretpostavljam da je u pitanju obim O).
			 * System.out.println("Obim kruga je: " + o);	
			 */
		}
		
		else if (r > 10) {
			System.out.println("Povrsina kruga je: " + p + "cm2" );
			System.out.println("Obim kruga je: " + o + "cm");
			
		}
		
		krug.close();
	}
				
}

