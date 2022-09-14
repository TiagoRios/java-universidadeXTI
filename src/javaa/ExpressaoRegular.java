package javaa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		boolean b = "java".matches("JAVA");
		System.out.println("primeira: " +b);
		
		/*MODIFICADORES
(?i) ignora maiuscula e minuscula
(?x) comentarios
(?m) multilinhas
(?s) dottal*/
	
		b = "java".matches("(?i)java");
		System.out.println("ignorando maiusc e minusc: "+b);
	
		/*METACARACTERES
		.  	qualquer caractere
		\d  digitos       [0-9]
		\D  nao e digito  [^0-9]
		\s  espacos       [\t\n\x0B\f\r]
		\S  nao e espaço  [^\s]
		\w  letra         [a-zA-Z_0-9] 
		\W  nao e letra
		*/
		
	
		b = "232".matches("...");
		//assim tem que ser digitado muitas vezes os metacaracteres
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "12345-123".matches(cep);
		System.out.println(b);
	
		/*para ficar mais facil tem os quantificadores
		x{n}    x, extamente vezes
		x{n,}   x, pelo menos n vezes
		x{n,m}  x, pelo menos n mas nao mais que m vezes
		x?      x, 0 ou 1vez
		x*      x, 0 ou + vezes
		x+      x, 1 ou + vezes
		*/
		
		b= "71568-481".matches("\\d{5}-\\d{3}");
		b= "12/12/2012".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println("esse: " +b);
	
		
		/*METACARACTERES DE FRONTEIRA para saber se sua string ela começa ou termina com determinado padrão
		^ inicia
		$ finaliza
	    | ou 
	    */
	
		b= "muito77".matches("^muito.*");
		b= "muito77".matches(".*77$");
		//procurar uma palavra dentro de um texto
		b= "tem java aqui".matches(".*java.*");
		
		System.out.println("esse outro: " +b);
	
		/*AGRUPADORES
		[...]            agrupamento;
		[a-z]            alcance;
		[a-e][i-u]       uniao;
		[a-z&&[aeiou]]   interseçao
		[abc]            exceçao
		[a-z&&[m-p]]     subtraçao
		\x               fuga literal
		 */
		
		b= "true".matches("[tT]rue");
		b= "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}"); //verificaçao de email
		System.out.println(b);
	
		String doce = "Qual é o Doce mais doCE do que doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()){
		//System.out.println(matcher.group());	
		}
		
		/*SUBSTITUIÇOES*/
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(r);
		
		String rato = "o rato roeu a roupa do rei de roma!";
		r= rato.replaceAll("r[aeiou]" , "Hact");
		r= "tabular este texto".replaceAll("\\s", "\t");
		
		String url = "www.xti.com.br/clientes-2011.html";
					//http://www.xti.com.br/2011/clientes.jsp objetivo
		
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b= url.matches(re);
		System.out.println(b);
		
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		//http://www.xti.com.br/2011/clientes.jsp objetivo
		r = url.replaceAll(re,"http://$1/$3/$2.jsp");
		System.out.println(r);
		System.out.println(url);
	}
}
