package exercicios061016;

public class Treino {
	
	//Construtor é por aqui que começa
	public Treino(){
		
		// Chamar o metodo criado mais abaixo		
		System.out.println(exercicio2());	
	}
	
	private void exercicio1(){
		int pontosLeixoes  = 45;
		int pontosFeirense = 76;
		int pontosPorto    = 33;
		int pontosAves     = 67;
	}
	
	private int exercicio2(){
		int[] pontosFora = new int[]{45, 76, 33, 67};
		
		System.out.println("O valor da posição 3 é: " + pontosFora[2]);
		int soma =0;
		for(int i = 0; i< pontosFora.length;i++)
			soma= soma + pontosFora[i];
		
		return soma;
	}

}
