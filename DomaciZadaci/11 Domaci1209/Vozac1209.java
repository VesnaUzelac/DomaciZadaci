package putovanjeAutobusom;

public class Vozac extends Covek {
	//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	private String zvanje;

	public Vozac(String ime, String prezime, String zvanje) {
		super(ime, prezime);
		this.zvanje = "sofer";
	}
	@Override
	public String toString(){
		return super.toString() + ", po zanimanju " + this.zvanje ; 
	}
}
