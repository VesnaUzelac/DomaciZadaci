package zoo;

public class Zivotinje {

	private boolean vrsta;
	private String naziv;
	private String ishrana;

	public Zivotinje(boolean vrsta, String naziv, String ishrana) {
		super();
		this.getVrsta(vrsta);
		this.getNaziv(naziv);
		this.getIshrana(ishrana);
	}

	
	public boolean Vrsta() {
		return vrsta;
		
	}

	public void getVrsta(boolean vrsta) {
		this.vrsta = vrsta;
	}

	public String getNaziv() {
		return naziv;
	}

	public void getNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getIshrana() {
		return ishrana;
	}

	public void getIshrana(String ishrana) {
		this.ishrana = ishrana;
	}

	public void stampanje() {
		System.out.print("Prema gradji je ");
		if (this.vrsta) {
		System.out.print("kicmenjak");
		}else {
			System.out.print("beskicmenjak");
		}
		
		System.out.print( ", naziv zivotinje je " + this.naziv + ", prema nacinu ishrane je "
				+ this.ishrana+"."+"\n");
	}

}
