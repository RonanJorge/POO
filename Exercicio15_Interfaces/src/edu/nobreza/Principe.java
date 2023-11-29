package edu.nobreza;

public class Principe extends Nobre implements Cavaleiro{

	@Override
	public void duelar() {
		System.out.println("Duelando...");
	}
	
	public void governar() {
		System.out.println("Príncipe governando...");
	}
	
}
