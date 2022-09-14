package logica;

public class Fibonacci {
	public static void main(String[] args) {

		//int primeiro = 0, proximo = 1;
		System.out.println(0);
		for(int primeiro=0, proximo=1; proximo<50; ){
		
		//while (proximo < 50) {
			System.out.println(proximo);
			proximo += primeiro;
			primeiro = proximo - primeiro;
		}
	}
}