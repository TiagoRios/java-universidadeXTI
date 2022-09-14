package logica;

/**
 * programa que usa um if dentro do for para parar a sequencia
 * de execução !
 */
public class FluxoB{
public static void main(String[] args){

for (int i =0; i<10; i++){
if(i == 5) {
break;
}
System.out.println(i);
}
}
}
