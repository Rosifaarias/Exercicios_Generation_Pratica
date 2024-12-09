package ExerciciosPratica;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PraticaPilha {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		int opcao = -1;
		String livro = "";

		while (opcao != 0) {
			System.out.println("\n||||||Menu de opções||||||||||||||||||");
			System.out.println("1 - Adicionar Livro na pilha ");
			System.out.println("2 - Listar todos os Livros Adicionados");
			System.out.println("3 - Retirar um livro da pilha ");
			System.out.println("0 - Sair ");

			System.out.print("\nEscolha uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
					// DIGITAR O LIVRO
			case 1:
				System.out.println("\n Digite um livro: ");
				livro = leia.nextLine();
				pilha.push(livro);

				System.out.println("\n Livro Adicionado!");

				break;
				// VERIFICAR A LISTA DE LIVROS
			case 2:

				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia.");
				} else {

					System.out.println("\nElementos da Pilha: ");
					Iterator<String> iterator = pilha.iterator();

					while (iterator.hasNext()) {
						System.out.println(iterator.next());

					}

				}

				break;
				// RETIRAR O LIVRO DA PILHA
			case 3:

				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia. Não há livros para retirar.");
				} else {
					System.out.println("\nRetirar o livro da Pilha: " + pilha.pop());
					System.out.println("\nUm Livro foi retirado da pilha!");
				}
				break;

			default:
				System.out.println("Você saiu da pilha Obrigade!");

			}

		}

		leia.close();
	}

}
