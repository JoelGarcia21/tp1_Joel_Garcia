package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Jugador {

	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private byte posicion;
	
	public Jugador() {
	}
	
	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, double estatura,
			double peso, byte posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(byte posicion) {
		this.posicion = posicion;
	}
	
	public int calcularEdad( LocalDate fechaNacimiento ) {
		int edad;
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		edad = periodo.getYears();
		return edad;
	}
	
	public void darAltaJugador(Jugador jugador, List<Jugador> jugadores, Scanner sc ) {
		Jugador nuevoJugador = new Jugador();
		
		try {
		System.out.println("Ingrese nombre: ");
		nuevoJugador.nombre = sc.nextLine();
		System.out.println("Ingrese apellido: ");
		nuevoJugador.apellido = sc.nextLine();
		System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
		String fechaString = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		nuevoJugador.fechaNacimiento = LocalDate.parse(fechaString, formatter);
		System.out.println("Ingrese nacionalidad: ");
		nuevoJugador.nacionalidad = sc.nextLine();
		System.out.println("Ingrese estatura (metros): ");
		nuevoJugador.estatura = sc.nextDouble();
		System.out.println("Ingrese peso (kilogramo): ");
		nuevoJugador.peso= sc.nextDouble();
		System.out.println("Ingrese posicion: ");
		System.out.println("1: Delantero 2:Medio 3:Defensa 4:arquero");
		nuevoJugador.posicion = sc.nextByte();
		jugadores.add(nuevoJugador);
		System.out.println("Nuevo jugador añadido!");
		} catch ( java.util.InputMismatchException e ) {
			System.out.println("Error al ingresar los datos del jugador, recuerde respetar el formato. ");
			sc.nextLine(); //limpia buffer
		}catch ( java.time.format.DateTimeParseException e) {
		    System.out.println("Error al ingresar la fecha de nacimiento, recuerte respetar el formato ");
		}
		System.out.println();
		
	}

	public void mostrarDatosJugador(Jugador jugador, List<Jugador> jugadores, Scanner sc ) {
		
		//Define formato de fecha
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMyyyy");
		
		boolean jugadorExiste = false;
		
		try {
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		for ( int i=0 ; i<jugadores.size() ; i++ ) {
			jugador = jugadores.get(i);
			if (( jugador.getNombre().equalsIgnoreCase(nombre)) && (jugador.getApellido().equalsIgnoreCase(apellido)) ) {
				jugadorExiste = true;
				System.out.println("Datos de: "+nombre+" "+apellido);
				System.out.println("Nombre: "+jugador.getNombre());
				System.out.println("Apellido: "+jugador.getApellido());
				// Formatear y mostrar la fecha de nacimiento
				String fechaFormateada = jugador.getFechaNacimiento().format(formatter);
				System.out.println("Fecha de nacimiento: "+fechaFormateada);
				
				System.out.println("Edad:"+ calcularEdad(jugador.getFechaNacimiento()));
				System.out.println("Nacionalidad: "+jugador.getNacionalidad());
				System.out.println("Estatura: "+jugador.getEstatura()+"m");
				System.out.println("Peso: "+jugador.getPeso()+"kg");
				switch (jugador.getPosicion()) {
				case 1:
					System.out.println("Posicion: Delantero");
					break;
				case 2: 
					System.out.println("Posicion: Medio");
					break;
				case 3:
					System.out.println("Posicion: Defensa");
					break;
				case 4:
					System.out.println("Posicion: Arquero");
					break;
				}
			}
		}
		if ( !jugadorExiste ) {
			System.out.println("Jugador no encontrado");
		}
		} catch (Exception e) {
			System.out.println("Error al mostrar datos del jugador ");
		}
		System.out.println(); //salto de linea
		
	}
	
	public void mostrarJugadoresOrdenados(Jugador jugador, List<Jugador> jugadores) {
		//Define formato de fecha
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMyyyy");
				
		//Ordena el arraylist por apellidos
		Collections.sort(jugadores, Comparator.comparing(Jugador::getApellido));
		System.out.println("Jugadores ordenados por apellido: ");
		for(int i=0 ;  i<jugadores.size() ; i++) {
			jugador = jugadores.get(i);
			System.out.println("Nombre: "+jugador.getNombre());
			System.out.println("Apellido: "+jugador.getApellido());
			// Formatear y mostrar la fecha de nacimiento
			String fechaFormateada = jugador.getFechaNacimiento().format(formatter);
			System.out.println("Fecha de nacimiento: "+fechaFormateada);
			
			System.out.println("Edad:"+ calcularEdad(jugador.getFechaNacimiento()));
			System.out.println("Nacionalidad: "+jugador.getNacionalidad());
			System.out.println("Estatura: "+jugador.getEstatura()+"m");
			System.out.println("Peso: "+jugador.getPeso()+"kg");
			switch (jugador.getPosicion()) {
			case 1:
				System.out.println("Posicion: Delantero");
				break;
			case 2: 
				System.out.println("Posicion: Medio");
				break;
			case 3:
				System.out.println("Posicion: Defensa");
				break;
			case 4:
				System.out.println("Posicion: Arquero");
				break;
			}
			System.out.println(); //salto de linea
		}
	}
	
	public void modificarJugador( Jugador jugador, List<Jugador> jugadores, Scanner sc ) {
		//Obtiene nombre y apellido para buscar y editar
		System.out.println("Ingrese nombre del jugador para editar: ");
		String nombreEditar = sc.nextLine();
		System.out.println("Ingrese el apellido del jugador para editar: ");
		String apellidoEditar = sc.nextLine();
		
		Jugador jugadorEditar = null;
		try {
		//Busca el nombre del jugador para editar
		for( int i=0 ; i<jugadores.size() ; i++) {
			jugador = jugadores.get(i);
			if (( jugador.getNombre().equalsIgnoreCase(nombreEditar)) && (jugador.getApellido().equalsIgnoreCase(apellidoEditar)) ) {
				jugadorEditar = jugador;
			}
		}
		
		//Verifica si encontro al jugador
		if (jugadorEditar != null) {
			System.out.println("Ingrese nuevo nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Ingrese nuevo apellido: ");
			String apellido = sc.nextLine();
			System.out.println("Ingrese nueva fecha de nacimiento (dd/MM/yyyy): ");
			String fechaString = sc.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fecha = LocalDate.parse(fechaString, formatter);
			System.out.println("Ingrese nueva nacionalidad: ");
			String nacionalidad = sc.nextLine();
			System.out.println("Ingrese nueva estatura (metros): ");
			double estatura = sc.nextDouble();
			System.out.println("Ingrese nuevo peso (kilogramos): ");
			double peso= sc.nextDouble();
			System.out.println("Ingrese nueva posicion: ");
			System.out.println("1: Delantero 2:Medio 3:Defensa 4:arquero");
			byte posicion = sc.nextByte();
			sc.nextLine();
			
			//Crea un nuevo objeto Jugador con los atributos editados
			Jugador jugadorEditado = new Jugador(nombre, apellido, fecha, nacionalidad, estatura, peso, posicion);
			
			//Busca el indice de jugador a editar
			int indiceEditar = jugadores.indexOf(jugadorEditar);
			
			//Reemplaza el jugador original con el jugador editado
			jugadores.set(indiceEditar, jugadorEditado);
			
			System.out.println("Jugador editado con exito!");
			
		}else {
			System.out.println("Jugador no encontrado!");
		}
		
		System.out.println();
		} catch ( java.time.format.DateTimeParseException e) {
		    System.out.println("Error al ingresar la fecha de nacimiento, recuerde respetar el formato ");
		}catch ( java.util.InputMismatchException e ) {
			System.out.println("Error al ingresar los datos del jugador, recuerde respetar el formato. ");
			sc.nextLine(); //limpia buffer
		}
	}
	
		public void eliminarJugador( Jugador jugador, List<Jugador> jugadores, Scanner sc ) {
			boolean jugadorEncontrado=false;
			// Obtener el nombre y apellido del jugador a eliminar desde la consola
	        System.out.println("Ingrese el nombre del jugador que desea eliminar:");
	        String nombreEliminar = sc.nextLine();
	        System.out.println("Ingrese el apellido del jugador que desea eliminar:");
	        String apellidoEliminar = sc.nextLine();
	        try {
	        // Crear un Iterator para recorrer el ArrayList
	        Iterator<Jugador> iterator = jugadores.iterator();
			
	        while (iterator.hasNext()) {
	            jugador  = iterator.next();
	            // Verificar si el jugador actual coincide con el nombre y apellido ingresados
	            if (jugador.getNombre().equalsIgnoreCase(nombreEliminar) && jugador.getApellido().equalsIgnoreCase(apellidoEliminar)) {
	            	jugadorEncontrado=true;
	                // Eliminar el jugador actual utilizando el Iterator
	                iterator.remove();
	                System.out.println("El jugador ha sido eliminado.");
	            }
	        }
	        if ( !jugadorEncontrado ) {
	        	System.out.println("Jugador no encontrado!");
	        }
	        System.out.println();
	        }catch ( Exception e ) {
	        	System.out.println("Error al eliminar el jugador: " + e.getMessage());
	        }
	        }
	
	
	public void mostrarCantidadTotalJugadores( List<Jugador> jugadores ) {
		System.out.println("Cantidad total de jugadores: "+jugadores.size());
		System.out.println();
	}

	public void mostrarCantidadJugadoresNacionalidad( Jugador jugador, List<Jugador> jugadores, Scanner sc ) {
		System.out.println("Ingrese nacionalidad: ");
		String nacionalidadBuscar = sc.nextLine();
		byte contador=0;
		for ( int i=0 ; i<jugadores.size() ; i++ ) {
			jugador = jugadores.get(i);
			
			if( jugador.getNacionalidad().equalsIgnoreCase(nacionalidadBuscar) ) {
				contador++;
			}
		}
		if ( contador != 0 ) {
			System.out.println("Cantidad de jugadores "+nacionalidadBuscar+": "+contador);
		}else {
			System.out.println("No se han encontrado jugadores "+nacionalidadBuscar);
		}
		System.out.println();
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + "]";
	}
	
}
