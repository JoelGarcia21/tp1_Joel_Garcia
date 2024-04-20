package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] nombres =  new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for( int i=0 ; i<nombres.length ; i++ ) {
			System.out.println("Ingrese nombre: ");
			nombres[i] = sc.nextLine();
		}
		
		int j=0;
		while( j < nombres.length ) {
			System.out.println(j+": "+nombres[j]);
			j++;
		}

		System.out.println("Tamaño del array: "+nombres.length);
		
		byte borrar;
		
		do {
			System.out.println("Ingrese elemnto a eliminar (0-4): ");
			borrar = sc.nextByte();
		}while( (borrar>4) || (borrar<0) );
		
		//borra el valor
		nombres[borrar]="";
		
		//Reordena los elementos de nombre
		for( int k=0 ; k<nombres.length-1 ; k++ ) {
			if( nombres[k] == "" ) {
				nombres[k] = nombres[k+1];
				nombres[k+1] = "";
			}
		}
		
		//Muestra nuevamente el array nombres con el elemento ya eliminado
		int l=0;
		while( l < nombres.length ) {
			System.out.println(l+": "+nombres[l]);
			l++;
		}
		
		
		sc.close();
	}

}
