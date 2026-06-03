package src;


public class Anetar extends Personi {

	private int mosha;
	Programi programi;
	Abonimi abonimi;
	
	public Anetar(int id, String emri, int mosha) {
		super(id, emri);
		this.mosha = mosha;
	}
	
	
	
	@Override
	public void shfaqDetajet() {
		System.out.println("Detajet e Anetarit: ");
		System.out.println("ID: " + getId());
		System.out.println("Emri: " + getEmri());
		System.out.println("Mosha: " + mosha);
		
		if (programi != null) {
			System.out.println("Programi:" + programi.getEmri());
		}
		
		if (abonimi != null) {
			System.out.println("Abonimi: " + abonimi.getLloji());
		}
	}
}
