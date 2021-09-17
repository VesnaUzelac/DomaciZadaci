package domaci;

public class Glumci {

	/*
	 * 3. Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime,
	 * godina rodjenja, pol. Private atributi su: da li su ozenjeni ili udati
	 * (boolean), prosecna zarada po filmu, broj snimljenih filmova. Potrebno je
	 * izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim
	 * filmovima, koliko godina pune u 2022. godini, ako su muskog pola preko
	 * atributa treba pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola.
	 * Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih
	 * filmova (pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje
	 * ocenjenog do najgore ocenjenog filma od tih pet (preko getera i setera).
	 */

	public String imeGlumca;
	public String prezimeGlumca;
	public int godinaRodjenja;
	public String pol;
	public int starostU22;
	public String oslovljavanje;
	
	public Glumci(String imeGlumca, String prezimeGlumca, int godinaRodjenja, char pol, int starostU22,
			String oslovljavanje) {

		this.imeGlumca = imeGlumca;
		this.prezimeGlumca = prezimeGlumca;
		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;
		this.starostU22 = starostU22;
		this.oslovljavanje = oslovljavanje;

	}

	private Glumci(boolean bracniStatus, double prosecnaZarada, int brojFilmova) {
		

	}

	
	

	public Glumci() {
		// TODO Auto-generated constructor stub
	}

	public void stampanjePodataka() {
		System.out.println("Ime i prezime glumca:\t" + oslovljavanje+ " " + imeGlumca + prezimeGlumca
				+ "\ngodina rodjenja:\t\t" + godinaRodjenja + "\npol:\t\t\t\t\t" + pol);

	}


		
	}







		
	

