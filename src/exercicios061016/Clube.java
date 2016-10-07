package exercicios061016;

public class Clube {
	
	String Nome;
	String pontosCasa;
	String pontosFora;
	String numJogos;
	
	public Clube() {
		
	}
	
	public Clube(String n) {
		this.Nome = n;		
	}

	public Clube(String pontosCasa, String pontosFora, String numJogos) {
		super();
		this.Nome = Nome;
		this.pontosCasa = pontosCasa;
		this.pontosFora = pontosFora;
		this.numJogos = numJogos;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getPontosCasa() {
		return pontosCasa;
	}

	public void setPontosCasa(String pontosCasa) {
		this.pontosCasa = pontosCasa;
	}

	public String getPontosFora() {
		return pontosFora;
	}

	public void setPontosFora(String pontosFora) {
		this.pontosFora = pontosFora;
	}

	public String getNumJogos() {
		return numJogos;
	}

	public void setNumJogos(String numJogos) {
		this.numJogos = numJogos;
	}

	
}
