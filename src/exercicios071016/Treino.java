package exercicios071016;

import java.util.Scanner;

public class Treino {
	
	public Treino(){
		exercicio1();
		
	}

	private void exercicio1 (){
		int num1 = (new Scanner(System.in)).nextInt();
		int num2 = (new Scanner(System.in)).nextInt();
		
		if (num1 > num2){
			System.out.println("O num 1 � o maior");
		}else{
			System.out.println("O num 2 � o maior");
		}
	}
	
}
