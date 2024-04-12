package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner sc = new Scanner(System.in);
        
     // Solicitar al usuario que ingrese un número entre 0 y 10
        System.out.println("Ingrese un numero entre 0 y 10:");
        int numero = sc.nextInt(); // Leer el número ingresado por el usuario

        // Verificar si el número ingresado está dentro del rango permitido (entre 0 y 10)
        if (numero < 0 || numero > 10) { 
            System.out.println("El numero ingresado esta fuera del rango.");
        } else { //
            int factorial = 1; 
            int contador = 1; 

            // Calcular el factorial del número ingresado.
            while (contador <= numero) { 
                factorial = factorial * contador; 
                contador++;
            }

            // Mostrar el resultado del factorial del número ingresado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        // Cerrar el objeto Scanner para liberar recursos
        sc.close();

	}

}
