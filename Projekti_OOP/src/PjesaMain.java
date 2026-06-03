package src;


public class PjesaMain {

	public static void main(String[] args) {
		Palestra palestra = new Palestra("Fit Gym");
		
		Trajner trajner1 = new Trajner(1, "Ardi");
		Trajner trajner2 = new Trajner(2, "Arbeni");
		Trajner trajner3 = new Trajner(3, "Hashimi");
		
		palestra.shtoTrajner(trajner1);
		palestra.shtoTrajner(trajner2);
		palestra.shtoTrajner(trajner3);
		
		Programi programi1 = new ProgramHumbjePeshe("Vrapim, Squat, Pushups");
		Programi programi2 = new ProgramiFitnes("LatPulldown, SpiderCurls, Bench Press");
		Programi programi3 = new ProgramHumbjePeshe("Vrapim, Squat, Pushups");
		
		palestra.shtoProgram(programi1);
		palestra.shtoProgram(programi2);
		palestra.shtoProgram(programi3);
		
		Abonimi abonimi1 = new AbonimiMujor(20);
		Abonimi abonimi2 = new AbonimiVjetor(200);
		
		Anetar anetar1 = new Anetar(1, "Besi", 22);
		anetar1.programi = programi1;
		palestra.shtoAnetar(anetar1);
		Anetar anetar2 = new Anetar(2, "Blerim", 32);
		anetar2.programi = programi2;
		palestra.shtoAnetar(anetar2);
		palestra.shfaqAnetaret();
		
		Pagesa pagesa1 = new PagesaKesh(20.0);
		Pagesa pagesa2 = new PagesaMeKarte(200.0);
		
		System.out.println();
		
		System.out.println("Polimorfizmi personi: ");
		Personi[] personat = {trajner1, trajner2, trajner3, anetar1, anetar2};
		for (Personi personi : personat) {
			personi.shfaqDetajet();
		}
		
		System.out.println();
		
		System.out.println("Polimorfizmi programi: ");
		Programi[] programet = {programi1, programi2};
		for (Programi prog : programet) {
			prog.pershkruajProgramin();
		}
		
		System.out.println();
		
		System.out.println("Polimorfizmi abonimi: ");
		Abonimi[] abonimet = {abonimi1, abonimi2};
		for (Abonimi ab : abonimet) {
			ab.shfaqKoston();
		}
		
		System.out.println();
		
		System.out.println("Polimorfizmi pagesa: ");
		Pagesa[] pagesat = {pagesa1, pagesa2};
		for (Pagesa pagesa : pagesat) {
			pagesa.kryejPagesen();
		}
	}
}
