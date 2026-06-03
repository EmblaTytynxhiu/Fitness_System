package src;


public class PagesaMeKarte extends Pagesa {

	public PagesaMeKarte(double shuma) {
		super(shuma);
	}
	
	@Override
	public void kryejPagesen() {
		System.out.println("Duke procesuar pagesen prej "+ getShuma()+ " EUR me KARTE BANKARE. Transaksioni u krye me sukses.");
	}
}
