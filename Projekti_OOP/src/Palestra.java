package src;

import java.util.ArrayList;

public class Palestra {

	private String emri;
	ArrayList <Anetar> anetaret;
	ArrayList <Trajner> trajneret;
	ArrayList <Programi> programet;
	
	public Palestra(String emri) {
		this.emri = emri;
		anetaret = new ArrayList<>();
		trajneret = new ArrayList<>();
		programet = new ArrayList<>();
	}
	
	public String getEmri() {
		return emri;
	}
	
	public void shtoAnetar(Anetar anetar) {
		anetaret.add(anetar);
	}
	
	public void shtoTrajner(Trajner trajner) {
		trajneret.add(trajner);
	}
	
	public void shtoProgram(Programi programi) {
		programet.add(programi);
	}
	
	public void shfaqAnetaret() {
		System.out.println("Lista e anetareve: ");
		for (Anetar anetar : anetaret) {
			anetar.shfaqDetajet();
		}
	}
}
