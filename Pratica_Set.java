package ExerciciosPratica;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pratica_Set {

	public static void main(String[] args) {

		// variavel para guardar os numeros

		int numero;

		Set<Integer> numerosSet = new HashSet<>();
		Scanner leia = new Scanner(System.in);

		int numeroDesejado;

		for (int i = 0; i < 10; i++) {
			System.out.println(" Digite um " + (i + 1) + "ª" + " número :   ");
			numero = leia.nextInt();
			numerosSet.add(numero);

		}

		System.out.println("\nOs números armazenados no Set são: " + numerosSet);

		
	}

}
