package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEsp;
	
	final double INGREDIENTES_ESPECIALES_20 = 500.00d;
	final double INGREDIENTES_ESPECIALES_30 = 750.00d;
	final double INGREDIENTES_ESPECIALES_40 = 1000.00d;
	
	//Constructor por defecto de la clase Pizza
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro2) {
		this.diametro = diametro2;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double d) {
		this.precio = d;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean tieneIngredientesEsp() {
		return ingredientesEsp;
	}
	public void tieneIngredientesEsp(boolean ingredientesEsp) {
		this.ingredientesEsp = ingredientesEsp;
	}
	
	public double calcularPrecio() {
		double precioTotal = 0;
		
		switch (this.diametro) {
		case 20:
			if ( ingredientesEsp ) {
				precioTotal = 4500+INGREDIENTES_ESPECIALES_20;
			}else {
				precioTotal = 4500;
			}
			break;
			
		case 30:
			if ( ingredientesEsp ) {
				precioTotal = 4800+INGREDIENTES_ESPECIALES_30;
			}else {
				precioTotal = 4800;
			}
			break;

		    case 40:
			if ( ingredientesEsp ) {
				precioTotal = 5500+INGREDIENTES_ESPECIALES_40;
			}else {
				precioTotal = 5500;
			}
			break;
		}
		
		return precioTotal;
	}
	
	public double calcularArea() {
		double radio = this.diametro/2.0d;
		double area = Math.PI * Math.pow(radio, 2);
		
		return area;
		
	}
	
}
