
public class Teste {

	public static void main(String[] args) {
		SomAutomotivo som = new SomAutomotivo("Pionner", 500);
		Motor motor = new Motor("Ferrari", "gasolina");
		Carro carro = new Carro(motor, som, "Bridgestone", "Alfa Romeo");
		
		System.out.println("Marca do Carro: "+ carro.marcaCarro +" - Potencia do som: " + carro.som.potencia);
	}

}
