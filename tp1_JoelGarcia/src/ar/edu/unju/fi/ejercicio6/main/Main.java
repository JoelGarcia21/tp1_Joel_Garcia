package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dni;
		String nombre, provincia, fechaString;
		LocalDate fecha;
		
		// Creación de objeto utilizando constructor por defecto
		Persona persona1 = new Persona();
		
		System.out.println("Ingrese DNI: ");
		dni = sc.nextInt();
		sc.nextLine();
		persona1.setDni(dni);
		
		System.out.println("Ingrese nombre: ");
		nombre = sc.nextLine();
		persona1.setNobre(nombre);
		
		System.out.println("Ingrese fecha de nacimiento: \"AAAA-MM-DD\" ");
		fechaString = sc.nextLine();
		fecha = LocalDate.parse(fechaString);
		persona1.setFechaNacimiento(fecha);
		
		System.out.println("Ingrese provincia: ");
		provincia = sc.nextLine();
		persona1.setProvincia(provincia);
		
		System.out.println("Datos de primera persona.");
		persona1.mostrarDatos();
		System.out.println();
		
		// Creación de objeto utilizando constructor parametrizado
		System.out.println("Ingrese DNI: ");
		dni = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingrese nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Ingrese fecha de nacimiento: \"AAAA-MM-DD\" ");
		fechaString = sc.nextLine();
		fecha = LocalDate.parse(fechaString);
		
		System.out.println("Ingrese provincia: ");
		provincia = sc.nextLine();
		
		Persona persona2 = new Persona(dni, nombre, fecha, provincia);
		
		System.out.println("Datos de segunda persona.");
		persona2.mostrarDatos();
		System.out.println();
		
		// Creación de objeto utilizando constructor que inicializa provincia por defecto
		System.out.println("Ingrese DNI: ");
		dni = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingrese nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Ingrese fecha de nacimiento: \"AAAA-MM-DD\" ");
		fechaString = sc.nextLine();
		fecha = LocalDate.parse(fechaString);

		Persona persona3 = new Persona(dni, nombre, fecha);
		System.out.println("Datos de segunda persona.");
		persona3.mostrarDatos();
		
		sc.close();

	}

}
