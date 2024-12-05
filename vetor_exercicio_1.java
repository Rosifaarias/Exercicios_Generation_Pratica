package ExerciciosPratica;

import java.util.Scanner;

public class vetor_exercicio_1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		boolean encontrou = false;

		System.out.println("Digite o número que você deseja encontrar:   ");
		int numero = leia.nextInt();

		// buscar o numero no vetor
		for (int c = 0; c <= 9; c++) {

			if (numero == vetor[c]) {
				System.out.println(" O número " + numero + " está localizado na posição: " + c + " ");
				encontrou = true;
			}
			
		}
		
		if (encontrou == false) {
			System.out.println(" O número " + numero + " não foi encontrado!");
		}
	}

}