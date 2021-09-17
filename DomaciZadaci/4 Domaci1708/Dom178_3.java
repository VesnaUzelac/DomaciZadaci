package primer01;

import java.util.Scanner;

public class Dom178_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //Naci sumu parnih i sumu neparnih brojeva izmedju dva proizvoljno uneta broja
		 

		Scanner sc7 = new Scanner(System.in);

		System.out.println("Unesite prvi broj");
		int a = sc7.nextInt();

		System.out.println("Unesite drugi broj");
		int b = sc7.nextInt();

		int i = 0;
		int zbirparni = 0;
		int zbirneparni = 0;

		if (a < b) {
			i = a;
		} else if (a > b) {
			i = b;
		}

		while (i <= b) {
			if (i % 2 == 0) {
				zbirparni = zbirparni + i;
			} else {
				zbirneparni = zbirneparni + i;
			}

			i++;

		}
		while (i <= a) {
			if (i % 2 == 0) {
				zbirparni = zbirparni + i;
			} else {
				zbirneparni = zbirneparni + i;
			}

			i++;

		}
		System.out.println("Zbir svih parnih bojeva je: " + zbirparni);
		System.out.println("Zbir svih neparnih bojeva je: " + zbirneparni);
	sc7.close();
	}
	

}
