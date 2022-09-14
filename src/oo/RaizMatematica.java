package oo;

public class RaizMatematica {

	int raiz(int numero){
		int raiz = 0 , impar = 1;
		while(numero >=impar){
			numero -=impar;
			impar += 2; //proximo numero impar
			++raiz;
		}
		return raiz;
	}
	public static void main(String[] args){
		RaizMatematica ma = new RaizMatematica();
		double raiz = ma.raiz(27);
		System.out.println("Raiz = " + raiz);
	System.out.println("Raiz da class Math = " +Math.sqrt(27));
		
	}
}
