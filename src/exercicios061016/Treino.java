package exercicios061016;

public class Treino {
	
	//Construtor � por aqui que come�a
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
		
		System.out.println("O valor da posi��o 3 �: " + pontosFora[2]);
		int soma =0;
		for(int i = 0; i< pontosFora.length;i++)//Percorre o vectore
			soma= soma + pontosFora[i];//Faz a soma dos valores
		
		return soma;
	}
	

}
