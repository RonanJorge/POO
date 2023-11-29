import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoFuncionarios {
	private final int MAXIMO = 50;
	private int indice;
	private Funcionario[] funcionarios = new Funcionario[MAXIMO];
	private Scanner input = new Scanner(System.in);
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public void criar() {
		if(indice < MAXIMO) {
			Funcionario f = new Funcionario();
			System.out.println("**Novo Funcionário**");
			System.out.println("Entre com o nome do funcionário:");
			f.setNome(input.nextLine());
			System.out.println("Entre com a matricula do funcionario:");
			f.setMatricula(input.nextLine());
			System.out.println("Entre com a data de admissao do funcionario:");
			String sData = input.nextLine();
			f.setAdmissao(sData, dtf);
			System.out.println("Entre com a data de demissao do funcionario:");
			String sData1 = input.nextLine();
			f.setDemissao(sData1, dtf);
			System.out.println("Entre com o salario do funcionario:");
			f.setSalario(Float.parseFloat(input.nextLine()));
			System.out.println("Entre com o horario do funcionário:");
			f.setHorario(input.nextLine());
			
			f.setId(indice);
			funcionarios[indice] = f;
			indice ++;
		} else {
			System.out.println("Não é possível cadastrar funcionario. Espaço insuficiente.");
		}
	}
	
	public int pesquisar(String matricula) {
		for(int i = 0; i < MAXIMO; i++) {
			Funcionario f = funcionarios[i];
			if(f != null) {
				if(matricula.equals(f.getMatricula())) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public void atualizar() {
		System.out.println("**Atualizar cadastro de funcionario**");
		System.out.println("Entre com o número da matricula: ");
		String matricula = input.nextLine();
		int i = pesquisar(matricula);
		if(i != -1) {
			Funcionario f = funcionarios[i];
			System.out.println("Entre com o novo nome do funcionário:");
			f.setNome(input.nextLine());
			System.out.println("Entre com a nova matricula do funcionario:");
			f.setMatricula(input.nextLine());
			System.out.println("Entre com a nova data de admissao do funcionario:");
			String sData = input.nextLine();
			f.setAdmissao(sData, dtf);
			System.out.println("Entre com a nova data de demissao do funcionario:");
			String sData1 = input.nextLine();
			f.setDemissao(sData1, dtf);
			System.out.println("Entre com o novo salario do funcionario:");
			f.setSalario(Float.parseFloat(input.nextLine()));
			System.out.println("Entre com o horario do funcionário:");
			f.setHorario(input.nextLine());	
		}
	}
	
	public void excluir() {
		System.out.println("**Excluir Funcionário**");
		System.out.println("Entre com o número da matricula: ");
		String matricula = input.nextLine();
		int i = pesquisar(matricula);
		if(i != -1) {
			funcionarios[i] = null;
		}
	}
	
	public void exibir(){
		System.out.println("**Exibir funcionário**");
		System.out.println("Entre com o número da matricula: ");
		String matricula = input.nextLine();
		int i = pesquisar(matricula);
		if(i != -1) {
			Funcionario a = funcionarios[i];
			System.out.println("Id: " + a.getId());
			System.out.println("Matricula: " + a.getMatricula());
			System.out.println("Nome: " + a.getNome());
			System.out.println("Admissao: " + a.getAdmissao());
			System.out.println("Demissao: " + a.getDemissao());
			System.out.println("Salario: " + a.getSalario());
			System.out.println("Horario: " + a.getHorario());
		} else {
			System.out.println("Não encontrado.");
		}
	}
	
	public void listar() {
		for(int i = 0; i < MAXIMO; i++) {
			Funcionario f = funcionarios[i];
			if(f != null) {
				System.out.println(f);
			}
		}
	}
	
	public void menu(){		
		while(true){
			System.out.println("Gestão de Funcionarios");
			System.out.println("Entre com a opção desejada:");
			System.out.println("(C)riar funcionario");
			System.out.println("(E)xibir funcioanario");
			System.out.println("(R)emover funcioanario");
			System.out.println("(A)tualizar funcioanario");
			System.out.println("(L)istar funcioanario");
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
					System.out.println("**Programa encerrado**");
					break;
			}
		}
	}
}
