package src;


public abstract class Pagesa {

	private double shuma;
	
	public Pagesa(double shuma) {
		this.shuma = shuma;
	}
	
	public double getShuma() {
		return shuma;
	}
	
	public void setShuma(double shuma) {
		this.shuma = shuma;
	}
	
	public abstract void kryejPagesen();
}
