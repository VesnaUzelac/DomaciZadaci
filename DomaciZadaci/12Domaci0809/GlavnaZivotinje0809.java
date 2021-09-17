package zoo;

public class GlavnaZivotinje {

	public static void main(String[] args) {
		Zivotinje z1 = new Zivotinje(true, "polarni medved", "mesojed" + ", bela " + ", ribe i foke" + ", divlja");
		z1.stampanje();
		System.out.println("");
		Ribe z2 = new Ribe(true, "saran", "mesojed", " grudna, bocna, repna i ledjna", 6 );
		z2.stampanje();

		Staniste s1 = new Staniste(" voda");
		s1.nazivStanista(z2);
		s1.stampanje();
	}

}
