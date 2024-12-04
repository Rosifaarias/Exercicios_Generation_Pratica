package ExerciciosPratica;

import java.util.Scanner;

public class pratica_2 {

	public static void main(String[] args) {
		
		int numero; 
		
		Scanner leia = new Scanner(System.in);
		
		
		// entrada de dados
		System.out.println(" Digite um número : \n");
		numero = leia.nextInt();
		
		// verificando a condicao para a Saída
		
		if (numero %2 == 0 && numero >= 0 ) {
			System.out.println(" O Número " + numero + " é PAR e Positivo! ");
			
		} else if (numero %2 != 0 && numero <= 0) {
			System.out.println(" O número " + numero + " é ímpar e Negativo! ");
			
		} else if (numero %2 == 0 && numero <= 0) {
			System.out.println(" O número " + numero + " é par e Negativo! ");
			
		} else if (numero %2 != 0 && numero >= 0) {
			System.out.println(" O número " + numero + " é ímpar e Positivo! ");
		}
		
	} 
}
