package ExerciciosPratica;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {


		   Scanner leia = new Scanner(System.in);

	        int soma = 0;
	        float media = 0;
	        int[] vetor = {2,5,1,3,4,9,7,8,10,6};

	        System.out.print("\nElementos nos índices ímpares: ");
	    	for (int c = 0; c <= 9; c++) {
	            if (vetor[c] % 2 != 0) {
	                System.out.print(" " + vetor[c]);
	                soma += vetor[c];
	            } 
	            
	        }
	    	
	    	System.out.print("\nElementos pares: ");
	    	for (int c = 0; c <= 9; c++) {
	            if (vetor[c] % 2 == 0) {
	                System.out.print(" " + vetor[c]);
	                soma += vetor[c];
	            } 

	        }

	    	 media = (float) soma /10;
	    	
	        System.out.println("\nSoma dos números: " + soma);
	        System.out.println("Média dos números: "  + media);
	}

}
