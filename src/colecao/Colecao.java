package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {
	public static void main(String[] args) {
		
		//converter array em cole��o
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		//apresentar a minha cole�ao no formato string
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("A"));
		
		c.remove("A");
		System.out.println(c.toString());
		
		//grupos//
		
		
		//criar uma cole��o de Strings
		//utilizar uma classe utilitaria "Arrays" para transformar um array em uma lista que e  uma cole�ao
		Collection<String> c2 = Arrays.asList("O","U");
		//add os elementos da segunda a primeira cole�ao
		c.addAll(c2);
		System.out.println("adicionou e ficou "+c.toString());
		System.out.println(c.containsAll(c2));//verifica se existem todos esses elementos da cole��o dois na um
		c.removeAll(c2);
		System.out.println("removeu e ficou "+c.toString());
		
		//percorer os elementos
		for (String string : c) {
			System.out.println(string);
		}
		//converter cole��o em array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		c.clear();
		System.out.println(c);	
	}
}
