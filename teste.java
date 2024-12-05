package ExerciciosPratica;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		
	Scanner leia = new Scanner(System.in);
	
	int senha;
	
	System.out.print(" Digite a sua senha:  ");
	senha =leia.nextInt();
	
	while (senha != 2002) {
			System.out.print(" Senha invalida ");
			senha = leia.nextInt();
			
	
			
	}	
			
	System.out.print(" Senha permitida ");
	
	}
}