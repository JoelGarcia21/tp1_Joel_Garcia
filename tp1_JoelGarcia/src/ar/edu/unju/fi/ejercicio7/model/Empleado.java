package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	//atributos
	private String nombre;
	private int legajo;
	private float salario;
	
	final float SALARIO_MINIMO = 210000.00f;
	final float AUMENTO_POR_MERITOS = 20000.00f;
	
	public Empleado(String nombre, int legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		
		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void monstrarDatos() {
		
		System.out.println("Nombre del empleado: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario: "+this.salario);
	}
	
	public void aumentarSalario() {
		this.salario = this.salario+AUMENTO_POR_MERITOS;
	}
	
}
