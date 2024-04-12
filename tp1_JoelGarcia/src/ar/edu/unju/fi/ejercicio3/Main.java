package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Crear un objeto Scanner 
        Scanner sc = new Scanner(System.in);
        
        // Solicitar un número entero
        System.out.println("Ingrese un numero entero:");
        int numero = sc.nextInt(); // lee el numero ingresado
        
        // Comprueba si el número es par o impar
        if (numero % 2 == 0) {
            int triple = numero * 3;
            System.out.println("El numero es par. El triple del numero es: " + triple);
        } else {
            int doble = numero * 2;
            System.out.println("El numero es impar. El doble del numero es: " + doble);
        }
        
        // Cerrar el Scanner para liberar recursos
        sc.close();

	}

}
