package pruebas;

import calculadora.pojos.Calculadora;
import calculadora.utilidades.Utilidades;

public class TestUtilidades {

	public static void main(String[] args) {
		Calculadora calcu0 = new Calculadora(5,7);
		Utilidades uti0 = new Utilidades();
		System.out.println(uti0.sumar(calcu0.getN1(), calcu0.getN2()));
		
		Calculadora calc1 = new Calculadora(2,5);
		System.out.println(new Utilidades().sumar(calc1.getN1(),calc1.getN2()));
	}

}
