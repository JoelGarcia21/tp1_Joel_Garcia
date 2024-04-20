package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate; // Como los jugadores de muestra no estan habilitaros dice que LocalDate no se esta utilizando
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		int opc;
		
		Jugador jugador = new Jugador();
		List<Jugador> jugadores = new ArrayList<>();
		//Jugadores de muestra
		Jugador jugador2 = new Jugador("Jose", "Miranda", LocalDate.of(2002, 7, 3) , "Estado unidense", 189d, 80d, (byte)2);
		Jugador jugador3 = new Jugador("Yuki", "Watanabe", LocalDate.of(1996, 9, 21) , "Japones", 170d, 66d, (byte)1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Ingrese una opcion: ");
			System.out.println("1-Dar de Alta a jugador");
			System.out.println("2-Mostrar datos de un jugador");
			System.out.println("3-Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4-Modificar los datos de un jugador");
			System.out.println("5-Eliminar un jugador");
			System.out.println("6-Mostrar cantidad total de jugadores");
			System.out.println("7-Mostrar cantidad de jugadores por nacionalidad");
			System.out.println("8-Salir");
			opc = sc.nextInt();
			sc.nextLine();
			
			if( jugadores.isEmpty() && opc!=1 ){
				System.out.println("ERROR: la lista de jugadores esta vacia.");
			}else {
				
				switch (opc) {
	             case 1: 
	                 jugador.darAltaJugador(jugador, jugadores, sc);
	                 break;
	             case 2:
	            	 jugador.mostrarDatosJugador(jugador, jugadores, sc);
	                 break;
	             case 3:
	                 jugador.mostrarJugadoresOrdenados(jugador, jugadores);
	                 break;
	             case 4:
	            	 jugador.modificarJugador(jugador, jugadores, sc);
	                 break;
	             case 5:
	                 jugador.eliminarJugador(jugador, jugadores, sc);
	                 break;
	             case 6:
	                 jugador.mostrarCantidadTotalJugadores(jugadores);
	                 break;
	            case 7:
	                 jugador.mostrarCantidadJugadoresNacionalidad(jugador, jugadores, sc);
	                 break;
	             case 8:
	                 System.out.println("Saliendo...");
	                 break;
	             default:
	                 System.out.println("Opcion invalida");
	         }
					}
			
			}while( opc!=8 );
		sc.close();

	}

}
