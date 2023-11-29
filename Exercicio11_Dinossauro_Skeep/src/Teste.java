import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Dinossauro skeep = new Dinossauro();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("\n****Dinossauro Skeep*****");
			System.out.println("Energia: "+ skeep.energia);
			System.out.println("Velocidade: "+ skeep.velocidade);
			System.out.println("Temperatura: "+ skeep.temperatura);
			System.out.println("Humor: "+ skeep.humor + "\n");
			System.out.println("Escolha uma opção: \n"
								+ "(P)ular\n"
								+ "(C)orrer\n"
								+ "Co(M)er\n"
								+ "C(A)ntar\n"
								+ "Tomar (S)ol\n"
								+ "Ficar na S(O)mbra \n"
								+ "Sai(R)");	
			String texto = scan.nextLine().toUpperCase();
			char opc = texto.charAt(0);
			if(opc == 'P') {
				skeep.pular();
			} else if(opc == 'C') {
				skeep.correr();
			} else if(opc == 'M') {
				skeep.comer();
			} else if(opc == 'A') {
				skeep.cantar();
			} else if(opc == 'S') {
				skeep.tomarSol();
			} else if(opc == 'O') {
				skeep.ficarNaSombra();
			} else {
				System.out.println("**Fim**");
				break;
			}
		}
	}
}
