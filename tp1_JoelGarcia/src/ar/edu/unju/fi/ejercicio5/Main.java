package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un numero entre 1-9.");
		int numero = sc.nextInt();
		
		 if (numero < 1 || numero > 10) {
	            System.out.println("El numero ingresado esta fuera del rango.");
	        } else {
	        	int i;
	        	
	        	for(i=0;i<=10;i++) {
	        		System.out.println(numero+" X "+i+" = "+numero*i);
	        	}
	        }
		sc.close();
	}

}
