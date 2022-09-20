package com.inicio.estudos.programacao.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatasTest {
	//Locale lingua (ISO 639) pais (ISO 3166)
	Locale usa;
	Locale brasil;	
	
	Calendar calendar;
	DateFormat dataFormat;
	DateFormat dataFormatLocaleUsa;
	DateFormat dataFormatLocaleBrasil;
	SimpleDateFormat simpleDateFormat;
	
	final String DIA_MES_ANO = "14/12/1999";
	final String ANO_MES_DIA = "December 14, 1999";
	
	@BeforeEach
	public void setup(){
		usa = Locale.US;
		brasil = new Locale("pt","BR");

		calendar = Calendar.getInstance();
		calendar.set(1999, Calendar.DECEMBER, 14);

		dataFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		
		dataFormatLocaleUsa = DateFormat.getDateInstance(DateFormat.LONG, usa);
		dataFormatLocaleBrasil = DateFormat.getDateInstance(DateFormat.SHORT, brasil);
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");		
	}

	@Test
	public void deveFormatarComDateFormat() {
		assertEquals(DIA_MES_ANO, dataFormat.format(calendar.getTime()));
	}
	
	@Test
	public void deveFormatarComSimpleDateFormat() {
		assertEquals(DIA_MES_ANO, simpleDateFormat.format(calendar.getTime()));
	}
	
	@Test
	public void deveUsarLocaleUsa() {
		assertEquals(ANO_MES_DIA, dataFormatLocaleUsa.format(calendar.getTime()));
	}

	@Test
	public void deveUsarLocaleBrasil() {
		assertEquals(DIA_MES_ANO, dataFormatLocaleBrasil.format(calendar.getTime()));
		//assertEquals("algo" , dataFormatLocaleBrasil.getCalendar().getTimeZone());
	} 
}
