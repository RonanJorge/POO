import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoAlunos {
	public static final int MAXIMO = 50;
	private int indice;
	private Aluno[] alunos = new Aluno[MAXIMO];
	private Scanner input = new Scanner(System.in);
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public void criar() {
		if(indice < MAXIMO) {
			Aluno aluno = new Aluno();
			System.out.println("**Novo Aluno**");
			System.out.println("Entre com o nome do aluno:");
			aluno.setNome(input.nextLine());
			System.out.println("Entre com o ra do aluno:");
			aluno.setRa(input.nextLine());
			System.out.println("Entre com a data de nascimento do aluno:");
			String sData = input.nextLine();
			aluno.setNasc(sData, dtf);
			aluno.setId(indice);
			
			alunos[indice] = aluno;
			indice ++;
		} else {
			System.out.println("Não é possível cadastrar aluno. Espaço insuficiente.");
		}
	}
	
	
	public int pesquisar(String ra) {
		for(int i = 0; i < MAXIMO; i++) {
			Aluno a = alunos[i];
			if(a != null) {
				if(ra.equals(a.getRa())) {
					return i;
				}
			}
		}
		return -1;
	}
	
	
	public void atualizar() {
		System.out.println("Atualizar cadastro");
		System.out.println("Entre com o número do RA: ");
		String ra = input.nextLine();
		int i = pesquisar(ra);
		if(i != -1) {
			Aluno aluno = alunos[i];
			System.out.println("Entre com o novo nome do aluno:");
			aluno.setNome(input.nextLine());
			System.out.println("Entre com o novo ra do aluno:");
			aluno.setRa(input.nextLine());
			System.out.println("Entre com a nova data de nascimento do aluno:");
			String sData = input.nextLine();
			aluno.setNasc(sData, dtf);
		}
	}
	
	public void excluir() {
		System.out.println("**Excluir**");
		System.out.println("Entre com o número do RA: ");
		String ra = input.nextLine();
		int i = pesquisar(ra);
		if(i != -1) {
			alunos[i] = null;
		}
	}
	
	public void exibir(){
		System.out.println("**Exibir**");
		System.out.println("Entre com o número do RA: ");
		String ra = input.nextLine();
		int i = pesquisar(ra);
		if(i != -1) {
			Aluno a = alunos[i];
			System.out.println("Id: " + a.getId());
			System.out.println("Ra: " + a.getRa());
			System.out.println("Nome: " + a.getNome());
			System.out.println("Nascimento: " + a.getNasc());
		} else {
			System.out.println("Não encontrado.");
		}
	}
	
	public void listar() {
		for(int i = 0; i < MAXIMO; i++) {
			Aluno a = alunos[i];
			if(a != null) {
				System.out.println(a);
			}
		}
	}
	
	
	public void menu(){		
		while(true){
			System.out.println("Gestão de Alunos");
			System.out.println("Entre com a opção desejada:");
			System.out.println("(C)riar aluno");
			System.out.println("(E)xibir aluno");
			System.out.println("(R)emover aluno");
			System.out.println("(A)tualizar aluno");
			System.out.println("(L)istar aluno");
			System.out.println("(S)air");
			char opcao = input.nextLine().toUpperCase().charAt(0);
			if(opcao == 'C') {
					criar();
			} else if(opcao == 'E') {
					exibir();
			} else if(opcao == 'R') {
					excluir();
			} else if(opcao == 'A'){
					atualizar();
			} else if(opcao == 'L'){
					listar();
			} else if(opcao == 'S') {
					System.out.println("Programa encerrado");
					break;
			}
		}
	}
	
	
}
