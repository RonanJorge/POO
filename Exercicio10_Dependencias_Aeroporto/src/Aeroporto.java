import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
	String nome;
	private String codigo;
	private String endereco;
	List<Aeronave> aeronaves = new ArrayList<>();
	
	public void abrir() {
		System.out.println("Aeroporto aberto...");
	}
}
