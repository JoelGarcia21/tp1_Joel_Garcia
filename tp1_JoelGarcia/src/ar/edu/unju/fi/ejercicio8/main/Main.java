package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario desde la consola
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		// Crear un objeto CalculadoraEspecial con el número ingresado por el usuario
		CalculadoraEspecial calculadora = new CalculadoraEspecial(numero);

		// Calcular y mostrar la sumatoria del número ingresado
		System.out.println("Sumatoria: "+calculadora.calcularSumatoria());
		
		// Calcular y mostrar el productorial del número ingresado
		System.out.println("Productorial: "+calculadora.calcularProductorial());
		
		// Cerrar el objeto Scanner para liberar recursos
		sc.close();
	}

}
