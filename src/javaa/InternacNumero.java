package javaa;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class InternacNumero {


	public static void main(String[] args) throws ParseException {
	
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));//default

		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));//formata o numero excluindo a parte fracionada
		
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));//formatar porcentagem
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));
		
		f.setMaximumFractionDigits(1);//define a quantidade de digitos na casa decimal
		System.out.println(f.format(saldo));
		
		//internacilanalização//
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));
		
		//conversao de valores//
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.parse("R$ 1.000,51"));
		
		
	}

}
