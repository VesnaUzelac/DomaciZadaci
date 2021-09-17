package zoo;

import java.util.ArrayList;

public class Staniste {

	private String nazivStanista;
	private ArrayList<Zivotinje> listaZivotinja = new ArrayList();

	public Staniste(String nazivStanista) {
		this.nazivStanista = nazivStanista;
	}

	public void nazivStanista(Zivotinje z1) {
		this.listaZivotinja.add(z1);
	}
	public ArrayList<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}

	public String getNazivStanista() {
		return this.nazivStanista;
	}
	
	
	public void stampanje() {
		System.out.println("Vrsta stanista je" + nazivStanista + ", zivotinje koje zive u stanistu su");
		for (int i = 0; i < listaZivotinja.size(); i++) {
		System.out.println(getListaZivotinja() + "; ");

		}
	}
}
