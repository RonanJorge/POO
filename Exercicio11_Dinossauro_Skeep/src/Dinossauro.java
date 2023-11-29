
public class Dinossauro {
	int energia = 0;
	int velocidade = 0;
	int temperatura = 0; 
	String humor;
	
	public void pular() {
		energia --;
		velocidade --;
		humor = "Feliz";
	}
	
	public void correr() {
		energia --;
		velocidade --;
		humor = "Feliz";
	}
	
	public void comer() {
		energia ++;
		velocidade --;
		humor = "Feliz";
	}
	
	public void cantar() {
		energia --;
		humor = "Feliz";
	}
	
	public void tomarSol() {
		velocidade ++;
		temperatura ++;
		humor = "Feliz";
	}
	
	public void ficarNaSombra() {
		energia ++;
		humor = "Triste";
		temperatura --;
	}
}
