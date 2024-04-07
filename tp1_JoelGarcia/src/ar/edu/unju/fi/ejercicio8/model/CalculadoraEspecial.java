package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {

	private int n;
	
	public CalculadoraEspecial() {
		
	}
	
	public CalculadoraEspecial(int n) {
		this.n=n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria() {
		double sumatoria=0d;
		
		for (int i=1 ; n>=i ; i++) {
			sumatoria = sumatoria+Math.pow((i*(i+1))/2,2);
		}
		return sumatoria;
	}
	
	public double calcularProductorial() {
		double productorial=1;
		
		for( int i=1 ; n>=i ; i++ ) {
			productorial = productorial*(i*(i+4));
			
		}
		return productorial;
		
	}
}
