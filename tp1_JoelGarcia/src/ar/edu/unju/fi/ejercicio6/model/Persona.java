package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {

	private int dni;
	private String nobre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		System.out.println("Se creo el objeto persona.");
	}

	public Persona(int dni, String nobre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nobre = nobre;
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
		return nobre;
	}

	public void setNobre(String nobre) {
		this.nobre = nobre;
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
		
		
	}
	
	public boolean esMayor() {
		return calcularEdad >= 18;
	}
	
	
}
