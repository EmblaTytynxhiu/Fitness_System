package src;


public class ProgramiFitnes extends Programi {

	public ProgramiFitnes(String ushtrimet) {
		super("Fitnes", ushtrimet);
	}
	
	@Override
	public void pershkruajProgramin() {
		System.out.println("Program per rritje muskulare: " + getUshtrimet());
	}
}
