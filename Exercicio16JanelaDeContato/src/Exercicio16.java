import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Exercicio16 extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		Pane painel = new Pane();
		Scene cena = new Scene(painel, 620, 480);
		
		Label labelId = new Label("Id:");
		labelId.relocate(0, 10);
		Label labelNome = new Label("Nome:");
		labelNome.relocate(0, 40);
		Label labelTel = new Label("Telefone:");
		labelTel.relocate(0, 70);
		
		TextField textoId = new TextField();
		textoId.relocate(80, 5);
		TextField textoNome = new TextField();
		textoNome.relocate(80, 35);
		TextField textoTel = new TextField();
		textoTel.relocate(80, 65);
		
		Button botaoSalvar = new Button("Salvar");
		botaoSalvar.relocate(0, 100);
		Button botaoPesquisar = new Button("Pesquisar");
		botaoPesquisar.relocate(50, 100);
		
		painel.getChildren().add(labelId);
		painel.getChildren().add(labelNome);
		painel.getChildren().add(labelTel);
		painel.getChildren().add(textoId);
		painel.getChildren().add(textoNome);
		painel.getChildren().add(textoTel);
		painel.getChildren().add(botaoSalvar);
		painel.getChildren().add(botaoPesquisar);
		
		palco.setScene(cena);
		palco.setTitle("Agenda de Contatos");	
		palco.show();		
	}
	
	public static void main(String[] args){
		Application.launch(args);
	}

}















