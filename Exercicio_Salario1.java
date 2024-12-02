package ExerciciosPratica;

import java.util.Scanner;

public class Exercicio_Salario1 {

	public static void main(String[] args) {
		
		
		float Salario, Abono, NovoSalario;
		
		
		
		// Chamando o leia
		
		Scanner leia = new Scanner(System.in);
		
		
		// entrada de dados
		
		System.out.println(" Digite o seu sálario : ");
		Salario = leia.nextFloat();
		
		System.out.println(" Digite o seu Abono : ");
		Abono = leia.nextFloat();
		
		
		
		// Processamento 
		
		
		NovoSalario = Salario + Abono;
		
		
		//  Saída de Dados
		
		System.out.println(" O seu novo Salário Será  : "  + NovoSalario );
		

	}

}
