package logica;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Tiago
 *	programa que captura nomes e guarda dentro de uma lista
 *	e mostra sua saida.
 */
public class FluxoW {

private static Scanner s;

public static void main (String[] args){

/*int i=3;
do{
System.out.println(i);
i++;
} while(i<2);*/

ArrayList<String> produtos =  new ArrayList<String>();
s = new Scanner(System.in);
System.out.println("Liste seus produtos : para sair digite fim");

String produto;


//enquanto a entrada do Scanner for diferente de fim add produtos. 
while(!"fim".equals (produto = s.nextLine())){
produtos.add(produto);
}
//usando o metodo toString no objeto produtos para percorrer e mostrar
//todos os itens da lista de produtos
System.out.println(produtos.toString());
}}