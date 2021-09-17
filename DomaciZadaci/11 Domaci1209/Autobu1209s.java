package putovanjeAutobusom;

public class Autobus {
	//Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. 
	//Naziv i cena karte i zadaju se prilikom kreiranja. 
	//Moguce je dodati/ukloniti putnika kao i vozaca.
	private String nazivAutobusa;
	private int cenaKarte;
	private Vozac vozac;
	private Putnik putnik;
	public Autobus(String nazivAutobusa, Vozac v1, Putnik p1,int cenaKarte) {
		super();
		this.nazivAutobusa = nazivAutobusa;
		this.cenaKarte = cenaKarte;
		this.setVozac(v1);
		this.setPutnik(p1);
	}
	public Putnik getPutnik() {
		return putnik;
	}
	public void setPutnik(Putnik p1) {
		this.putnik = p1;
	}
	public Vozac getVozac() {
		return vozac;
	}
	public void setVozac(Vozac v1) {
		this.vozac = v1;
	}
	public String toString() {
		return "Naziv autobusa je " + nazivAutobusa + "\nVozac Autobusa je " + this.getVozac() +"\n"+ this.getPutnik() + " nakon kupovine karte koja kosta " + cenaKarte + "din.";
	}
}
