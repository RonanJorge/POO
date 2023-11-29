import java.util.ArrayList;
import java.util.List;

public class Aeronave {
	private String marca;
	String companhia;
	private Piloto piloto;
	List<Passageiro> passageiros = new ArrayList<>();
	
	public void voar() {
		System.out.println("Voando...");
	}
	
	@Override
	public String toString() {
		return companhia + " - Numero de passageiros: " + passageiros.size();
	}
}
