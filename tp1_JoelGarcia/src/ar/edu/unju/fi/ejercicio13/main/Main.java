package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numerosEnteros = new int[8];
		
		for ( int i=0 ; i<numerosEnteros.length ; i++) {
			System.out.println("Ingrese un numero: ");
			numerosEnteros[i] = sc.nextInt();
			sc.nextLine();
		}

		for ( int j=0 ; j<numerosEnteros.length ; j++) {
			System.out.println("Posicion "+j+": "+numerosEnteros[j]);
		}
		
		sc.close();
	}

}
