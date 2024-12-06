package ExerciciosPratica;

import java.util.HashSet;
import java.util.Set;

public class teste_4 {

	public static void main(String[] args) {
		
		
		
		  Set<Integer> set = new HashSet<>();

	        // 1. Adicionar elementos
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        
	        
	        
	        
	        System.out.println("Elementos no Set: " + set);

	        // 2. Verificar tamanho
	        System.out.println("Tamanho do Set: " + set.size());

	        // 3. Verificar se o Set está vazio
	        System.out.println("Está vazio? " + set.isEmpty());

	        // 4. Verificar se contém um elemento
	        System.out.println("Contém 20? " + set.contains(20));

	        // 5. Remover um elemento
	        set.remove(20);
	        System.out.println("Após remover 20: " + set);

	        // 6. Verificar novamente o tamanho
	        System.out.println("Novo tamanho do Set: " + set.size());

	        // 7. Limpar o Set
	        set.clear();
	        System.out.println("Após limpar: " + set);
	    }
	

}


