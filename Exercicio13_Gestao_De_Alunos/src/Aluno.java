import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {
	private long id;
	private LocalDate nasc;
	private String ra;
	private String nome;
	
	@Override
	public String toString() {
		return this.ra + " - " + this.nome;
	}
	
	//getters e setters
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getNasc() {
		return this.nasc;
	}

	public void setNasc(LocalDate nasc) {
		this.nasc = nasc;
	}
	
	public void setNasc(String sData, DateTimeFormatter dtf) {
		LocalDate data = LocalDate.parse(sData, dtf);
		setNasc(data);
	}

	public String getRa() {
		return this.ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

