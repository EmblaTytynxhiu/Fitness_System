package src;


public abstract class Programi {

	private String emri;
	private String ushtrimet;
	
	public Programi(String emri, String ushtrimet) {
		this.emri = emri;
		this.ushtrimet = ushtrimet;
	}
	
	public String getEmri() {
		return emri;
	}
	
	public void setEmri(String emri) {
		this.emri = emri;
	}
	
	public String getUshtrimet() {
		return ushtrimet;
	}
	
	public void setUshtrimet(String ushtrimet) {
		this.ushtrimet = ushtrimet;
	}
	
	public abstract void pershkruajProgramin();
}
