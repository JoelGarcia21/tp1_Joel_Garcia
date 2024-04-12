package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

    public static void main(String[] args) {

    	//Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner sc = new Scanner(System.in);
        
        int diametro;
        boolean tieneIngredientes;
        String respuesta;

        //Ciclo for para iterar tres veces y crear tres pizzas
        for (int i=1 ; i<=3 ; i++) {
        	
        	//Solicitar al usuario que ingrese el diámetro de la pizza y validar que sea un valor válido
            do {
                System.out.println("Ingrese diámetro de la pizza (20 - 30 - 40) : ");
                diametro = sc.nextInt();
            } while (diametro != 20 && diametro != 30 && diametro != 40);

            //Solicitar al usuario que ingrese si desea ingredientes especiales y validar la respuesta
            do {
                System.out.println("¿Desea ingredientes especiales? (S/N)");
                respuesta = sc.next();
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));

            tieneIngredientes = respuesta.equalsIgnoreCase("S");
            
            //Crear un objeto Pizza
            Pizza pizza = new Pizza();

            //Establecer el diámetro y si tiene ingredientes especiales en el objeto Pizza
            pizza.setDiametro(diametro);
            pizza.tieneIngredientesEsp(tieneIngredientes);
            
            //Calcular y establecer el precio y el área de la pizza en el objeto Pizza
            pizza.setPrecio(pizza.calcularPrecio());
            pizza.setArea(pizza.calcularArea());

            //Mostrar la información de la pizza en la consola
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.tieneIngredientesEsp());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
        }
        //Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
}
