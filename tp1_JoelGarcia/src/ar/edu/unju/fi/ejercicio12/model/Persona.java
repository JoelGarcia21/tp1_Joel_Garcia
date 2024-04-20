package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {

	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Calendar fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void calcularEdad() {
		
		Calendar fechaActual = Calendar.getInstance();
		
		//Calcula la edad
		int edad = fechaActual.get(Calendar.YEAR)-fechaNacimiento.get(Calendar.YEAR);
		
		//Comprueba si cumplio años
		if ( fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
			//Resta un año si la fecha actual es menor a la de nacimiento
			edad--;
		}
		System.out.println("Edad: "+edad+" años");
	}
	
	public void determinarSignoZodiacal(int dia, int mes) {
		
		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
	        System.out.println("Signo del zodiaco: Aries");
	    } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
	        System.out.println("Signo del zodiaco: Tauro");
	    } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
	        System.out.println("Signo del zodiaco: Géminis");
	    } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
	        System.out.println("Signo del zodiaco: Cáncer");
	    } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	        System.out.println("Signo del zodiaco: Leo");
	    } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	        System.out.println("Signo del zodiaco: Virgo");
	    } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
	        System.out.println("Signo del zodiaco: Libra");
	    } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
	        System.out.println("Signo del zodiaco: Escorpio");
	    } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
	        System.out.println("Signo del zodiaco: Sagitario");
	    } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
	        System.out.println("Signo del zodiaco: Capricornio");
	    } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	        System.out.println("Signo del zodiaco: Acuario");
	    } else {
	        System.out.println("Signo del zodiaco: Piscis");
	    }
	}

	public void determinarEstacion(int dia, int mes) {
		
		if ( mes==3 && dia>=21 || mes==4 || mes==5 || mes==6 && dia<=20) {
			System.out.println("Estacion: Otoño");
		}else {
			if ( mes==6 && dia>=21 || mes==7 || mes==8 || mes==9 && dia<=20 ) {
				System.out.println("Estacion: Invierno");
			}else {
				if ( mes==9 && dia>=21 || mes==10 || mes==11 || mes==12 && dia<=20) {
					System.out.println("Estacion: Primavera");
				}else {
					System.out.println("Estacion: Verano");
				}
			}
		}
		
	}

	
}
