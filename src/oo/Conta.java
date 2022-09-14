package oo;

/*aplicaçao bancaria
 * autor Tiago R.
 *at
 */

public class Conta implements java.io.Serializable {

	/*
	 * declaraçao de atributos; essa tbm sao as variaveis;
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//PARA NAO ARMAZENAR UMA VARIAVEL DE OBJETO USA-SE A PALAVRA "transient"
	//QUANDO DEVE-SE USAR UM MODIFICADOR TRANSIENT? quando estiver serializando 
	//um ojeto que tenha a senha de um usuario do sistema ou outra informaçao que nao pode ser visualizada
	private String cliente;
	private transient double saldo;

	//CONSTRUTOR com public para poder chamar em outro lugar
	public Conta(){}
	public Conta(String cliente, double saldo){
	this.cliente = cliente;
	this.saldo = saldo;
	}
	
	
	
	public String getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	// metodo para exibir o saldo;
	public void exibeSaldo() {
		// comando que imprime o nome do cliente e saldo;
		System.out.println(cliente + " Seu saldo é: " + saldo);
	}

	// metodo para sacar dinheiro da conta com parametro;
	public void saca(double valor) {
		saldo -= valor;
	}

	// metodo com parametro "tipo valor";
	public void deposita(double valor) {
		saldo += valor;
	}

	// metodo com dois parametro
	// "conta destino para onde sera envia do o dinheiro",
	// "valor do tipo double para a outra conta".
	public void trasferePara(Conta destino, double valor) {
		//usei o this para fazer referencia a classe conta
		this.saca(valor);
		destino.deposita(valor);
	}

	// criei o metodo main para testar a classe conta.
	public static void main(String[] args) {

		// conta principal
		System.out.println("-----------------saldo Antes da transferencia");
		Conta conta = new Conta();
		conta.cliente = "joao";
		conta.saldo = 80;
		conta.exibeSaldo();

		// conta de destino.
		System.out.println("-----------------saldo Antes da transferencia");
		Conta destino = new Conta();
		destino.cliente = "esse_cara_sou_eu";
		destino.saldo = 30.00;
		destino.exibeSaldo();

		// metodo para tranferir o dinheiro da conta
		conta.trasferePara(destino, 10.00);
		System.out.println("________________saldo depois da transferencia");
		conta.exibeSaldo();
		destino.exibeSaldo();
	}
}
