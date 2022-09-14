package heranca;

public class InterfaceTeste {

	public static void area(AreaCalculavel o) {
		System.out.println(o.calculaArea());
	}

	public static void volume(VolumeCalculavel o) {
		System.out.println(o.caculaVolume());
	}

	public static void main(String[] args) {

		area(new Quadrado(3));
		volume(new Cubo(2));

	}

}
