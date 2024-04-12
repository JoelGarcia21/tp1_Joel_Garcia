package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {

		// Crear un objeto Scanner para leer la entrada del usuario desde la consola
		Scanner sc = new Scanner(System.in);
		
	    // Bucle para solicitar los datos de tres productos		
		for( int i=1 ; i<=3 ; i++) {
			
			// Solicitar al usuario que ingrese los datos para el producto
			System.out.println("Ingrese los datos para el producto " + i + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Código: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            System.out.print("Descuento (0-50): ");
            int descuento = sc.nextInt();
            sc.nextLine();
            
         // Crear un objeto Producto con los datos ingresados
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            producto.setPrecio(precio);
            producto.setDescuento(descuento);
			
         // Mostrar los datos ingresados
            System.out.println("Datos del producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: " + producto.calcularDescuento());
            System.out.println();
		}

		sc.close();
	}

}
