package com.inicio.estudos.programacao.basico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * classe usada para testar o desempenho das implementa�oes da interface List
 * 
 * @author Tiago 11-07-2016
 */
public class Lista {

	public static void main(String[] args) {
		HashSet<Object> hashSet = new HashSet<>();
		ArrayList<Object> arrayList = new ArrayList<>();
		LinkedList<Object> linkedList1 = new LinkedList<>();
		LinkedList < Integer > linkedList = new LinkedList < Integer >();
		int size = 10000;
		
		 for ( int i = 15; i < size ; i++) {
		 linkedList.add(i);
		// System.out.println(i);
		 }

		long tempo;

		
		System.out.println("add no final");
		tempo = Lista.adicionaNoFinal(arrayList);
		System.out.println(" ArrayList : " + tempo + "ms");
		tempo = Lista.adicionaNoFinal(linkedList1);
		System.out.println(" LinkedList : " + tempo + "ms");

		System.out.println("add no come�o");
		//tempo = TestaAdicionaNoFinal.adicionaNoComeco(arrayList);
		//System.out.println(" ArrayList : " + tempo + "ms");
		tempo = Lista.adicionaNoComeco(linkedList1);
		System.out.println(" LinkedList : " + tempo + "ms");

		
		System.out.println("metodo para pegar a lista get");
		tempo = Lista.get(arrayList);
		System.out.println(" ArrayList : " + tempo + "ms");
		//tempo = TestaAdicionaNoFinal.get(linkedList1);
		//System.out.println(" LinkedList : " + tempo + "ms");
		
		System.out.println("verificar se um elemento esta na lista");
		//tempo = TestaAdicionaNoFinal.contains(arrayList);
		//System.out.println(" ArrayList : " + tempo + "ms");
		tempo = Lista.contains(hashSet);
		System.out.println(" HashSet : " + tempo + "ms");
		

		System.out.println("comparando os FORs");
		tempo = Lista.foreach(linkedList1);
		System.out.println(" Foreach : " + tempo + "ms");
		tempo = Lista.forTradicional(linkedList1);
		System.out.println("For Tradicional : " + tempo + "ms");
		
	}

	public static long adicionaNoFinal(List<Object> lista) {
		long inicio = System.currentTimeMillis();

		int size = 100000;

		for (int i = 0; i < size; i++) {
			lista.add(i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}

	/**
	 * metodo que add elementos no come�o da lista
	 * 
	 * @param lista
	 * @return lista com numeros
	 */
	public static long adicionaNoComeco(List<Object> lista) {
		long inicio = System.currentTimeMillis();

		int size = 100000;

		for (int i = 0; i < size; i++) {
			lista.add(0, i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}

	/**
	 * metodo que retorna a lista
	 * 
	 * @param lista
	 * @return
	 */
	public static long get(List<Object> lista) {

		int size = 100000;

		for (int i = 0; i < size; i++) {
			lista.add(i);
		}

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			lista.get(i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}

	public static long contains(Collection<Object> colecao) {

		int size = 100000;

		for (int i = 0; i < size; i++) {
			colecao.add(i);
		}

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			colecao.contains(i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}

	public static long forTradicional (LinkedList<Object> linkedList ) {
		 long inicio = System . currentTimeMillis ();
		
		 //ta funcionando mais nao mostra no console os valores
		 for ( int i = 0; i < linkedList.size (); i++) {
			 int a = (int) linkedList.get(99);
			 System.out.println(a);
			 }
		 
		 long fim = System . currentTimeMillis ();
		
		 return fim - inicio ;
		 }
		
	public static long foreach (LinkedList<Object> linkedList ) {
		 long inicio = System.currentTimeMillis ();
		
		 for ( Object x : linkedList ) {
		 System.out.println(x);
		 }
		
		 long fim = System . currentTimeMillis ();
		
		 return fim - inicio ;
		 }
}
