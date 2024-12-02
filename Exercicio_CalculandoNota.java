package ExerciciosPratica;

import java.util.Scanner;

public class Exercicio_CalculandoNota {

	public static void main(String[] args) {
	
		
		
	Float Nota1, Nota2, Nota3, Nota4, Media;
	
		
	// Chamando a funcao Scanner
	
	Scanner leia = new Scanner(System.in); 
	
	
	// Entrada de Dados
	
	System.out.println(" Digite a sua primeira Nota:  ");
	Nota1 = leia.nextFloat();
	System.out.println(" Digite a sua segunda Nota:  ");
	Nota2 = leia.nextFloat();
	System.out.println(" Digite a sua terceira Nota:   ");
	Nota3 = leia.nextFloat();
	System.out.println(" Digite a sua quarta Nota: ");
	Nota4 = leia.nextFloat();
	
	// Processamento
	
	Media = (Nota1 + Nota2 + Nota3 + Nota4) /4;
	

	
	// Exibir a Media 
	
	
	System.out.println(" Parabéns, a sua media desse semestre é : " + Media);
	
		
		
		
		

	}

}
