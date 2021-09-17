package domaci_278;

public class Auto {

	public String ime;
	private int predjeniKm;
	public int cenaGoriva;
	public int potrosnjaGoriva;
	public int troskoviGoriva;
	public int kubikaza;

	public Auto() {

	}

	public void stampanje() {
		System.out.println("Auto: " + ime + "\nPredjena kilometraza: " + getPredjeniKm() + "km" + "\nKubikaza: "
				+ kubikaza + "cm^3 \nPotrosnja na 100km: " + potrosnjaGoriva + "l goriva \nUkupni troskovi za gorivo: "
				+ troskoviGoriva + "din");
	}

	public void setPredjeniKm(int km) {
		this.predjeniKm = km;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;
	}

	public void cenaGoriva(int i) {
		this.cenaGoriva = 120;

	}

	public int troskoviGoriva() {
		this.troskoviGoriva = potrosnjaGoriva * predjeniKm / 100 * cenaGoriva;
		return troskoviGoriva;
	}

	public void kubikaza(int cm3) {
		this.kubikaza = cm3;
		if (kubikaza > 1000) {
			potrosnjaGoriva = 10;
		} else {
			potrosnjaGoriva = 8;
		}

	}

	public void potrosnjaGoriva() {

	}

}
