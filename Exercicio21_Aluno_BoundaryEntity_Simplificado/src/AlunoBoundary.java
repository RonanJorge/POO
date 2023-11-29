import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AlunoBoundary extends Application{
	private TextField txtId = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNasc = new TextField();
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private ArrayList<Aluno> lista = new ArrayList<>();
	
	@Override
	public void start(Stage stage) throws Exception {
		GridPane pane = new GridPane();
		Scene scn = new Scene(pane, 600, 400);
		
		pane.add(new Label("Id:"), 0, 0);
		
		pane.add(txtId, 1, 0);
		pane.add(new Label("Ra:"), 0, 1);
		
		pane.add(txtRa, 1, 1);
		pane.add(new Label("Nome:"), 0, 2);
		
		pane.add(txtNome, 1, 2);
		pane.add(new Label("Nascimento:"), 0, 3);
		
		pane.add(txtNasc, 1, 3);
		
		Button btnAdicionar = new Button("Adicionar");
		pane.add(btnAdicionar, 0, 4);
		Button btnPesquisar = new Button("Pesquisar");
		pane.add(btnPesquisar, 1, 4);
		
		btnAdicionar.setOnAction(e -> adicionar());
		btnPesquisar.setOnAction(e -> pesquisar());
		
		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");
		stage.show();
		
	}

	public void adicionar() {
		Aluno a = new Aluno();
		a.setId(txtId.getText());
		a.setRa(txtRa.getText());
		a.setNome(txtNome.getText());
		LocalDate dt = LocalDate.parse(txtNasc.getText(), dtf);
		a.setNascimento(dt);	
		lista.add(a);
		System.out.println("Adicionado com sucesso!");
	}
	
	public void pesquisar() {
		for(Aluno a: lista) {
			if(a.getNome().contains(txtNome.getText())) {
				txtId.setText(a.getId());
				txtRa.setText(a.getRa());
				txtNome.setText(a.getNome());
				txtNasc.setText(a.getNascimento().format(dtf));
				System.out.println("Pesquisa realizada com sucesso!");
				break;
				
			}
		}
	}
		
	public static void main(String[] args) {
		Application.launch(AlunoBoundary.class,args);

	}
	
	
}
