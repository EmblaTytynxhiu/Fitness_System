package src;


public class Trajner extends Personi {

	public Trajner(int id, String emri) {
		super(id, emri);
	}
	
	@Override
	public void shfaqDetajet() {
		System.out.println("Trajneri: " + getId() + ", emri: " + getEmri());
	}
}
