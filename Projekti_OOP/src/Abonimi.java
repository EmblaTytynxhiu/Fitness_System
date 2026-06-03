package src;

public abstract class Abonimi {

	private String lloji;
	private double cmimi;
	
	public Abonimi(String lloji, double cmimi) {
		this.lloji = lloji;
		this.cmimi = cmimi;
	}
	
	public String getLloji() {
		return lloji;
	}
	
	public void setLloji(String lloji) {
		this.lloji = lloji;
	}
	
	public double getCmimi() {
		return cmimi;
	}
	
	public void setCmimi(double cmimi) {
		this.cmimi = cmimi;
	}
	
	public abstract void shfaqKoston();
}
