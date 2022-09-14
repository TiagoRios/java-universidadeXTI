package logica;
/* 
 * calcular o IMC
 * IMC = pesoEmQuilogramas / ()
 */
import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {

	String peso = JOptionPane.showInputDialog("qual seu peso em Quilogramas?");
    String altura = JOptionPane.showInputDialog("qual sua altura em metros ?");
	
    double pesoEmQuilogramas = Double.parseDouble(peso);
    double alturaEmMetros = Double.parseDouble(altura);
    double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

    String msg =(imc >= 20 && imc <= 25 ) ? "peso ideal":"fora do peso ideal";
    msg = "IMC = "  + imc +"\n" + msg;
	JOptionPane.showMessageDialog(null, msg);
System.out.println("IMC = "  + imc);
System.out.println(msg);

}
}