package app;

import java.util.Scanner;

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
		while(continuar) {
			do {
				menu();
				opcion = sc.next().charAt(0);
			}while(opcion!='s' && opcion!='r' && opcion!='m' && opcion!='d' && opcion!='f');
			if(opcion=='f') continuar = false;
			else {
				System.out.println("Opción elegida: "+opcion);
			}
		}
	}

}
