package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		String nombre;
		Calendar fechaNacimiento = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese fecha de nacimiento (DD/MM/AAAA): ");
		String fechaString = sc.nextLine();
		
		//Encontrar posicion de las barras
		int primeraBarra = fechaString.indexOf('/');
		int segundaBarra = fechaString.lastIndexOf('/');
		
		//Extrae dia, mes y anio de fechaString
		
		int dia = Integer.parseInt(fechaString.substring(0, primeraBarra));
		int mes = Integer.parseInt(fechaString.substring(primeraBarra+1, segundaBarra));
		int anio = Integer.parseInt(fechaString.substring(segundaBarra+1));
		
		//Establece el la fecha de nacimiento
		fechaNacimiento.set(anio, mes, dia);
		
		//Crea un objeto tipo Persona con los atributos nombre y fechaNacimineto
		Persona persona = new Persona(nombre, fechaNacimiento);
		
		//Muestra los datos por pantalla
		System.out.println("Nombre: "+nombre);
		System.out.println("Fecha de nacimiento: "+dia+"/"+mes+"/"+anio);
		persona.calcularEdad();
		persona.determinarSignoZodiacal(dia, mes);
		persona.determinarEstacion(dia, mes);
		
		//Se cierra el Scanner para ahorrar recursos
		sc.close();
	}

}
