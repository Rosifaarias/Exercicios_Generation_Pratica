package ExerciciosPratica;

import java.util.Scanner;

public class Exercicio_Salario2 {

	public static void main(String[] args) {
		
		
		// Declarando as variaveis
	
		Float SalarioBruto, AdicionalNoturno, HorasExtras, Descontos, SalarioLiquido;
		
		
	// funcao leia

		Scanner leia = new Scanner(System.in); 

	
	System.out.println(" Digite seu salário Bruto:  ");
	SalarioBruto = leia.nextFloat();
	System.out.println(" Digite o Adicional Noturno : ");
	AdicionalNoturno = leia.nextFloat();
	System.out.println(" Digite suas Horas extras:  ");
	HorasExtras = leia.nextFloat();
	System.out.println(" Digite seus Descontos:  ");
	Descontos = leia.nextFloat();
	
	// Processamento 
	
	SalarioLiquido = (SalarioBruto + AdicionalNoturno + HorasExtras)  - Descontos; 
	
	
	// Saida
	
	System.out.println(" O Salário Liquido :  " + SalarioLiquido);
	

	}

}
