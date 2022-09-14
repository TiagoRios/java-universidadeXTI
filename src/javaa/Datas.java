package javaa;

import java.util.Calendar;
import java.util.Date;



public class Datas {

	
	public static void main(String[] args) {
		
		//01 de jan 1970
		System.out.println(System.currentTimeMillis());
		//DATA ATUAL DO SISTEMA
		Date agora = new Date();
		System.out.println(agora);
	
		Date data = new Date(1000000000000L);
		System.out.println(data);
	
		//metodos
		data.getTime();//quantidades de milisegundos
		data.setTime(1000000000000L);//definir um tempo em milisegundos
		System.out.println(data.compareTo(agora));//-1 , 0 , 1;
		
		//GregorianCalendar//
		Calendar c = Calendar.getInstance();
		c.set(1991, Calendar.DECEMBER, 14);
		//retorna um objeto do tipo date
		System.out.println(c.getTime());
		
		System.out.println(c.get(Calendar.YEAR));//ano
		System.out.println(c.get(Calendar.MONTH));//mes 0-11
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//dia do mes
		
		c.set(Calendar.YEAR, 2000);//altera o ano
		c.set(Calendar.MONTH, Calendar.MARCH);//altera o mes
		c.set(Calendar.DAY_OF_MONTH, 20);//altera o dia do mes
		System.out.println(c.getTime());
		
		//c.clear(Calendar.MINUTE);//limpa os minutos
		//c.clear(Calendar.SECOND);//limpa os segundos
		//System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 1);//alterar o dia do mes em 1 unidade
		c.add(Calendar.YEAR, 1);//add 1 dia ao ano
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_MONTH, 1);//roll nao ultrapassa a unidade de tempo maior e continua a contagem no mesmo mes
		
		//SAUDAÇAO COM BOM DIA BOA TARDE OU NOITE.
		//Calendar c1 = Calendar.getInstance();
		int hora = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora + "hs");
		if (hora <= 12) {
			System.out.println("Bom dia!");
		} else if(hora >12 && hora <18) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
		
		
		
	}

}
