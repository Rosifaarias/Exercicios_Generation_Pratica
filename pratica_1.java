package ExerciciosPratica;

public class pratica_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Entrada de dados
		int a,b, c, soma;
		
		a = 2;
		b = 2;		
		c = 4;
		
		
		// PROCESSAMENTO
		
		soma =  a + b;
		
		// SAIDA DE DADOS
		
		if (soma > c ){
			
		System.out.println("A soma de " + a + " + " + b +  " é maior do que " + c + ".");
		 
	
		} else if (soma < c) {
			
			System.out.println("A soma de " + a + " + " + b +  " é menor do que " + c + ".");
			
		} else {
			
			System.out.println("A soma de " + a + " + " + b +  " é igual a " + c + ".");
			
		}
	}

}
