package refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	//metodo que sobrecarrega a memoria
	public static long carregarMemoria(){
		List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 100_000; i++) {
				list.add(i);	
			}
			return Runtime.getRuntime().freeMemory();
	}
	
	public static void main(String[] args) {
		
		//recuperar informações.
		Runtime rt = Runtime.getRuntime();
		int  MB = 1048576;//total de bytes 
		//para retorna o valor da memoria em MB divide o numero total por bytes.
		double total = rt.maxMemory()/MB;//retorna a quantidade de memoria
		
		double inicio = total - (carregarMemoria()/MB);
		
		rt.runFinalization();
		rt.gc();//força a execução do Garbage collection
		
		double fim = total - (rt.freeMemory()/MB);
	
		System.out.println("total de MB "+total);
		System.out.println("inicio em MB "+inicio);
		System.out.println("fim em MB "+fim);	
	}
}
