package ar.edu.unju.fi.ejercicio18.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DestinoTuristico {

	private int codigo;
	private String nombre;
	private double precio;
	private Pais pais;
	private int cantidadDias;
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}

	public DestinoTuristico(int codigo, String nombre, double precio, Pais pais, int cantidadDias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantidadDias = cantidadDias;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	//Solicita al usuario colocar todos los datos para el nuevo destinoTuristico y los envia a un array
	public void darAltaViajeTuristico( List<DestinoTuristico> destinosTuristicos, DestinoTuristico destinoTuristico, Scanner sc, List<Pais> paises ) {
		DestinoTuristico nuevoDestino = new DestinoTuristico();
		try {
		System.out.println("Ingrese codigo: ");
		nuevoDestino.setCodigo(sc.nextInt()); 
		sc.nextLine();
		System.out.println("Ingrese nombre: ");
		nuevoDestino.setNombre(sc.nextLine());
		System.out.println("Ingrese precio: ");
		nuevoDestino.setPrecio(sc.nextDouble());
		
		System.out.println("Ingrese codigo de pais: ");
		System.out.println("1: Francia");
		System.out.println("2: Estados Unidos");
		System.out.println("3: España");
		System.out.println("4: Italia");
		System.out.println("5: China");
		System.out.println("6: Japón");
		System.out.println("7: Reino Unido");
		System.out.println("8: Alemania");
		System.out.println("9: Tailandia");
		System.out.println("10: Australia");
		int codigoPais = sc.nextInt();
		sc.nextLine();
	
		switch (codigoPais) {
        case 1:
            nuevoDestino.setPais(paises.get(0));
            break;
        case 2:
        	nuevoDestino.setPais(paises.get(1));
            break;
        case 3:
        	nuevoDestino.setPais(paises.get(2));
            break;
        case 4:
        	nuevoDestino.setPais(paises.get(3));
            break;
        case 5:
        	nuevoDestino.setPais(paises.get(4));
            break;
        case 6:
        	nuevoDestino.setPais(paises.get(5));
            break;
        case 7:
        	nuevoDestino.setPais(paises.get(6));
            break;
        case 8:
        	nuevoDestino.setPais(paises.get(7));
            break;
        case 9:
        	nuevoDestino.setPais(paises.get(8));
            break;
        case 10:
        	nuevoDestino.setPais(paises.get(9));
            break;
        default:
            System.out.println("Codigo de pais invalido.");
            System.out.println(); //Salto de linea
            return; // Reenvia al menu si coloca un pais fuera de rango
    }
		System.out.println("Ingrese cantidad de dias: ");
		nuevoDestino.setCantidadDias(sc.nextInt());
		sc.nextLine();
		
		destinosTuristicos.add(nuevoDestino);
		System.out.println("Nuevo destino turistico añadido!");
		System.out.println(); //salto de linea
		}catch(java.util.InputMismatchException e) {
			System.out.println("Error al ingresar datos, respete el formato.");
			System.out.println(); //salto de linea
			sc.nextLine();
		}
	} 
	
	//Muestra todos los destinosTuristicos que esten en el array
	public void mostrarDestinosTuristicos(List<DestinoTuristico> destinosTursticos, DestinoTuristico destinoTuristico) {
		System.out.println("Destinos turisticos: ");
		System.out.println();
		for( int i=0 ; i<destinosTursticos.size() ; i++ ) {
			destinoTuristico = destinosTursticos.get(i);	
			System.out.println("Codigo:  "+destinoTuristico.getCodigo());
			System.out.println("Nombre: "+destinoTuristico.getNombre());
			System.out.println("Precio: "+destinoTuristico.getPrecio()+"$");
			System.out.println("Pais: "+destinoTuristico.getPais().getNombre());
			System.out.println("Cantidad de dias: "+destinoTuristico.getCantidadDias());
			System.out.println();
		}
		
	}
	
	//Modifica el pais algun destinoTuristico por codigo
	public void modificarDestinoTuristico(List<DestinoTuristico> destinosTuristicos, DestinoTuristico destinoTuristico, Scanner sc, List<Pais> paises ){
		System.out.println("Ingrese codigo de destino turistico para editar: ");
		int codigoBuscar = sc.nextInt();
		sc.nextLine();
		
		for( int i=0 ; i<destinosTuristicos.size() ; i++ ) {
			destinoTuristico = destinosTuristicos.get(i);
			
			if( destinoTuristico.getCodigo() == codigoBuscar ) { //Si el codigo a buscar coincide con algun codigo en el array destinosTurisicos se vuelve a solicitar que ingrese los datos
				
				try {
				System.out.println("Ingrese nuevo codigo de pais: ");
				System.out.println("1: Francia");
				System.out.println("2: Estados Unidos");
				System.out.println("3: España");
				System.out.println("4: Italia");
				System.out.println("5: China");
				System.out.println("6: Japón");
				System.out.println("7: Reino Unido");
				System.out.println("8: Alemania");
				System.out.println("9: Tailandia");
				System.out.println("10: Australia");
				int codigoPais = sc.nextInt();
				sc.nextLine();
				
				switch (codigoPais) {
		        case 1:
		            destinosTuristicos.get(i).setPais(paises.get(0));
		            break;
		        case 2:
		        	 destinosTuristicos.get(i).setPais(paises.get(1));
		            break;
		        case 3:
		        	 destinosTuristicos.get(i).setPais(paises.get(2));
		            break;
		        case 4:
		        	 destinosTuristicos.get(i).setPais(paises.get(3));
		            break;
		        case 5:
		        	 destinosTuristicos.get(i).setPais(paises.get(4));
		            break;
		        case 6:
		        	 destinosTuristicos.get(i).setPais(paises.get(5));
		            break;
		        case 7:
		        	 destinosTuristicos.get(i).setPais(paises.get(6));
		            break;
		        case 8:
		        	 destinosTuristicos.get(i).setPais(paises.get(7));
		            break;
		        case 9:
		        	 destinosTuristicos.get(i).setPais(paises.get(8));
		            break;
		        case 10:
		        	 destinosTuristicos.get(i).setPais(paises.get(9));
		            break;
		        default:
		        	System.out.println("Código de país inválido.");
		            System.out.println(); //Salto de linea
		            return; // Reenvia al menu si coloca un pais fuera de rango
		    }
			}catch( java.util.InputMismatchException x ) {
				System.out.println("Error al ingresar datos, respete el formato.");
				System.out.println(); //salto de linea
				sc.nextLine(); //limpia buffer
				return; //Sale sin modificar el pais del destinoTuristico
			}
				System.out.println("Destino modificado con exito!");
				System.out.println(); //salto de linea
			}else {
				System.out.println("El destino turistico no existe!"); //Avisa que el destino no se encuentra en el array
				System.out.println(); //salto de linea
			}
		}
		
		
	}
	
//Elimina todos los objetos del array destinosTuristicos	
public void aliminarTodosViajesTuristicos(List<DestinoTuristico> destinosTuristicos, Scanner sc) {
	
	System.out.println("Seguro que quiere eliminar todos los destinos turisticos? (S/N)");
	String opcion=sc.nextLine();
	if( opcion.equalsIgnoreCase("S") ) {
		destinosTuristicos.clear();
		System.out.println("Destinos turisticos eliminados!");
		System.out.println(); //salto de linea
	}else {
		System.out.println("No se ha realizado ninguna accion");
		System.out.println(); //salto de linea
	}	
}

//Elimina un viajeRuristico del array por codigo
public void eliminarUnViajeTuristico(List<DestinoTuristico> destinosTuristicos, DestinoTuristico destinoTuristico, Scanner sc) {
	System.out.println("Ingrese codigo del viaje para eliminar: ");
	try {
	int codigoEliminar=sc.nextInt();
	sc.nextLine();
	
	 //Crea un iterador para el recorrido
	Iterator<DestinoTuristico> iterador = destinosTuristicos.iterator();
	//Recorre el array
	while( iterador.hasNext() ) {
		destinoTuristico = iterador.next();
		if( codigoEliminar == destinoTuristico.getCodigo() ) {
			iterador.remove(); //Elimina el objeto del array
			System.out.println("Destino turistico eliminado correctamente!");
			System.out.println(); //salto de linea
		}else {
			System.out.println("El destino turistico no existe!");
			System.out.println(); //salto de linea
		}
	}
	}catch( java.util.InputMismatchException e ) {
		System.out.println("Error al ingresar datos, respete el formato.");
		System.out.println(); //salto de linea
		sc.nextLine(); //limpia buffer
	}
	
}

//Muestra los pasises ordenados por nombre
public void mostrarDestinosTuristicosOrdenados(List<DestinoTuristico> destinosTuristicos, DestinoTuristico destinoTuristico) {
	//Ordena el array por nombre
	 Collections.sort(destinosTuristicos, Comparator.comparing(DestinoTuristico::getNombre));
	 System.out.println("Viajes ordenados por nombre: ");
	//Muestra el array ya ordenado por nombre
	for( DestinoTuristico destino : destinosTuristicos ) {
		System.out.println("Codigo:  "+destino.getCodigo());
		System.out.println("Nombre: "+destino.getNombre());
		System.out.println("Precio: "+destino.getPrecio()+"$");
		System.out.println("Pais: "+destino.getPais().getNombre());
		System.out.println("Cantidad de dias: "+destino.getCantidadDias());
		System.out.println();
	}
	System.out.println(); //salto de linea
}

//Muestra los paises del array paises
public void mostrarPaises(List<Pais> paises) {
	System.out.println("Paises disponibles: ");
	for( int i=0 ; i<paises.size() ; i++ ) {
		System.out.println(paises.get(i).getCodigo()+": "+paises.get(i).getNombre());
	}
	System.out.println(); //salto de linea
}

//Muestra todos los destinosTuristicos por pais
public void mostrarDestinoTuristicoXpais(List<DestinoTuristico> destinosTuristicos, DestinoTuristico destinoTuristico, Scanner sc) {
	
	System.out.println("Ingrese codigo de pais: ");
	System.out.println("1: Francia");
	System.out.println("2: Estados Unidos");
	System.out.println("3: España");
	System.out.println("4: Italia");
	System.out.println("5: China");
	System.out.println("6: Japón");
	System.out.println("7: Reino Unido");
	System.out.println("8: Alemania");
	System.out.println("9: Tailandia");
	System.out.println("10: Australia");
	try {
	int codigoPais = sc.nextInt();
	sc.nextLine();
	boolean paisEncontrado=false; // Variable para saber si existe algun viaje a ese pais
	for( int i=0 ; i<destinosTuristicos.size() ; i++ ) {
		if( codigoPais == destinosTuristicos.get(i).getPais().getCodigo() ) {
			paisEncontrado=true;
			System.out.println("Codigo: "+destinosTuristicos.get(i).getCodigo());
			System.out.println("Nombre: "+destinosTuristicos.get(i).getNombre());
			System.out.println("Precio: "+destinosTuristicos.get(i).getPrecio());
			System.out.println("Pais: "+destinosTuristicos.get(i).getPais().getNombre());
			System.out.println("Cantidad de dias: "+destinosTuristicos.get(i).getCantidadDias());
		}
	}
	
	if ( !paisEncontrado ) {
		System.out.println("No existe ningun viaje turistico a ese pais!");
	}
	
	}catch( java.util.InputMismatchException e ) {
		System.out.println("Error al ingresar datos, respete el formato.");
		System.out.println(); //salto de linea
		sc.nextLine(); //limpia buffer
	}
}

	@Override
	public String toString() {
		return "DestinoTuristico [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", pais=" + pais
				+ ", cantidadDias=" + cantidadDias + "]";
	}
	
	
	
}
