package com.projeto;

import java.util.ArrayList;
import java.util.List;

import com.projeto.aeronave.Aeronave;
import com.projeto.passageiro.Passageiro;

public class Voo {
	private long numero;
	private Piloto piloto = new Piloto();
	private Aeronave aeronave = new Aeronave();
	private List<Passageiro> passageiros = new ArrayList<>();
	private Aeroporto partida = new Aeroporto();
	private Aeroporto chegada = new Aeroporto();
	
	public long getNumero() {
		return numero;
	}
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}
	
	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}	
	
	

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}

	public Aeroporto getPartida() {
		return partida;
	}

	public void setPartida(Aeroporto partida) {
		this.partida = partida;
	}

	public Aeroporto getChegada() {
		return chegada;
	}

	public void setChegada(Aeroporto chegada) {
		this.chegada = chegada;
	}
	
	
}
