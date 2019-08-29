package calculadora.pojos;

public class Calculadora {
	//atributos
	private float n1;
	private float n2;
	//constructor sin parámetros
	public Calculadora() {
		this.n1 = 0.0f;
		this.n2 = 0.0f;
	}
	//constructor con parámetros
	public Calculadora(float n1, float n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	//consultores y modificadores
	public float getN1() {
		return n1;
	}
	public float getN2() {
		return n2;
	}
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public void setN2(float n2) {
		this.n2 = n2;
	}
	//toString
	@Override
	public String toString() {
		return "Calculadora [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
}
