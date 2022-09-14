package oo;

public class Matematica {
/**
 * 
 * @param um
 * @param dois
 * @return o maior dos dois numeros
 */
	int maior(int um, int dois) {
		//para verificar se um e maior que dois usar um fluxo condicional
		if(um > dois){
			return um;
		}else{
			return dois;
		}
	}
	
	double soma(double ... numeros){
		double total = 0;
		for(double n : numeros){
			total += n;
		}
		return total;
	}
}