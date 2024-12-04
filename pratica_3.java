package ExerciciosPratica;

import java.util.Scanner;

public class pratica_3 {

	public static void main(String[] args) {
	
		// variaveis
		    int codigo;
		    int quantidade; 
	        String nomeProduto = "";
	        float preco = 0;
	        float valordaCompra = 0;
	        
	        // chamado o comando leia
	        Scanner leia = new Scanner(System.in);
	        
	        // entrada de dados 
        	System.out.println(" Digite o código do Produto: ");
        	codigo = leia.nextInt();
        	
        	System.out.println(" Digite a quantidades: ");
        	quantidade = leia.nextInt();
        
	        switch (codigo) {
	            case 1:
	                nomeProduto = "Cachorro Quente";
	                preco = 10.00f;
	                break;
	            case 2:
	                nomeProduto = "X-Salada";
	                preco = 15.00f;
	                break;
	            case 3:
	                nomeProduto = "X-Bacon";
	                preco = 18.00f;
	                break;
	            case 4:
	                nomeProduto = "Bauru";
	                preco = 12.00f;
	                break;
	            case 5:
	                nomeProduto = "Refrigerante";
	                preco = 8.00f;
	                break;
	            case 6:
	                nomeProduto = "Suco de laranja";
	                preco = 13.00f;
	                break;
	            default:
	                System.out.println("Código inválido.");
	               
	        }

	        // Calcula o valor da compra
	        valordaCompra = quantidade * preco;
	        
	        // Exibe as informações do produto selecionado
	        System.out.println("Produto: " + nomeProduto);
	        System.out.println("Preço Total: R$ " + valordaCompra);
	    }
	}