package ExerciciosPratica;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratica_ArrayList {

	public static void main(String[] args) {

		// CRIANDO O ARRAYLIST
		ArrayList<String> cores = new ArrayList<String>();

		
		Scanner leia = new Scanner(System.in);

		System.out.println(" *******Digite 5 cores: ***********");

		for (int i = 0; i < 5; i++) {

			System.out.println(" Digite a " + (i + 1) + "ª" + " cor :   ");
			cores.add(leia.next());

		}
		
		System.out.println("\nListar todas as cores: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(cores.get(i));

		}

		cores.sort(null);

		System.out.println("\nOrdenar as cores: ");

		for (int i = 0; i < 5; i++) {
			System.out.println(cores.get(i));

		}

	}

}
