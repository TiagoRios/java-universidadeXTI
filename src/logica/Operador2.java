package logica;
import java.util.*;
/**
 * calcular diametro circunferencia e area
 * @author Tiago
 *
 */
public class Operador2 {
 
   private static Scanner s;

public static void main(String[] args){

   s = new Scanner(System.in);
   System.out.println("Para saber o diametro a circunferencia e a area "  +"Digite o raio");
   double raio = s.nextDouble();

   //Diâmetro : 2r
   double diametro = 2 * raio;
   System.out.println("diametro = "  +diametro);

   //curcunferência : 2 PI r
   double pi = Math.PI;
   double circunferencia = 2 * pi * raio;
   System.out.println("circunferencia = "+circunferencia);
 
   //area PI  r2
   double area = pi * (Math.pow(raio, 2));
    System.out.println("Area = "+ area);
}
}