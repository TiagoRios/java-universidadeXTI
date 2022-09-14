package javaa;

public class StringToken {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//o delimitador pode ser qualquer caractere que quiser.
		String s = "XHTML; CSS; JavaScript; Jquery; Java";
		String[] tokens = s.split(" ");
		System.out.println(tokens.length + " tokens"); 
		//percorrer todos os tokens
		for (String token : tokens) {
System.out.println(token);			
		}
		
	}
}
