package ExerciciosPratica;

import java.util.Scanner;

public class pratica_while {

	public static void main(String[] args) {

		// declarando as variaveis

		int idade;
		int menor = 0;
		int maior = 0;

		// ENTRADA DE DADOS
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite uma idade : ");
		idade = leia.nextInt();

		while (idade >= 0) {
			System.out.println(" Digite uma idade : ");
			idade = leia.nextInt();

			if (idade < 21) {
				menor++;
			}
	
			if (idade >= 50) {
				maior++;
			}
		}

		System.out.println(" Total de pessoas menores de 21 anos:  " + menor);
		System.out.println(" Total de pessoas maiores de 50 anos:  " + maior);
	}

}
