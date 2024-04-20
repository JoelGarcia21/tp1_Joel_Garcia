package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanioArray;
		
		do {
			System.out.println("Ingrese tamaño del array (5-10)");
			tamanioArray = sc.nextInt();
			sc.nextLine();
		}while((tamanioArray>10) || (tamanioArray<5));

		String[] nombres = new String[tamanioArray];
		
		for( int i=0 ; i<nombres.length ; i++ ) {
			System.out.println("Ingrese nombre: ");
			nombres[i] = sc.nextLine();
		}
		
		for( int j=nombres.length-1 ; j>=0 ; j-- ) {
			System.out.println("Posicion "+j+": "+nombres[j]);
		}
		
		sc.close();
	}

}
