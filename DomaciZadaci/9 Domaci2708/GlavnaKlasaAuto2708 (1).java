package domaci_278;

public class GlavnaKlasaAuto {

	public static void main(String[] args) {

		Auto a1 = new Auto();
		a1.ime = "BMW";
		a1.setPredjeniKm(9000);
		a1.cenaGoriva(120);
		a1.kubikaza(800);
		a1.troskoviGoriva();
		a1.potrosnjaGoriva();
		a1.stampanje();
	}

}
