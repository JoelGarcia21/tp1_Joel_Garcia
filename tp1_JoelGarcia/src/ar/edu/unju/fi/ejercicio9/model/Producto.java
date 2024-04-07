package ar.edu.unju.fi.ejercicio9.model;

public class Producto {

	private String nombre;
	private int codigo;
	private double precio;
	private int descuento;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public double calcularDescuento() {
		
		if (descuento > 0) {
			double descuentoAplicado = (precio * descuento) / 100.00d;
			precio = precio-descuentoAplicado;
		}
		
		return precio;
	}
	
}
