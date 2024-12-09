package ExerciciosPratica;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PraticaFila {

	public static void main(String[] args) {

		// SCANER PARA LER O NOME
		Scanner leia = new Scanner(System.in);
		// CHAMANDO A FUNCAO FILA
		Queue<String> fila = new LinkedList<String>();

		// VARIAVEIS

		int opcao = -1;
		String nome, chamado;

		do {
			System.out.println("\n||||||||Menu de opções||||||||||||||||||");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila ");
			System.out.println("0 - Sair ");

			System.out.print("\nEscolha uma opção: ");
			opcao = leia.nextInt();

			switch (opcao) {
			// ADICIONAR O NOME DO CLIENTE
			case 1:
				System.out.println("\n Digite o nome do Cliente: ");
				nome = leia.next();
				fila.add(nome);
				System.out.println("\n NOME Adicionado!");

				for (String cliente : fila) {
					System.out.println(nome);
				}

				break;
			// TOTAL DE CLIENTES ESPERANDO
			case 2:

				System.out.println("\nTotal de Clientes na fila: " + fila.size());
				Iterator<String> iterator = fila.iterator();

				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

				break;
			// CHAMAR O CLIENTE E TIRAR ELE DA FILA
			case 3:

				String Chamado = fila.poll();
				if (Chamado != null) {
					System.out.println("\nO Cliente " + Chamado + " foi chamado!");
				} else {
					System.out.println("\nA fila está vazia.");
				}
				break;

			default:
				System.out.println(" Você saiu da fila Obrigade!!!! ");

			}

		} while (opcao != 0);

		leia.close();

	}

}
