package logica;
import java.util.ArrayList;

public class FluxoF{

     public static void main(String[] args){

/*foreach*/
ArrayList<Integer> list = new ArrayList<Integer>();
//adiciona 10 itens dentro do objeto list.
for(int i=1; i<=10; i++){
list.add(i);
}
//usando for para imprimir a lista do tipo ArrayList
for(Integer numero : list){
System.out.println("numero = "+numero);
}
}
}
