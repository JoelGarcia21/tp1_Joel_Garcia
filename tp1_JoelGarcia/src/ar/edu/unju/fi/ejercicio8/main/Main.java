package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial(numero);

		System.out.println("Sumatoria: "+calculadora.calcularSumatoria());
		
		System.out.println("Productorial: "+calculadora.calcularProductorial());
		sc.close();
	}

}
