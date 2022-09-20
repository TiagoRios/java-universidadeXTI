package com.inicio.estudos.programacao.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringExpressaoRegularTest {

	String URL;
	String STRING_DOCE;
	String STRING_RATO;
	String STRING_SUBSTITUIDA_DOCE;
	String STRING_SUBSTITUIDA_RATO;
	String STRING_SUBSTITUIDA_DE_PARA;

	@BeforeEach
	public void setup(){
		URL = "www.xti.com.br/clientes-2011.html";
		STRING_DOCE = "Qual e o Doce mais doCE do que doce?";
		STRING_RATO = "O rato roeu a roupa do rei de roma!";
		STRING_SUBSTITUIDA_DOCE = "Qual e o DOCINHO mais DOCINHO do que DOCINHO?";
		STRING_SUBSTITUIDA_RATO = "O wto weu a wupa do wi de wma!"; //substituiu r[aeiou]
		STRING_SUBSTITUIDA_DE_PARA = "http://www.xti.com.br/2011/clientes.jsp";
	}

	/*MODIFICADORES
	(?i) ignora maiuscula e minuscula
	(?x) comentarios
	(?m) multilinhas
	(?s) dottal*/

	@Test
	public void deveUsarRegexSimples() {
		assertTrue("jaVa".matches("(?i)java"));
		assertFalse("java".matches("JAVA"));
	}
	
	/*METACARACTERES
	.  	qualquer caractere
	\d  digitos       [0-9]
	\D  nao e digito  [^0-9]
	\s  espacos       [\t\n\x0B\f\r]
	\S  nao e espaco  [^\s]
	\w  letra         [a-zA-Z_0-9] 
	\W  nao e letra
	*/

	@Test
	public void deveUsarMetacaracteresRegex() {
		assertTrue("232".matches("..."));
		assertTrue("232.11".matches("......"));
		assertTrue("12345-123".matches("\\d\\d\\d\\d\\d-\\d\\d\\d"));
	}
	
	/*QUANTIFICADORES
	x{n}    x, extamente vezes
	x{n,}   x, pelo menos n vezes
	x{n,m}  x, pelo menos n mas nao mais que m vezes
	x?      x, 0 ou 1vez
	x*      x, 0 ou + vezes
	x+      x, 1 ou + vezes
	*/

	@Test
	public void deveUsarQuantificadoresRegexCEP() {
		assertTrue("71568-481".matches("\\d{5}-\\d{3}"));
		assertTrue("12/12/2012".matches("\\d{2}/\\d{2}/\\d{4}"));
	}
	
	/*METACARACTERES DE FRONTEIRA
	^ inicia com
	$ finaliza com
	| ou 
	*/

	@Test
	public void deveUsarMetacaracteresFronteira() {
		assertTrue("muito77".matches("^muito.*"));
		assertTrue("muito77".matches(".*77$"));
		assertTrue("tem java aqui".matches(".*java.*"));
	}

	/*AGRUPADORES
	[...]            agrupamento;
	[a-z]            alcance;
	[a-e][i-u]       uniao;
	[a-z&&[aeiou]]   interse�ao
	[abc]            exce�ao
	[a-z&&[m-p]]     subtra�ao
	\x               fuga literal
	 */
	
	@Test
	public void deveUsarAgrupadores() {
		assertTrue("true".matches("[tT]rue"));
	}
	
	@Test
	public void deveVerificarEmail() {
		assertTrue("rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}"));
	}

	@Test
	public void deveVerificarUrl() {
		assertTrue(URL.matches("www.xti.com.br/\\w{2,}-\\d{4}.html"));
	}
	
	@Test
	public void deveUsarPattern() {
		Matcher matcher = Pattern.compile("(?i)doce").matcher(STRING_DOCE);
		assertTrue(matcher.find());
	}
	
	@Test
	public void deveUsarSubstituicao() {
		String DE = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html"; //possui 3 partes.
		String PARA = "http://$1/$3/$2.jsp"; //utiliza as 3 partes.
		assertEquals(STRING_SUBSTITUIDA_DOCE, STRING_DOCE.replaceAll("(?i)doce", "DOCINHO"));
		assertEquals(STRING_SUBSTITUIDA_RATO, STRING_RATO.replaceAll("r[aeiou]", "w"));
		assertEquals(STRING_SUBSTITUIDA_DE_PARA, URL.replaceAll(DE, PARA));
	}
}
