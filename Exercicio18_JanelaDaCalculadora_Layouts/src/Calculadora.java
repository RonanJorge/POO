import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculadora extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		GridPane painel = new GridPane();
		Scene cena = new Scene(painel);
		stage.setScene(cena);
		stage.setTitle("Calculadora");
		stage.show();
		
		painel.setHgap(10);
		painel.setVgap(10);
		
		
		TextField visor = new TextField();
		visor.setMinSize(200, 50);
		Button btnCE = new Button("CE");
		FlowPane tela = new FlowPane(10, 0, visor, btnCE);
		
		
		Button btn1 = new Button(" 1 ");
		Button btn2 = new Button(" 2 ");
		Button btn3 = new Button(" 3 ");
		Button btn4 = new Button(" 4 ");
		Button btn5 = new Button(" 5 ");
		Button btn6 = new Button(" 6 ");
		Button btn7 = new Button(" 7 ");
		Button btn8 = new Button(" 8 ");
		Button btn9 = new Button(" 9 ");
		Button btn0 = new Button(" 0 ");
		Button btnIgual = new Button(" = ");
		Button btnSoma = new Button(" + ");
		Button btnDif = new Button(" - ");
		Button btnProd = new Button(" x ");
		Button btnDiv = new Button(" / ");
		Button btnPonto = new Button(" . ");
				
		btn1.setMinSize(50, 50);
		btn2.setMinSize(50, 50);
		btn2.setMinSize(50, 50);
		btn3.setMinSize(50, 50);
		btn4.setMinSize(50, 50);
		btn5.setMinSize(50, 50);
		btn6.setMinSize(50, 50);
		btn7.setMinSize(50, 50);
		btn8.setMinSize(50, 50);
		btn9.setMinSize(50, 50);
		btn0.setMinSize(50, 50);
		btnSoma.setMinSize(50, 50);
		btnDif.setMinSize(50, 50);
		btnProd.setMinSize(50, 50);
		btnDiv.setMinSize(50, 50);
		btnIgual.setMinSize(50, 50);
		btnPonto.setMinSize(50, 50);
		
		GridPane numeros = new GridPane();
		numeros.setHgap(15);
		numeros.setVgap(15);
		
		numeros.add(btn1, 0, 0);
		numeros.add(btn2, 1, 0);
		numeros.add(btn3, 2, 0);
		numeros.add(btnSoma, 3, 0);
		
		numeros.add(btn4, 0, 1);
		numeros.add(btn5, 1, 1);
		numeros.add(btn6, 2, 1);
		numeros.add(btnDif, 3, 1);
		
		numeros.add(btn7, 0, 2);
		numeros.add(btn8, 1, 2);
		numeros.add(btn9, 2, 2);
		numeros.add(btnProd, 3, 2);
		
		numeros.add(btnPonto, 0, 3);
		numeros.add(btn0, 1, 3);
		numeros.add(btnIgual, 2, 3);
		numeros.add(btnDiv, 3, 3);
								
		painel.add(tela, 1, 1);
		painel.add(numeros, 1, 2);
				
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

	

}
