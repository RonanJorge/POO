import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class CursoBoundary extends Application{
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtCodigo = new TextField();
	private TextField txtNomeCoordenador = new TextField();
	private TextField txtQtdeAlunos= new TextField();
	
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
		
	private CursoControl control = new CursoControl();
	
	@Override
	public void start(Stage stage) throws Exception {
		GridPane pane = new GridPane();
		Scene scn = new Scene(pane, 600, 400);
		
		Bindings.bindBidirectional(txtId.textProperty(), control.idProperty());	
		Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
		Bindings.bindBidirectional(txtCodigo.textProperty(), control.codigoProperty());
		Bindings.bindBidirectional(txtNomeCoordenador.textProperty(), control.nomeCoordenadorProperty());
		Bindings.bindBidirectional(txtQtdeAlunos.textProperty(), control.qtdeAlunosProperty(), 
									(StringConverter<Number>) new NumberStringConverter());		
		
		pane.add(new Label("Id"), 0, 0);
		pane.add(new Label("Nome"), 0, 1);
		pane.add(new Label("Código do Curso"), 0, 2);
		pane.add(new Label("Nome do Coordenador"), 0, 3);
		pane.add(new Label("Quantidade de Alunos"), 0, 4);
		
		pane.add(txtId, 1, 0);
		pane.add(txtNome, 1, 1);
		pane.add(txtCodigo, 1, 2);
		pane.add(txtNomeCoordenador, 1, 3);
		pane.add(txtQtdeAlunos, 1, 4);
		
		pane.add(btnAdicionar, 0, 5);
		pane.add(btnPesquisar, 1, 5);
		
		btnAdicionar.setOnAction(e -> control.adicionarCurso());
		btnPesquisar.setOnAction(e -> control.pesquisarCurso());
		
		stage.setScene(scn);
		stage.setTitle("Gestão de Cursos");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(CursoBoundary.class, args);

	}

	
}
