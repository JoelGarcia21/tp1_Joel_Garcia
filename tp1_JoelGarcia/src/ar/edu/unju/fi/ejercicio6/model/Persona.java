package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		
	}

	public Persona(int dni, String nobre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nobre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(int dni, String nobre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nobre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNobre() {
		return nombre;
	}

	public void setNobre(String nobre) {
		this.nombre = nobre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		return Period.between(this.fechaNacimiento, fechaActual).getYears();
	}
	
	public boolean esMayor() {
		return this.calcularEdad()>=18;
	}
	
	public void mostrarDatos() {
		
		System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.print("Edad: " + calcularEdad() + " años. ");
        if (esMayor()) {
        	System.out.println("Es mayor de edad.");
        }else {
        	System.out.println("No es mayor de edad.");
        }
		
	}
}
