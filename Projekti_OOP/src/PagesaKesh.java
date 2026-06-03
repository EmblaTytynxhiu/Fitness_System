package src;


public class PagesaKesh extends Pagesa {

	public PagesaKesh(double shuma) {
		super(shuma);
	}
	
	@Override
	public void kryejPagesen() {
		System.out.println("Duke procesuar pagesen prej "+ getShuma() + " EUR ne KESH. Faleminderit!");
	}
}
