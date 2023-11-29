package edu.nobreza;

public class Main {

	public static void main(String[] args) {
		Nobre nobre = new Nobre();
		nobre.governar();
		
		Nobre a = new Principe();
		a.governar();
		
		Principe b = new Principe();
		b.duelar();
		b.governar();
		
		Nobre c = new Rainha();
		c.governar();
		
		Rainha d = new Rainha();
		d.governar();
		d.fazerDiplomacia();
		
		Nobre e = new Conde();
		e.governar();
		
		Bispo bispo = new Bispo();
		Conselheiro conselheiro = new Conselheiro();
		
		nobre.setConselheiro(conselheiro);
		conselheiro.setBispo(bispo);
		
		bispo.rezar();
	}

}







