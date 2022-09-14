package logica;
import java.util.*;
/** 
 *@author Tiago Ribeiro Luna Rios
 *programa que trabalha com Arraylist 
 */
public class ArrayLista {

public static void main(String[] args){

ArrayList<String> cores = new ArrayList<>();
cores.add("branco");
cores.add(1 ,"Vermelho");
cores.add(0 ,"verde");
//toString percorre todo objeto e mostra seu conteudo
System.out.println(cores.toString());
//metodo size pega o tamanho do array
System.out.println("tamanho aqui = "+cores.size());
//get pega o valor da posição passada como parametro
System.out.println("elemento = "+cores.get(1));
//indexOf pega a posição do elemento -1
System.out.println("indice verde = "+ cores.indexOf("Vermelho"));
cores.remove("branco");
cores.contains("amarelo");
System.out.println("Tem amarelo ? = " +cores.contains("amarelo"));
} 
}