package src;


public class ProgramHumbjePeshe extends Programi {

	public ProgramHumbjePeshe(String ushtrimet) {
		super("Humbje Peshe", ushtrimet);
	}
	
	@Override
	public void pershkruajProgramin() {
		System.out.println("Programi per kardio: " + getUshtrimet());
	}
}
