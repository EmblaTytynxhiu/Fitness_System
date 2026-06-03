package src;


public abstract class Personi implements IPrintueshem {

	private int id;
	private String emri;
	
	public Personi(int id, String emri) {
		this.id = id;
		this.emri = emri;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEmri() {
		return emri;
	}
	
	public abstract void shfaqDetajet();
}
