package pruebas;
import calculadora.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora0 = new Calculadora();
		calculadora0.setN1(5);
		calculadora0.setN2(6);
		System.out.println(calculadora0.toString());
	}

}
