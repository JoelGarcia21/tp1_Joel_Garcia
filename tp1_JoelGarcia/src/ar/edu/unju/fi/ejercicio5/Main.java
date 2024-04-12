package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario desde la consola
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que ingrese un número entre 1 y 9
		System.out.println("Ingrese un numero entre 1-9.");
		int numero = sc.nextInt();
		
		// Verificar si el número ingresado está dentro del rango permitido (entre 1 y 9)
		 if (numero < 1 || numero > 10) {
	            System.out.println("El numero ingresado esta fuera del rango.");
	        } else {
	        	int i;
	        	 // Bucle for para calcular la tabla de multiplicar del número ingresado
	        	for(i=0;i<=10;i++) {
	        		System.out.println(numero+" X "+i+" = "+numero*i);
	        	}
	        }
		 // Cerrar el objeto Scanner para liberar recursos
		 sc.close();
	}

}
