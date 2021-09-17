package zoo;

public class Ribe extends Zivotinje {

	private boolean vrstaVode;
	private int brojPeraja;
	private String vrstaPeraja;
	
	public Ribe(boolean vrsta, String naziv, String ishrana, String vrstaPeraja, int brojPeraja) {
		super(vrsta, naziv, ishrana);
		
		this.vrstaVode = vrstaVode;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}
	
	
	
	
	public boolean isVrstaVode() {
		return vrstaVode;
	}
	public void setVrstaVode(boolean vrstaVode) {
		this.vrstaVode = vrstaVode;
	}
	public int getBrojPeraja() {
		return brojPeraja;
	}
	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}
	public String getVrstaPeraja() {
		return vrstaPeraja;
	}
	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	public void stampanje() {
		super.stampanje();
		System.out.print("Zivi u ");
		if (this.vrstaVode) {
			System.out.println("slanojj vodi" );
					
		} else {
			System.out.print("slatkoj vodi" );
			
		}
		System.out.print(", vrsta peraja koju poseduje: " + this.vrstaPeraja + ", " + "poseduje peraja: " + this.brojPeraja + ", ");
	}
}
