
public class Principal {

	public static void main(String[] args) {
		Piloto piloto1 = new Piloto();
		piloto1.nome = "Hamilton";
		Piloto piloto2 = new Piloto();
		piloto2.nome = "Joao";
		
		Passageiro passag1 = new Passageiro();
		passag1.nome = "Maria";
		passag1.numeroVoo = "3333";
		
		Passageiro passag2 = new Passageiro();
		passag2.companhia = "Latam";
		
		Aeronave an1 = new Aeronave();
		an1.companhia = "Gol";
		an1.passageiros.add(passag2);
		an1.passageiros.add(passag1);
		
		Aeronave an2 = new Aeronave();
		an2.companhia = "Azul";
		an2.passageiros.add(passag1);
			
		
		Aeroporto ap1 = new Aeroporto();
		ap1.nome = "Congonhas";
		ap1.aeronaves.add(an1);
		
		Aeroporto ap2 = new Aeroporto();
		ap2.nome = "Guarulhos";
		ap2.aeronaves.add(an2);
		
		System.out.println(ap2.nome);
		System.out.println(ap1.aeronaves.toString());

	}

}
