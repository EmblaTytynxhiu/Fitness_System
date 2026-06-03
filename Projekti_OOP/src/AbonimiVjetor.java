package src;


public class AbonimiVjetor extends Abonimi {

	public AbonimiVjetor(double cmimi) {
		super("Vjetor", cmimi);
	}
	
	@Override
	public void shfaqKoston() {
		System.out.println("Abonimi vjetor: Pagohet " + getCmimi() + " EUR ne vit.");
	}
}
