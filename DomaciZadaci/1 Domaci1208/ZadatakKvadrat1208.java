package primer01;

import java.util. Scanner;

public class ZadatakKvadrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner vesna = new Scanner (System.in);

	System.out.println("Unesite duzinu stranice a");
	double a = vesna.nextDouble();
	double p = a * a;
	double o = 4 * a;
	System.out.println("Povrsina kvadrata je " + p + "cm2");
	System.out.println("Obim kvadrata je " + o + "cm");

	
	vesna.close();
	}

}
