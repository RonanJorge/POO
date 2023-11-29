import java.util.ArrayList;
import java.util.List;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CursoControl {
	private List<Curso> lista = new ArrayList<>();
	
	private StringProperty id = new SimpleStringProperty("");
	private StringProperty nome = new SimpleStringProperty("");
	private StringProperty codigo = new SimpleStringProperty("");
	private StringProperty nomeCoordenador = new SimpleStringProperty("");
	private IntegerProperty qtdeAlunos = new SimpleIntegerProperty(0);
	
	public void adicionarCurso() {
		Curso c = new Curso();
		c.setId(id.get());
		c.setNome(nome.get());
		c.setCodigo(codigo.get());
		c.setNomeCoordenador(nomeCoordenador.get());
		c.setQtdeAlunos(qtdeAlunos.get());
		lista.add(c);
		System.out.println("Cadastro efetuado com sucesso!");
	}

	public void pesquisarCurso() {
		for(Curso c: lista) {
			if(c.getNome().contains(nome.get())) {
				id.set(c.getId());
				nome.set(c.getNome());
				codigo.set(c.getCodigo());
				nomeCoordenador.set(c.getNomeCoordenador());
				qtdeAlunos.set(c.getQtdeAlunos());
				System.out.println("Pesquisa efetuada com sucesso!");
				break;
			}
		}
	}

	public StringProperty idProperty() {
		return id;
	}
	
	public StringProperty nomeProperty() {
		return nome;
	}
	
	public StringProperty codigoProperty() {
		return codigo;
	}
	
	public StringProperty nomeCoordenadorProperty() {
		return nomeCoordenador;
	}
	
	public IntegerProperty qtdeAlunosProperty() {
		return qtdeAlunos;
	}

}
