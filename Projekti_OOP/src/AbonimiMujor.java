package src;


public class AbonimiMujor extends Abonimi {

	public AbonimiMujor(double cmimi) {
		super("Mujor", cmimi);
	}
	
	@Override
	public void shfaqKoston() {
		System.out.println("Abonimi mujor: Pagohet" + getCmimi() + " EUR cdo muaj.");
	}
}
