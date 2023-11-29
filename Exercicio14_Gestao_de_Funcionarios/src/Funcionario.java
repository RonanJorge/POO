import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
	private long id;
	private String nome;
	private String matricula;
	private LocalDate admissao;
	private LocalDate demissao;
	private float salario;
	private String horario;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDate getAdmissao() {
		return admissao;
	}
	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}
	
	public void setAdmissao(String sData, DateTimeFormatter dtf){
		LocalDate data = LocalDate.parse(sData, dtf);
		setAdmissao(data);
	}
	public LocalDate getDemissao() {
		return demissao;
	}
	public void setDemissao(LocalDate demissao) {
		this.demissao = demissao;
	}
	
	public void setDemissao(String sData, DateTimeFormatter dtf) {
		LocalDate data = LocalDate.parse(sData, dtf);
		setDemissao(data);
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	@Override
	public String toString() {
		return this.matricula + " - " + this.nome;
	}
}
