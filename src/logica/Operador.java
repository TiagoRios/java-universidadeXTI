package logica;
/**
 * operador ternario atua com 3 operandos. condi��o ? sim : n�o
 * @author Tiago
 *
 */
public class Operador{
	
     public static void main(String[] args){

         int idade = 6;
         String x = (idade >= 18) ? "Maior de idade" : "Menor de idade";
         System.out.println(x);
}
}