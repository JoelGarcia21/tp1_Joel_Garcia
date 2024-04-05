package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 0 y 10:");
        int numero = sc.nextInt(); 
      
        if (numero < 0 || numero > 10) {
            System.out.println("El numero ingresado esta fuera del rango.");
        } else {
            int factorial = 1;
            int contador = 1;
            while (contador <= numero) {
                factorial = factorial * contador;
                contador++;
            }
            
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        
        sc.close();

	}

}
