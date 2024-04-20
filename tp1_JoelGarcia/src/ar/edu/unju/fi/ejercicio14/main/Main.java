package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tamanioArray;
		
		do {
			System.out.println("Ingrese tamaño del array (3-10)");
			tamanioArray = sc.nextInt();
			sc.nextLine();
		}while((tamanioArray>10) || (tamanioArray<3));
		
		int[] numeros = new int[tamanioArray];
		
		for( int i=0 ; i<numeros.length ; i++ ) {
			System.out.println("Ingrese un numero: ");
			numeros[i] = sc.nextInt();
			sc.nextLine();
		}
		
		for( int j=0 ; j<numeros.length ; j++ ) {
			System.out.println("Posicion "+j+": "+numeros[j]);
		}
		
		sc.close();

	}

}
