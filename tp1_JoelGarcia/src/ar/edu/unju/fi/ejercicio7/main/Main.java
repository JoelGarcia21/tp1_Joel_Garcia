package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario desde la consola
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que ingrese los datos del empleado
		System.out.println("Ingrese nombre de empleado: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese legajo: ");
		int legajo = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese Salario: ");
		float salario = sc.nextFloat();
		System.out.println(salario);
		
		// Crear un objeto Empleado con los datos ingresados por el usuario
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		// Mostrar los datos del empleado ingresado
		System.out.println();
		empleado.monstrarDatos();
		
		// Aumentar el salario del empleado
		empleado.aumentarSalario();
		
		 // Mostrar los datos del empleado con el salario aumentado
		System.out.println();
		System.out.println("Salario aumentado!");
		empleado.monstrarDatos();

		// Cerrar el objeto Scanner para liberar recursos
		sc.close();
	}

}
