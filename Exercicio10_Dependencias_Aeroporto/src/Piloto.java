import java.time.LocalDate;

public class Piloto extends Pessoa{
	private String matricula;
	private Double salario;
	private LocalDate dataAdmissao;
	
	
	public void pilotar() {
		System.out.println("Pilotando...");
	}
}
