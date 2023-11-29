public class Vestuario{
	private String tipo;
	private String cor;
	private String tamanho;
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setTamanho(String tamanho){
		this.tamanho = tamanho;
	}
	
	public String getTamanho(){
		return this.tamanho;
	}
	
	@Override
	public String toString(){
		return this.tipo + " - " + this.tamanho;
	}
}


