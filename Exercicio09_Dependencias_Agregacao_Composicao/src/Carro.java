
public class Carro {
	private Motor motor;
	public SomAutomotivo som;
	private String pneuCarro;
	public String marcaCarro;
	
	public Carro() {
		this.motor = null;
		this.som = null;
		this.pneuCarro = "";
		this.marcaCarro = "";
	}
	
	
	public Carro(Motor motor, SomAutomotivo som, String pneuCarro, String marcaCarro) {
		this.motor = motor;
		this.som = som;
		this.pneuCarro = pneuCarro;
		this.marcaCarro = marcaCarro;
	}
	
}
