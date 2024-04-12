package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diametro;
        boolean tieneIngredientes;
        String respuesta;

        for (int i=1 ; i<=3 ; i++) {

            do {
                System.out.println("Ingrese diámetro de la pizza (20 - 30 - 40) : ");
                diametro = sc.nextInt();
            } while (diametro != 20 && diametro != 30 && diametro != 40);

            do {
                System.out.println("¿Desea ingredientes especiales? (S/N)");
                respuesta = sc.next();
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));

            tieneIngredientes = respuesta.equalsIgnoreCase("S");

            Pizza pizza = new Pizza();

            pizza.setDiametro(diametro);
            pizza.tieneIngredientesEsp(tieneIngredientes);
            pizza.setPrecio(pizza.calcularPrecio());
            pizza.setArea(pizza.calcularArea());

            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.tieneIngredientesEsp());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
        }

        sc.close();
    }
}
