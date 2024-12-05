package ExerciciosPratica;

import java.util.Scanner;

public class pratica_do_While {

	public static void main(String[] args) {

		int numero = 0;
		int soma = 0;		

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número e/ou  digite 0 para encerrar:   ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				
				soma = soma + numero;
			} 
		
		
		} while (numero != 0); 
	
		System.out.println(" A soma dos números positivos é " + soma + ".");
		
		leia.close();
	}
}