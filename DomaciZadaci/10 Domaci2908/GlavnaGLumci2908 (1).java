
package domaci;

public class GlavnaGLumci {

	public static void main(String[] args) {
	
		Glumci glumac1 = new Glumci();
		glumac1.oslovljavanje = "Mrs.";
		glumac1.imeGlumca = "Helen";
		glumac1.prezimeGlumca =  "Mirren";
		glumac1.godinaRodjenja = 1945;
		glumac1.pol = "Z";
		//glumac1.setbracniStatus();
		//glumac1.starostU22;
				
		
		Glumci glumac2 =  new Glumci();
		glumac2.oslovljavanje = "Mrs.";
		glumac2.imeGlumca ="Mery" ;
		glumac2. prezimeGlumca ="Streep";
		glumac2.godinaRodjenja = 1949;
		glumac2.pol = "Z";
		
		
		Glumci glumac3 = new Glumci();
		glumac3.oslovljavanje = "Mrs.";
		glumac3.imeGlumca ="Halle" ;
		glumac3.prezimeGlumca = "Berry";
		glumac3.godinaRodjenja = 1966;
		glumac3.pol = 'Z';
		glumac3.stampanjePodataka();
		
		Glumci glumac4 = new Glumci();
		glumac4.oslovljavanje = "Mr.";
		glumac4.imeGlumca ="Mel" ;
		glumac4. prezimeGlumca ="Gibson" ;
		glumac4.godinaRodjenja = 1956;
		glumac4.pol = 'M';
		glumac4.stampanjePodataka();
		
		Glumci glumac5 = new Glumci();
		glumac5.oslovljavanje = "Mr.";
		glumac5.imeGlumca = "Keanu";
		glumac5. prezimeGlumca = "Reeves";
		glumac5.godinaRodjenja = 1964;
		glumac5.pol = 'M';
		glumac5.stampanjePodataka();
	}

}
