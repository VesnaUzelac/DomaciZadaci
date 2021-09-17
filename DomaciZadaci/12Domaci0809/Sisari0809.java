package zoo;

public class Sisari extends Zivotinje {
	private String bojaDlake;
	private String vrstaHrane;
	private String podelaCovek;

	public Sisari(boolean vrsta, String naziv, String ishrana, String bojaDlake, String vrstaHrane,
			String podelaCovek) {
		super(vrsta, naziv, ishrana);
		this.bojaDlake = bojaDlake;
		this.vrstaHrane = vrstaHrane;
		this.podelaCovek = podelaCovek;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getVrstaHrane() {
		return vrstaHrane;
	}

	public void setVrstaHrane(String vrstaHrane) {
		this.vrstaHrane = vrstaHrane;
	}

	public String getPodelaCovek() {
		return podelaCovek;
	}

	public void setPodelaCovek(String podelaCovek) {
		this.podelaCovek = podelaCovek;
	}

	public void stampanje() {
		super.stampanje();
		System.out.println( "Boja dlake joj je " + this.bojaDlake + "glavna hrana joj je " + this.vrstaHrane + "prema coveku je "
				+ this.podelaCovek);
	}
	
}
