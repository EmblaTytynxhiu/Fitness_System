package src;


public class Termini {

	Anetar anetari;
	Trajner trajneri;
	String data;
	
	public Termini(Anetar anetari, 	Trajner trajneri, String data) {
		this.anetari = anetari;
		this.trajneri = trajneri;
		this.data = data;
	}
	
	public void shfaqTerminin() {
		System.out.println(anetari.getEmri() + " ka termin me trajnerin " + trajneri.getEmri() + " me daten " + data);
	}
}
