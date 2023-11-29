import java.util.Scanner;

public class GestaoVestuario{
	private Vestuario[] lista = new Vestuario[50];
	private int indice = 0;
	private Scanner input = new Scanner(System.in);
	
	public void cadastrar(){
		if(indice < 50){
			Vestuario v = new Vestuario();
			System.out.println("*** Cadastro de novo Vestuario ***");
			
			System.out.println("Digite o tipo do Vestuario:");
			v.setTipo(input.nextLine());
			
			System.out.println("Digite a cor do Vestuario:");
			v.setCor(input.nextLine());
			
			System.out.println("Digite o tamanho do Vestuario:");
			v.setTamanho(input.nextLine());
			
			lista[indice] = v;
			indice ++;
			
		} else{
			System.out.println("Não há espaço para novo cadastro!");
		}
	}
	
	public void listar(){
		System.out.println("*** Lista de Vestuarios ***");
		for(int i = 0; i < 50; i++){
			System.out.println(lista[i]);
		}
	}
	
	public void sair(){
		System.out.println("Obrigado e volte sempre!");
		System.exit(0);
	}
	
	public void menu(){
		while(true){
			System.out.println("*** Gestao de Vestuario ***");
			System.out.println("Entre com a opcao desejada: ");
			System.out.println("(C) - cadastrar");
			System.out.println("(L) - listar");
			System.out.println("(S) - sair");
			char opcao = input.nextLine().toUpperCase().charAt(0);
			if(opcao == 'C'){
				cadastrar();
			} else if(opcao == 'L'){
				listar();
			} else if(opcao == 'S'){
				sair();
			}
		}
	}
	
}
