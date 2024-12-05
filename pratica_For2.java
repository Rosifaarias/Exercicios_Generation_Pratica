package ExerciciosPratica;

import java.util.Scanner;

public class pratica_For2 {

	public static void main(String[] args) {
		
		int numero, contador;
		int contadorPar = 0;
		int contadorImpar = 0;
		
		Scanner leia = new Scanner (System.in);
		
		// laco de repeticao para ler 10 numeros
		
		for(contador = 1; contador <= 10; contador ++) {
		System.out.println(" Digite o " + contador + " º número: ");
		numero = leia.nextInt();
		
		
		if (numero %2 == 0) { // contador de par
		 contadorPar++;
		 
	} else {
		contadorImpar++; // contador de ímpar
	}
	  
		
		
	} 
		
	  // mostrando total de pares e ímpares
	   System.out.println(" \n Total de números Pares:  " + contadorPar);
	   System.out.println(" \n Total de números Pares:  " + contadorImpar);
	
	}

}
