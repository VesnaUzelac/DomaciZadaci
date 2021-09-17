package putovanjeAutobusom;

public class Glavna {

	public static void main(String[] args) {
		Putnik p1 = new Putnik("Petar ", "Putnikovic", 1000);
		p1.dodavanjeNovca(0);
		System.out.println(p1);
	p1.oduzimanjeNovca(850);
		System.out.println(p1);
		
		
		Vozac v1 = new Vozac("Jova ", " Soferovic", null);
		System.out.println(v1);
		
		Autobus a1 = new Autobus("Autobus trans",  v1, p1,  850);
		System.out.println(a1);
		
	}

}
