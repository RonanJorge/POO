import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Formulario extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		GridPane painelP = new GridPane();
		Scene cena = new Scene(painelP);
		stage.setScene(cena);
		stage.setTitle("Agenda de Contatos");
		stage.show();
				
		painelP.setVgap(10);
		painelP.setHgap(10);
		
		GridPane painel = new GridPane();
		painel.setVgap(10);
		painel.setHgap(70);
		
		Label lblId = new Label("Id:");
		painel.add(lblId, 0, 0);		
		TextField txtId = new TextField();
		txtId.setMinSize(400, 0);
		
		painel.add(txtId, 1, 0);
		
		Label lblNome = new Label("Nome:");
		painel.add(lblNome, 0, 1);	
		TextField txtNome = new TextField();
		painel.add(txtNome, 1, 1);
		
		Label lblTel = new Label("Telefone:");	
		painel.add(lblTel, 0, 2);	
		TextField txtTel = new TextField("");
		painel.add(txtTel, 1, 2);
		
		Button btnSalvar = new Button("Salvar");
		Button btnPesquisar = new Button("Pesquisar");
		
		FlowPane botoes = new FlowPane(btnSalvar, btnPesquisar);
		
		painelP.add(painel, 1, 1);
		painelP.add(botoes, 1, 2);
		
	}

	public static void main(String [] args) {
		Application.launch(args);
	}
	
}
