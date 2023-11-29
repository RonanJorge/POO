package edu.nobreza;

public class Nobre {
	private Conselheiro conselheiro;
	private Soldado[] soldados;
	
	public void governar(){
		System.out.println("Governando...");
	}

	public Conselheiro getConselheiro() {
		return conselheiro;
	}

	public void setConselheiro(Conselheiro conselheiro) {
		this.conselheiro = conselheiro;
	}

	public Soldado[] getSoldados() {
		return soldados;
	}

	public void setSoldados(Soldado[] soldados) {
		this.soldados = soldados;
	}
	
	
}
