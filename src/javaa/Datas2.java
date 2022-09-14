package javaa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {
	public static void main(String[] args) throws ParseException {
	
		Calendar c = Calendar.getInstance();
		c.set(1988, Calendar.SEPTEMBER, 2);
		Date date = c.getTime();
		System.out.println(date);
		
		//FORMATAÇAO DE DATAS//
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		//FORMATAÇAO DE TIME(horas)//
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		//FORMATAÇAO DE DATA E HORA//
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
		//ESTILOS //
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date));
		
		Date data2 = f.parse("12/12/2012");
		System.out.println(data2);
		
		//SimpleDateFormat//
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("data formatada " + sdf.format(date));
		System.out.println("data convertida " + sdf.parse("10/10/2010"));
	}

}
