package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre de empleado: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese legajo: ");
		int legajo = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese Salario: ");
		float salario = sc.nextFloat();
		System.out.println(salario);
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		System.out.println();
		empleado.monstrarDatos();
		
		empleado.aumentarSalario();
		
		System.out.println();
		System.out.println("Salario aumentado!");
		empleado.monstrarDatos();

		sc.close();
	}

}
