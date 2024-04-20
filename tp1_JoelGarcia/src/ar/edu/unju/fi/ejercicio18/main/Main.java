package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		//Crea la lista paises y se crean los objetos del tipo Pais
		List<Pais> paises = new ArrayList<>();
		Pais pais1 = new Pais(1, "Francia");
		Pais pais2 = new Pais(2, "Estados Unidos");
		Pais pais3 = new Pais(3, "España"); 
		Pais pais4 = new Pais(4, "Italia");
		Pais pais5 = new Pais(5, "China"); 
		Pais pais6 = new Pais(6, "Japón"); 
		Pais pais7 = new Pais(7, "Reino Unido");
		Pais pais8 = new Pais(8, "Alemania");
		Pais pais9 = new Pais(9, "Tailandia");
		Pais pais10 = new Pais(10, "Australia");
		
		//añade los objetos Pais al array paises
		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);
		paises.add(pais4);
		paises.add(pais5);
		paises.add(pais6);
		paises.add(pais7);
		paises.add(pais8);
		paises.add(pais9);
		paises.add(pais10);
		
		//Crea un Scanner y int para las opciones del menu
		Scanner sc = new Scanner(System.in);
		//variable para el menu
		int opc;
		
		//Crea un objeto DestinoTuristicos y una lista para estos
		List<DestinoTuristico> destinosTuristicos =  new ArrayList<>();
		DestinoTuristico destinoTuristico = new DestinoTuristico();
		
		do {
			System.out.println("1-Dar alta destino turistico");
			System.out.println("2-Mostrar todos los destinos turisticos");
			System.out.println("3-Modificar al pais de un destino turistico");
			System.out.println("4-Elimi1nar todos los viajes turisticos");
			System.out.println("5-Eliminar un destino turistico");
			System.out.println("6-Mostrar destinos turisticos ordenados por nombre");
			System.out.println("7-Mostrar todos los paises");
			System.out.println("8-Mostrar destinos turisticos de algun pais");
			System.out.println("9-Salir");
			opc = sc.nextInt();
			sc.nextLine();
			
			if( destinosTuristicos.isEmpty() && opc != 1 ) {
				System.out.println("ERROR: no hay destinos turisticos.");
			}else {
				try {
				switch (opc) {
				case 1:
					destinoTuristico.darAltaViajeTuristico(destinosTuristicos, destinoTuristico, sc, paises);
					break;
				case 2:
					destinoTuristico.mostrarDestinosTuristicos(destinosTuristicos, destinoTuristico);
					break;
				case 3:
					destinoTuristico.modificarDestinoTuristico(destinosTuristicos, destinoTuristico, sc, paises);
					break;
				case 4: 
					destinoTuristico.aliminarTodosViajesTuristicos(destinosTuristicos, sc);
					break;
				case 5:
					destinoTuristico.eliminarUnViajeTuristico(destinosTuristicos, destinoTuristico, sc);
					break;
				case 6:
					destinoTuristico.mostrarDestinosTuristicosOrdenados(destinosTuristicos, destinoTuristico);
					break;
				case 7:
					destinoTuristico.mostrarPaises(paises);
					break;
				case 8:
					destinoTuristico.mostrarDestinoTuristicoXpais(destinosTuristicos, destinoTuristico, sc);
					break;
				case 9:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion invalida!");
				}
				}catch( java.util.InputMismatchException e ) {
					//Si ocurre algun error se captura y se limpia el buffer para evitar problemas con los scanners
					sc.nextLine(); //Limpia buffer
				}
			}
		}while ( opc != 9 );
		sc.close();
	}
	
}
