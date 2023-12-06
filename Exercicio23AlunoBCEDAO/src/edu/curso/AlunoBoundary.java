package edu.curso;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.NumberStringConverter;

public class AlunoBoundary extends Application{
	private TableView<Aluno> table = new TableView<>(); 
	private TextField txtId = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	private Button btnSalvar = new Button ("Salvar");
	private Button btnPesquisar = new Button ("Pesquisar");
	
	private AlunoControl control = new AlunoControl();
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//	public void generateBindings() {
//		Bindings.bindBidirectional(txtId.textProperty(), control.idProperty(), new NumberStringConverter());
//		Bindings.bindBidirectional(txtRa.textProperty(), control.raProperty());
//		Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
//		Bindings.bindBidirectional(txtNascimento.textProperty(), control.nascimentoProperty(), new LocalDateStringConverter(dtf, dtf));
//	}
	
	public void generateBindings() { 
		Bindings.bindBidirectional(txtId.textProperty(), control.idProperty(),
				new NumberStringConverter());
		Bindings.bindBidirectional(txtRa.textProperty(), control.raProperty());
		Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
		LocalDateStringConverter localDtf = new LocalDateStringConverter(dtf, dtf);
		Bindings.bindBidirectional(txtNascimento.textProperty(), control.nascimentoProperty(),
						localDtf);
	}
	
	public void generateTable() { 
		table.setItems( control.getLista() );
			
		TableColumn<Aluno, Long> colId = new TableColumn<>("Id");
		colId.setCellValueFactory(new PropertyValueFactory<Aluno, Long>("id") );
			
		TableColumn<Aluno, String> colRa = new TableColumn<>("RA");
		colRa.setCellValueFactory(itemData ->	new ReadOnlyStringWrapper(itemData.getValue().getRa()));
		
		TableColumn<Aluno, String> colNome = new TableColumn<>("Nome");
		colNome.setCellValueFactory(itemData ->	new ReadOnlyStringWrapper(itemData.getValue().getNome()));
		
		TableColumn<Aluno, String> colNasc = new TableColumn<>("Nascimento");
		colNasc.setCellValueFactory(itemData ->	new ReadOnlyStringWrapper(dtf.format(itemData.getValue().getNascimento())));		
		
		table.getColumns().add(colId);
		table.getColumns().add(colRa);
		table.getColumns().add(colNome);
		table.getColumns().add(colNasc);
		
	}
	
	public void start(Stage stage) throws Exception {
		BorderPane principal = new BorderPane();
		Scene scn = new Scene (principal, 600, 400);
		GridPane grid = new GridPane();
		
		grid.add(new Label("Id: "), 0, 0);
		grid.add(txtId, 1, 0);
		grid.add(new Label("Ra: "), 0, 1);
		grid.add(txtRa, 1, 1);
		grid.add(new Label("Nome: "), 0, 2);
		grid.add(txtNome, 1, 2);
		grid.add(new Label("Data de Nascimento: "), 0, 3);
		grid.add(txtNascimento, 1, 3);
		
		grid.add(btnSalvar , 0, 4);
		grid.add(btnPesquisar , 1, 4);
		
		btnSalvar.setOnAction(e -> control.salvar());
		btnPesquisar.setOnAction(e -> control.ler());
		
		principal.setCenter(table);
		principal.setTop(grid);
		
		generateBindings();
		generateTable();
		
		stage.setTitle("Gestão de Alunos");
		stage.setScene(scn);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
