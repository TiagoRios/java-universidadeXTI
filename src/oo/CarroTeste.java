package oo;

public class CarroTeste {

	public static void main(String[] args) {

		Carro ferrari = new Carro("besteira", 432, 516);
		ferrari.modelo = "Ferrari enzo";
		ferrari.velocidadeMaxima = 348;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "v12";
		v12.potencia = 660;
		ferrari.motor = v12;

		Carro k = new Carro("koenigsegg CCX", 430, 3.1);
		Motor v8 = new Motor("v8", 1018);
		k.motor = v8;
		Carro bugatti = new Carro("bugatti veyron", 433, 2.2, new Motor("w12",
				980));

		System.out.println(ferrari.modelo + " " + ferrari.velocidadeMaxima
				+ " " + ferrari.segundosZeroACem);
		System.out.println("marca " + k.modelo + " velocidade "
				+ k.velocidadeMaxima + " segundos por hora "
				+ k.segundosZeroACem + " potencia " + k.motor.potencia);
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);

	}

}
