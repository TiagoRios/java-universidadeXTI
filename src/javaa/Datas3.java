package javaa;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	/**
	 * internacionalizar as datas
	 * 
	 */
	public static void main(String[] args) {
		
		//criei o calendario
		Calendar c = Calendar.getInstance();
		//definir a data do calendario
		c.set(1990, Calendar.APRIL, 15);
		Date date = c.getTime();
		
		//Locale lingua (ISO 639) pais (ISO 3166)
		//Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt","BR");
		//Locale india = new Locale("hi","IN");
		Locale italy = new Locale("it", "IT");
		Locale usa = Locale.US;
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));//por default
		
		f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println(f.format(date)); //-brasil
	
		f = DateFormat.getDateInstance(DateFormat.FULL, italy);
		System.out.println(f.format(date)); //india
		
		f = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(f.format(date));//estados unidos
	
	
	}

}
