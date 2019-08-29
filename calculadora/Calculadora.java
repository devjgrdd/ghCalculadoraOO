package calculadora;

public class Calculadora {
	//atributos
	private float n1;
	private float n2;
	//constructor por defecto
	public Calculadora() {
		this.n1=0.0f;
		this.n2=0.0f;
	}
	//contructor con parámetros
	public Calculadora(float n1, float n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
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
	@Override
	public String toString() {
		return "n1="+this.n1+"\nn2="+this.n2+"\n";
	}
	
}
