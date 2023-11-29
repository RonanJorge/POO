package edu.nobreza;

public class Rainha extends Nobre implements Diplomata{
	
	@Override
	public void fazerDiplomacia() {
		System.out.println("Fazendo diplomacia...");
	}
	
	public void governar() {
		System.out.println("Rainha governando...");
	}
}
