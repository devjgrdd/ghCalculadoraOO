package app;

import java.util.Scanner;

import calculadora.pojos.Calculadora;
import calculadora.utilidades.Utilidades;

public class AppCalculadora {
	
	public static void menu() {
		System.out.println("\nCALCULADORA");
		System.out.println("sumar - s");
		System.out.println("restar - r");
		System.out.println("multiplicar - m");
		System.out.println("dividir - d");
		System.out.println("finalizar - f\n");
	}

	public static void main(String[] args) {
		boolean continuar = true;
		char opcion = ' ';
		Scanner sc = new Scanner(System.in);
		//Scanner sc;
		Calculadora calculadora;
		Utilidades utilidades;
		float n1,n2,res=0.0f;
		while(continuar) {
			//sc = new Scanner(System.in);
			do {
			//	sc = new Scanner(System.in);
				menu();
				opcion = sc.next().charAt(0);
			}while(opcion!='s' && opcion!='r' && opcion!='m' && opcion!='d' && opcion!='f');
			if(opcion=='f') continuar = false;
			else {
				System.out.println("n1?");
				n1=sc.nextFloat();
				System.out.println("n2?");
				n2=sc.nextFloat();
				calculadora = new Calculadora(n1,n2);
				utilidades = new Utilidades();
				switch(opcion) {
					case 's':
						res = utilidades.sumar(calculadora.getN1(),calculadora.getN2());
						break;
					case 'r':
						res = utilidades.restar(calculadora.getN1(),calculadora.getN2());
						break;
					case 'm':
						res = utilidades.multiplicar(calculadora.getN1(),calculadora.getN2());
						break;
					case 'd':
						res = utilidades.dividir(calculadora.getN1(),calculadora.getN2());
						break;
				}
				System.out.println("Resultado: "+res);
			}
			//sc.close();
		}
	}

}
